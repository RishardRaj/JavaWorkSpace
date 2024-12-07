var server = require('webserver').create();

var reportPage = require('webpage').create();

var fileSystem = require('fs');

var service = server.listen(3000, function (request, response) {
	 response.statusCode = 200;
     response.headers = {
                'Cache': 'no-cache',
                'Content-Type': 'text/plain;charset=utf-8'
            };
			console.log("request "+JSON.stringify(request));
			var requestData = {
				url: request.headers.url,
				jsonFileName: request.headers.jsonFileName,
				formatArray:request.headers.formatArray,
				domain:request.headers.domain,
				j_username:request.headers.j_username,
				j_password:request.headers.j_password,
				j_organization:request.headers.j_organization
				}
          var filename=getFileName(requestData);
		   response.write(filename);
		   //response.write("Test");
            response.close();
});



function getPrintSettings(jsonFileName) {
	console.log("getPrintSettings");
    var fileContent = JSON.parse(fileSystem.read(jsonFileName));
	console.log("fileContent"+fileContent);
    printSettings = fileContent.body;
    return printSettings;
}










function getFileName(request){
console.log("getFileName");
var timeStart = Date.now();

var url =atob(request.url);
//var file =  request.file;

var domain = request.domain;
var url=request.url;

var jsonFileName = request.jsonFileName;

//var reportDirectory = request.reportDirectory;
var formatArray =  request.formatArray.split(",");
console.log("getFileName----");
var resourceWait = 300, maxRenderWait = 15000, count = 0, forcedRenderTimeout, renderTimeout;

var baseUrl = "";
var printSettings = getPrintSettings(jsonFileName);

inJectScript(jsonFileName);

handleViewPort(printSettings);


if (domain) {
    var loginPage = require('webpage').create();
	console.log("login page");
    loginPage.open(getLoginUrl(request), function (loginStatus) {
        if (loginStatus !== "success") {
			console.log("Fatal Error. Couldn't login to get the report screen-shot.");
            phantom.exit(1);
        } else {
            saveReport(request,maxRenderWait);
        }
    });
} else {
    saveReport(request,maxRenderWait);
}


reportPage.onResourceRequested = function (request) {
    count += 1;
    clearTimeout(renderTimeout);
};

reportPage.onResourceReceived = function (response) {
    if (!response.stage || response.stage === 'end') {
        count -= 1;
        if (count === 0) {
                  console.log("do render called")
            renderTimeout = setTimeout(doRender(request), (resourceWait + 5000)); //5 second extra time to render animated charts
        }
    }
};
}
function inJectScript(jsonFileName) {
    if (printSettings.hasScript) {
        console.log("setting has scripts");
        var injectScript = jsonFileName.substr(0, jsonFileName.lastIndexOf(".")) + ".js";
        phantom.injectJs(injectScript);
    }
}


function handleViewPort(printSettings) {
	console.log("handleViewPort");
    var width = printSettings.viewPortWidth||1366;
    var height = printSettings.viewPortHeight||768;
    reportPage.viewportSize = { width: width, height: height };
    console.log("View port is set  to ",reportPage.viewportSize.width);
    console.log("View port is set  to ",reportPage.viewportSize.height);
    reportPage.settings.localToRemoteUrlAccessEnabled = true;
    reportPage.settings.webSecurityEnabled = false;
}

function footerMessage(pageNum, numPages) {
    if(printSettings.footer){
        var fontColor = printSettings.footer.fontColor||"black";
        var fontStyle =printSettings.footer.fontStyle||"bold";
        var fontSize = printSettings.footer.fontSize||"12px";
        var textAlign = printSettings.footer.textAlign||"center";
        var text = printSettings.footer.text||"";
        return "<div style='color:"+ fontColor+";font-weight:"+ fontStyle+";font-size:"+ fontSize+"'><span style='text-align:"+ textAlign+";padding:1px'>"+ text+"</span><span style='float:right'>Page " + pageNum + " of " + numPages + "</span></div>";
    }
    return "<div style='text-shadow:1px 2px 1px rgba(198,184,255,1);font-weight:bold;color:#498FDE;font-size:8px'><span style='text-align:left;padding:1px'>Printed using Helical Insight</span><span style='float:right'>Page " + pageNum + " of " + numPages + "</span></div>";
}



