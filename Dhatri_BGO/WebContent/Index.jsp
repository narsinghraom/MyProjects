<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
center {
	margin: auto;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<script type="text/javascript">
	function doSubmit() {
		window.location
				.assign("http://localhost:8079/dhatriinfo/Registration.jsp");
	}
</script>

<script type="text/javascript">
	function onCheck() {
		if (document.getElementById("ref").checked == true) {
			location.href = "Registration.jsp";
		} else {
			location.href = "search.html";
		}

	}
</script>

<script type="text/javascript" src="jquery-2.1.4.js"></script>
</head>
<body>

	<div class="center" align="center">

	<h1 align="center">WELCOME TO BLOODGROUP ORGANIZATION</h1>

	<input type="radio" name="Details" value="ADDDetails" id="ref"
		checked="checked">ADDDetails
	<input type="radio" name="Details" value="ViewDetails" id="view">ViewDetails
	<br>
	<input type="button" name="OK" value="ok" onclick="onCheck()">
	</div>
</body>
</html>