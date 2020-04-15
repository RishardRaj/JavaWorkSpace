<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form:form method="POST" commandName="userCmd">
  <p style='color:red'><form:errors path="*"/></p>
 Username:<form:input path="uname"/><br>
 Password:<form:password path="pwd"/><br>
 Domains : <form:checkboxes items="${domains}" path="domain"/><br>
  Date of registration<form:input path="dor"/>(dd-MM-yyyy)<br>
 <input type="submit" value="login">
 
</form:form>
<br><br>
<c:if test="${resultMsg ne null }">
  ${resultMsg }
</c:if>
<br><br>
<c:if test="${userCmd ne null }">
  ${userCmd }
</c:if>

