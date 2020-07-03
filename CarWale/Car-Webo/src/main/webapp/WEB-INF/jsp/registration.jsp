<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<body>
<form:form method="POST" modelAttribute="userObjectR" action="ShowRegistration.do">
		<table>
			<tr>
				<td>
					<div>
					<p>First Name</p>	<form:input path="firstName" />
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<p>Last Name</p>
						<form:input path="lastName" />
					</div>
				</td>
		</tr>

			<tr>
				<td>
					<div>
						<p>Email</p>
						<form:input path="email" />
					</div>
				</td>
		 	</tr>

			<tr>
				<td>
					<div>
						<p>Password</p>
						<form:password path="password" />
					</div>
				</td>
 			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>