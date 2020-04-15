<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Registration page2</center></h1>

<form:form  method="post" commandName="regCmd">
 EmailId : <form:input path="email"/><br>
 PhoneNumber:<form:input path="phone"/><br>
 <input type="submit" name="_target0" value="previous">
 <input type="submit" name="_target2" value="next">
 <input type="submit" name="_cancel" value="cancel">
</form:form>
