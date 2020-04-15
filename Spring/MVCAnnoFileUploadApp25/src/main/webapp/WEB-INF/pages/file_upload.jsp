<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="POST" commandName="fileUploadCmd" enctype="multipart/form-data">
  Select File: <input type="file" name="uploadFile"/> <br>
  <input type="submit" value="upload"/>
  
</form:form>
