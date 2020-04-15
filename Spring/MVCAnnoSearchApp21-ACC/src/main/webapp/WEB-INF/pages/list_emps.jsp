<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color:red;text-align:center">Search Results</h1>
<c:choose>
  <c:when test="${empList ne null}">
    <table border="1">
      <tr>
        <th>no</th><th>name</th><th>job</th><th>salary</th><th>mgmr</th><th>deptno</th>
       </tr>
       <c:forEach var="emp" items="${empList}">
          <tr>
           <td>${emp.no}</td>
           <td>${emp.name}</td>
           <td>${emp.job}</td>
           <td>${emp.salary}</td>
           <td>${emp.mgmrno}</td>
           <td>${emp.deptno}</td>
          </tr>
       </c:forEach>
    </table>
  </c:when>
  <c:otherwise>
    <h1 style="color:red">Records not found</h1>
  </c:otherwise>

</c:choose> <br>
 <a href="search.htm">home</a>