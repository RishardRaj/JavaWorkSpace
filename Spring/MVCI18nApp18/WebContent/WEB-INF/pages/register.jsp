<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page isELIgnored="false" %>

 Registration Page<br>
 Language : <a href="?language=en">English</a>|
            <a href="?language=zh_CN">Chinese</a>
            <a href="?language=fr_FR">french</a>
            <a href="?language=de_DE">german</a>
                     
 <h3>
	<spring:message code="my.un" text="default text" />
	                        <input type=text name="userName"><br>
	<spring:message code="my.pwd" text="default text" />
	                         <input type=text name="password"><br>
 </h3>
 Selected Locale: ${pageContext.response.locale}
</body>
</html>