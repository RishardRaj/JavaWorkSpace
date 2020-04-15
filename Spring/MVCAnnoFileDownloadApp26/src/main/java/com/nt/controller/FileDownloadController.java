package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {
	
	@RequestMapping(value="/home.htm")
	public String displayForm(Map<String,List<String>> map){
		String uploadFolderPath="E:/springuploads";
		File uploadFolder=null;
		File listOfFiles[]=null;
		List<String> filesToDownload=null;
		//get the Names all the uploaded file
		uploadFolder=new File(uploadFolderPath);
		filesToDownload=new ArrayList<String>();
		if(uploadFolder.isDirectory()){
			listOfFiles=uploadFolder.listFiles();
			for(int i=0;i<listOfFiles.length;++i){
				if(listOfFiles[i].isFile()){
					filesToDownload.add(listOfFiles[i].getName());
				}//if
			}//for
		}//if
		//add filesToDownload to Model Attribute
		map.put("downloadList",filesToDownload);
		return "list_files";
	}//method
	
	@RequestMapping(value="/download.htm")
	public void donwloadFile(@RequestParam("file_name")String fileName,HttpServletRequest req,HttpServletResponse res)throws Exception{
		 String filePath=null;
		 long length=0;
		 ServletContext sc=null;
		 String mimeType=null;
		 InputStream is=null;
		 OutputStream os=null;
		//prepare path of file
		 filePath="e:/springuploads/"+fileName;
		 //get file length and response content length
		 length=new File(filePath).length();
		 res.setContentLengthLong(length);
		 //get file MIME type and set it as response content type
		 sc=req.getServletContext();
		 mimeType=sc.getMimeType(filePath);
		 res.setContentType(mimeType!=null?mimeType:"application/octet-stream");
		 //getInputStream pointing to file
		 is=new FileInputStream(filePath);
		 //get OutputStream pointing to response obj
		 os=res.getOutputStream();
		 //make response content as downloadable file
		 res.addHeader("Content-Disposition","attachment;fileName="+fileName);
		 //perform file copy operation
		 IOUtils.copy(is,os);
		 //close streams
		 is.close();
		 os.close();
		 
	}

}//class
