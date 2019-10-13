<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form action="addCustomer" method="POST">
		<table>

			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age"></td>
			</tr>

			<tr>
				<td>Tech:</td>
				<td><input type="text" name="tech"></td>
			</tr>
		</table>
		<input type="submit" />
	</form>



	<br>
	<br>

	<form action="getCustomer">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="cid"></td>
			</tr>

		</table>
		<input type="submit" />
	</form>
</body>
</html>