<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beer Recommendations</title>
</head>
<body>
	<h1 align="center">Beer Recommendations</h1>
	<p>
	<%
		List<String> styles = (List<String>)request.getAttribute("styles");
		for (String style : styles) {
			out.print("<br/>try: " + style);
		}
	%>
</body>
</html>