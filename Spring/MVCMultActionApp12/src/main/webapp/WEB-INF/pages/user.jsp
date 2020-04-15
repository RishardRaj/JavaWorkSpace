<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style='text:align:center'> form page with multiple submit buttons</h1>

<form action="operations.htm" method="post">
  name:<input type="text" name="name"/><br>
  address:<input type="text" name="addrs"/><br>
  email:<input type="text" name="email"/><br>
  <input type="submit" name="s1" value="insert">
  <input type="submit" name="s1" value="update">
  <input type="submit" name="s2" value="delete">
</form>
<br><br>
<c:if test="${operation ne null}">
   ${operation} is successfull.
</c:if>
