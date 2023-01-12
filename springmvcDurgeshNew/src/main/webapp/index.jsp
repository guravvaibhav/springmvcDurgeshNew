<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body bgcolor="skyblue">
<body>
	<h3>Fill Student Details</h3>

	<form action="createNewStudent" method="post">
		<table>

			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="roll" /></td>
			</tr>


		</table>

		<input type="submit" value="Create Student">

	</form>
	<h3>!!!..delete student..!!!</h3>
	<form action="deleteStudent" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="roll" /></td>
			</tr>
		</table>

		<input type="submit" value="delete Student">

	</form>
	<h3>!!!..update student details..!!</h3>
	<form action="updateStudent" method="post">
		<table>

			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="roll" /></td>
			</tr>


		</table>

		<input type="submit" value="update Student">

	</form>

<h3>!!!..Show all students..!!!</h3>

	<form action="showAllStudent" method="get">


		<input type="submit" value="show all Student">

	</form>
<h3>!!!.. show student..!!!</h3>
	<form action="showStudent" method="get">
		<tr>
			<td>ID:</td>
			<td><input type="text" name="roll" /></td>
		</tr>

		<input type="submit" value="show Student">

	</form>


</body>
</html>