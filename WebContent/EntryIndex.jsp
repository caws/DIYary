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
		<h3 class="text-center" style="padding-bottom: 20px">DIYary</h3>
		${test}
		<h4>My Entries</h4>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Date</th>
					<th scope="col">Author Name</th>
					<th scope="col">Entry</th>
					<th scope="col" style="width: 5px">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${entries}" var="item">
					<tr>
						<th scope="row"><c:out value="${item.getId()}" /></th>
						<td><c:out value="${item.getEntryDate()}" /></td>
						<td><c:out value="${item.getAuthorName()}" /></td>
						<td><c:out value="${item.getEntryText()}" /></td>
						<td>
							<a href="EntryEdit?id=<c:out value="${item.getId()}" />"><i class="far fa-edit"></i></a> 
							<a href="EntryDelete?id=<c:out value="${item.getId()}" />"><i class="far fa-trash-alt"></i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="row">
			<div class="col-sm-6">
				<a style="color: white;" class="btn btn-success" href="WelcomePage.jsp">
					<i class="fas fa-arrow-left"> </i> Back to Home
				</a>
			</div>
			<div class="col-sm-6">
				<a style="color: white;" class="btn btn-primary float-right"
					href="EntryCreate.jsp"> <i class="far fa-plus-square"> </i>
					Add new entry
				</a>
			</div>

		</div>
	</div>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>