function headerMessage(pageNum, numPages) {
    if(printSettings.header){
        var fontColor = printSettings.header.fontColor||"black";
        var fontStyle =printSettings.header.fontStyle||"bold";
        var fontSize = printSettings.header.fontSize||"12px";
        var textAlign = printSettings.header.textAlign||"center";
        var text = printSettings.header.text||"";
        return "<div style='color:"+ fontColor+";font-weight:"+ fontStyle+";font-size:"+ fontSize+"'><span style='text-align:"+ textAlign+";padding:1px'>"+ text+"</span><span style='float:right'>Page " + pageNum + " of " + numPages + "</span></div>";
    }
    return "<div style='text-shadow:1px 2px 1px rgba(198,184,255,1);font-weight:bold;color:#498FDE;font-size:8px'><span style='text-align:left;padding:1px'>Printed using Helical Insight</span><span style='float:right'>Page " + pageNum + " of " + numPages + "</span></div>";
}

function pageHeightWidth() {
    var width = printSettings.paperWidth;
    var height = printSettings.paperHeight;
    reportPage.paperSize = {
        width: width,
        height: height,
        margin: printSettings.margin || "1cm",
        footer: {
            height: "0.5cm",
            contents: phantom.callback(function (pageNum, numPages) {
                return footerMessage(pageNum, numPages);
            })
        },
        header: {
            height: "0.5cm",
            contents: phantom.callback(function(pageNum, numPages) {
                return headerMessage(pageNum, numPages);
            })
        }
    };
}

function pageLayout() {
    reportPage.paperSize = {
        format: printSettings.paperSize || "A4",
        orientation: printSettings.layout || "landscape",
        margin: printSettings.margin || "1cm",
        footer: {
            height: "0.5cm",
            contents: phantom.callback(function (pageNum, numPages) {
                return  footerMessage(pageNum, numPages);
            })
        },
        header: {
            height: "0.5cm",
            contents: phantom.callback(function (pageNum, numPages) {
                return  headerMessage(pageNum, numPages);
            })
        }
    };
}

function handlePageLayout() {
    if (printSettings.paperWidth && printSettings.paperHeight) {
        pageHeightWidth();

    } else {

        pageLayout();
    }
}

function handleZoomFactor() {
    if (printSettings.scaling) {
        reportPage.zoomFactor = printSettings.scaling;
    }else{
        reportPage.zoomFactor = "1";
    }
}

function handleScroll() {
    if (printSettings.scrollPosition) {
        reportPage.scrollPosition = {
            top: printSettings.scrollPosition.top || "0px",
            left: printSettings.scrollPosition.left || "0px"
        };
    }
}


function isExcel() {

    return arrayContains("xls", formatArray) || arrayContains("xlsx", formatArray);

}


function evalFrameCount() {
    return reportPage.evaluate(function () {
        var gridStackWrappers = $(".grid-stack-wrapper");
        return gridStackWrappers.length;
    });
}

function getUrlParameter(url,sParam) {
    var sPageURL = url,
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
};

