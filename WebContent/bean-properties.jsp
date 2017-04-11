<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<UL>
		<LI><B>First Name:</B> ${employee.name.firstName}
		<LI><B>Last Name:</B> ${employee.name.lastName}
		<LI><B>Company Name:</B> ${employee.company.companyName}
		<LI><B>Company Business:</B> ${employee.company.business}
	</UL>
</body>
</html>