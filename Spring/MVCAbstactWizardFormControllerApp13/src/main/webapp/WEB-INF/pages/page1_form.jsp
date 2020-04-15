<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Registration page1</center></h1>

<form:form  method="post" commandName="regCmd">
 User : <form:input path="uname"/><br>
 password:<form:password path="pwd"/><br>
 <input type="submit" name="_target1" value="next">
 <input type="submit" name="_cancel" value="cancel">
</form:form>