function createExcelWithServiceApi(totalFrames) {
	var url1 = decodeURIComponent(window.atob(system.args[1]));
	var authToken = getUrlParameter(url1,'authToken');
	
    var excelRequest = require('webpage').create();
    var jsForm = {};
    var actual = [];
    for (var i = 0; i < totalFrames; i++) {
        var boundClip = reportPage.evaluate(function (d) {
            return document.getElementsByClassName("grid-stack-wrapper")[d].getBoundingClientRect();
        }, i);

        reportPage.clipRect = {
            top: boundClip.top,
            left: boundClip.left,
            width: boundClip.width,
            height: boundClip.height
        };

        var newFileName = file + "_" + i + '.png';
        boundClip.index = newFileName;
        actual.push(boundClip);
        reportPage.render(newFileName);
    }
    jsForm.report = actual;
    var jsonFile = file+'.json';
    jsForm.destinationFile = file+".xls";
    fileSystem.write(jsonFile, JSON.stringify(jsForm), 'w');
    if(authToken !== undefined){
		var downloadToExcel = baseUrl + 'services?' + 'authToken='+authToken+'&type=print&serviceType=export&service=xls&formData={"targetJson":"' + (jsonFile.replace(/\\/g, "\\\\")) + '"}'
    }else{
		var downloadToExcel = baseUrl + 'services?type=print&serviceType=export&service=xls&formData={"targetJson":"' + (jsonFile.replace(/\\/g, "\\\\")) + '"}'
    }
    	excelRequest.open(downloadToExcel, function (status) {
        if (status !== "success") {
            console.log("Fatal Error. Could not open web page : " + url);
            createExcelWithContent();
            return;
        } else {
            while (!fileSystem.path(file)) {

                console.log("Waiting for excel");
            }
        }
    });
}
function handleExcel() {
    var totalFrames = evalFrameCount();

    console.log("totalFrames ", totalFrames);

    if (!totalFrames) {
        createExcelWithContent();
    } else {

        createExcelWithServiceApi(totalFrames);
    }
}

function createExcelWithContent() {
    var header = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><meta http-equiv=Content-Type content="text/html; charset=UTF-8"><!--[if gte mso 9]><xml> <x:ExcelWorkbook>  <x:ExcelWorksheets>   <x:ExcelWorksheet>    <x:Name>###sheetname###</x:Name>    <x:WorksheetOptions>     <x:ProtectContents>False</x:ProtectContents>     <x:ProtectObjects>False</x:ProtectObjects>     <x:ProtectScenarios>False</x:ProtectScenarios>    </x:WorksheetOptions>   </x:ExcelWorksheet>  </x:ExcelWorksheets>  <x:ProtectStructure>False</x:ProtectStructure>  <x:ProtectWindows>False</x:ProtectWindows> </x:ExcelWorkbook></xml><![endif]-->';
    var chartElement = reportPage.evaluate(function () {
        return document.getElementById('dashboard-canvas');
    });
    if (chartElement) {
        reportPage.evaluate(function () {
            var chartElem = document.getElementById('dashboard-canvas');
            document.body.innerHTML = "";
            document.body.appendChild(chartElem);
        });
    }

    /*remove the error panel and updating panel */

    reportPage.evaluate(function () {
        var element = document.getElementById('error-panel');
        if (element) {
            element.parentNode.removeChild(element);
        }
        element = document.getElementById('hdi-blockUI');
        if (element) {
            element.parentNode.removeChild(element);
        }


    });

	/*var abc = reportPage.evaluate(function(){
		var chart =  document.getElementById("chart");
		return chart;
	})*/
	reportPage.evaluate(function(){
				var chart2 =  document.getElementById("chart");
				document.body.innerHTML="";

				var test = document.body.innerHTML += "<div id='main'><div id='chart' style='display: none;'><table id='chart'>"+chart2.innerHTML+"<table></div></div>";

var elements = document.getElementsByClassName('pvtUnused');
var elements1 = document.getElementsByClassName('hi-pvtAxisContainer');

while(elements.length > 0){
    elements[0].parentNode.removeChild(elements[0]);
}

while(elements1.length > 0){
    elements1[0].parentNode.removeChild(elements1[0]);
}

});



    /*remove the error panel and updating panel*/
    var SELECT_REGEX = /<select\b[^<]*(?:(?!<\/select>)<[^<]*)*<\/select>/gi;
    var SCRIPT_REGEX = /<script\b[^<]*(?:(?!<\/script>)<[^<]*)*<\/script>/gi;
    var pageContent = reportPage.content.replace(SCRIPT_REGEX, "").replace(SELECT_REGEX, "");






    console.log("---------------------------------------------------------------------------------");
   console.log(reportPage.content);
console.log("---------------------------------------------------------------------------------");
console.log(pageContent);
    fileSystem.write(file + ".xls", (header + pageContent.substring(pageContent.indexOf('<head>') + 6)), 'w');
}


