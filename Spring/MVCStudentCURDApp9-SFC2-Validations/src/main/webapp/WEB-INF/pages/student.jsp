<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1><center> Registration Page</center></h1>
<form:form method="POST" commandName="stCmd">
<%-- <p style="color:red">
   <form:errors path="*"/><br>
 </p> --%>
  Number: <form:input path="sno"/><form:errors cssStyle="color:red" path="sno"/><br>
  Name: <form:input path="sname"/><form:errors path="sname"/><br>
  Address: <form:input path="sadd"/><form:errors path="sadd"/><br>
  <input type="submit" value="register">
</form:form>