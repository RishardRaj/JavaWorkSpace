<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="POST" commandName="regCmd">
  <form:errors path="*"/>
  <br>Name : <form:input path="name"/><br>
  course : <form:select path="course">
                <form:options items="${crsList}"/> 
         </form:select>
   <input type="submit"  value="register"/>
</form:form>
