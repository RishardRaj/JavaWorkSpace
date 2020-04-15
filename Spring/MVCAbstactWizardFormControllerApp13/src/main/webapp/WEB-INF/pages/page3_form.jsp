<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Registration page2</center></h1>

<form:form  method="post" commandName="regCmd">
 City: <form:input path="city"/><br>
 Pincode:<form:input path="pin"/><br>
 <input type="submit" name="_target1" value="previous">
 <input type="submit" name="_finish" value="finish">
 <input type="submit" name="_cancel" value="cancel">
</form:form>
