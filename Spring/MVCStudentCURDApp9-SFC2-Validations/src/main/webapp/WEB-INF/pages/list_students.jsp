<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
  <c:when test="${listStuds ne null }">
     <table border="1" width="100%" height="100%">
      <tr><th>sno</th><th>sname</th><th>sadd</th><th>operations</th></tr>
      <c:forEach var="stud"  items="${listStuds}">
        <tr>
          <td>${stud.sno}</td>
          <td>${stud.sname}</td>
          <td>${stud.sadd}</td>
          <td><a href="edit_student.htm?no=${stud.sno}">edit</a></td>
        </tr>
      </c:forEach>
     </table>
  </c:when>  
  <c:otherwise>
    <p style='color:red'>Students not found</p>
  </c:otherwise>
</c:choose>
  <br>
   <a href="insert_student.htm">Register student</a>
