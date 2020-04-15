<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <h1 style='text-align:center'>Choose file to download </h1>
<c:choose>
  <c:when test="${downloadList ne null}">
    <c:forEach var="file" items="${downloadList}">
       <a href="download.htm?file_name=${file}">${file}</a> <br>
    </c:forEach>
  </c:when>

</c:choose>