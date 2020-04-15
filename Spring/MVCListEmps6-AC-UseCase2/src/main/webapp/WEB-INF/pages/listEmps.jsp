<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
   <c:when test="${empList ne null }">
   <table border="1">
     <c:forEach var="dto" items="${empList}">
        <tr>
        <td>${dto.no}</td>
        <td>${dto.name}</td>
        <td>${dto.job}</td>
        <td>${dto.salary}</td>
       </tr>
     </c:forEach>
    </table>
   </c:when>
   <c:otherwise>
      Records not found
   </c:otherwise>
</c:choose>
<br>
<a href="home.htm">home</a>