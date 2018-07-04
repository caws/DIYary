<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Diary</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h3 class="text-center" style="padding-bottom: 20px">Update Diary
			Entry</h3>
		<form name="updateForm" method="PUT" action="EntryUpdate">
			<div class="form-group">
			  <label for="entryDate">Date:</label>
			  <input name="entryDate" type="date" class="form-control" id="entryDate" value="<c:out value="${entry.getEntryDate()}" />">
			</div>
			<div class="form-group">
			  <label for="authorName">Name:</label>
			  <input name="authorName" type="text" class="form-control" id="authorName" value="<c:out value="${entry.getAuthorName()}" />">
			</div>
			<div class="form-group">
				<label for="entryText">Text:</label>
				<textarea name=entryText class="form-control" rows="5" id="entryText"> <c:out value="${entry.getEntryText()}" /></textarea>
			</div>

			<input type="submit" value="Update" class="btn btn-primary"/>
		</form>
	</div>		
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
</body>
</html>