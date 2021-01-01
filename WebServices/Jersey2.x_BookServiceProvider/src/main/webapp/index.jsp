<%@page isELIgnored="false"%>
<h1 style="color: red;" align="center">Book Registeration</h1>
<form action="bookController" method="post">
	BookId<input type="text" name="bookId"><br> BookName<input
		type="text" name="bookName"><br> BookAuthor<input
		type="text" name="bookAuthor"><br> BookPrice<input
		type="text" name="bookPrice"><br> <input type="submit"
		value="Register"> ${responseDTO.message}
</form>