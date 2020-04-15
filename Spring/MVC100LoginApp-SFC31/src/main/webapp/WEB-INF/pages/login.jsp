<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <h1 style='text-align:center'>Login page </h1>
<form:form method="POST" commandName="userCmd">
  username : <form:input path="uname"/><br>
  password:  <form:password path="pwd"/><br>
   <input type="submit" value="Login">
</form:form>

 <c:if test="${result ne null}">
   ${result}
 </c:if>
 
