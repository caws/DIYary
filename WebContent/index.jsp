<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

		<h4>My Entries</h4>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Date</th>
					<th scope="col">Entry</th>
					<th scope="col" style="width: 5px">Actions</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>20/06/2018</td>
					<td>Otto</td>
					<td><a href="#"><i class="far fa-edit"></i></a> <a href="#"><i
							class="far fa-trash-alt"></i></a></td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>10/05/2018</td>
					<td>Thornton</td>
					<td><a href="#"><i class="far fa-edit"></i></a> <a href="#"><i
							class="far fa-trash-alt"></i></a></td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>10/05/2018</td>
					<td>Thornton</td>
					<td><a href="#"><i class="far fa-edit"></i></a> <a href="#"><i
							class="far fa-trash-alt"></i></a></td>
				</tr>
			</tbody>
		</table>
		<div class="row">
			<div class="col-sm-6">
				<a style="color: white;" class="btn btn-success" href="welcome.jsp">
					<i class="fas fa-arrow-left"> </i> Back to Home
				</a>
			</div>
			<div class="col-sm-6">
				<a style="color: white;" class="btn btn-primary"
					href="diaryNewEntry.jsp"> <i class="far fa-plus-square"> </i>
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