function doLogout() {
    var logoutPage = require('webpage').create();
    logoutPage.open(domain.substr(0, domain.lastIndexOf('/')) + '/j_spring_security_logout');
    logoutPage.close();
}
function printStats() {
    console.log("The web page " + url + " screen-shot is taken successfully. Export Manager is exiting.");
    console.log("Time taken to print " + (Date.now() - timeStart) + "ms ");
    console.log(JSON.stringify(printSettings));
}

function arrayContains(item, arrayElement) {
    return (arrayElement.indexOf(item) > -1);
}

function getLoginUrl(request) {
	console.log("getLoginUrl");
    var loginUrl,
        username=request.j_username;
        passCode=request.j_password;
		organization=request.j_organization;
    if (organization && organization != "\"\"") {
        loginUrl = request.domain + "?j_organization=" + organization + "&j_username=" + username + "&j_password=" + passCode;
		console.log("-------------------");
    } else {
        loginUrl = request.domain + "?j_username=" + username + "&j_password=" + passCode;
		console.log("==================");
    }
    console.log("Login url is "+loginUrl);
    return loginUrl;
}


function removeCacheToolBar() {
    reportPage.evaluate(function () {
        $('#hi-cacheToolbar').remove();
        $('#strechy-nav').remove();
        $('.cache-footer').remove();
    });
}
function handleOtherFormats() {
    fileSystem.write(file + ".html", reportPage.content, 'w');
    for (i = 0; i < formatArray.length; i++) {
        reportPage.render(file + "." + formatArray[i]);
    }
    reportPage.close();
}
function pageHasJquery() {
    return reportPage.evaluate(function () {
        return window.jQuery === undefined;
    });
}
function getBaseUrl(request) {
	console.log("Requset "+request);
	var baseUrl=request.domain();
	
	console.log("path "+baseUrl.substring(0,baseUrl.lastIndexOf("/")));
    return reportPage.evaluate(baseUrl,function () {
		console.log("baseURL"+baseUrl);
		return baseUrl.substring(0,baseUrl.lastIndexOf("/"));
    });
}
function injectJqueryIfAbsent(noJquery) {
	var jqueryPath = baseUrl + "/js/vendors/jquery.js";
    console.log("The jquery url  " + !noJquery);
    if (noJquery) {
        reportPage.inject(jqueryPath);
    }
}
function doRender(request) {


    var noJquery = pageHasJquery();
	console.log("inside doRender");
    baseUrl = getBaseUrl(request);

    injectJqueryIfAbsent(noJquery);

    removeCacheToolBar();

    if(printSettings.hasScript)  doExecute();

    handlePageLayout();

    handleZoomFactor();

    handleScroll();


    if (isExcel()) {
        handleExcel();
    } else {
        handleOtherFormats();
    }
    doLogout();
    printStats();

    //##( is the pattern to identify the file name
    //Any kind of file naming operation has to be perforemed here
    console.log("##("+file+")##");

    phantom.exit();


}

function saveReport(request,maxRenderWait) {
	console.log("saveReport");
    reportPage.open(request.url, "post", function (status) {
        if (status !== "success") {
            console.log("Fatal Error. Could not open web page : " + request.url);
            phantom.exit(1);
        } else {
            forcedRenderTimeout = setTimeout(function () {
                console.log("do ren called");
                doRender(request);
            }, maxRenderWait);
        }
    });
}


phantom.onError = function (msg, trace) {
    var msgStack = ['EXPORT ERROR: ' + msg + trace];
    if (trace && trace.length) {
        msgStack.push('TRACE:');
        trace.forEach(function (element) {
            msgStack.push(' -> ' + (element.file || element.sourceURL) + ': ' + element.line + (element.function ? ' (in function ' + element.function + ')' : ''));
        });
    }
    console.error(msgStack.join('\n'));
    phantom.exit(1);
};