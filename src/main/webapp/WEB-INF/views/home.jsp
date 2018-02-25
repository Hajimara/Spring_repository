<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	login test!!!!  
</h1>
<div>
	<table>
		<tr>
			<th>ROLE_NO</th>
			<th>ROLE</th>
			<th>UserID</th>
			<th>UserPW</th>
			<th>UserName</th>
		</tr>
		<c:forEach items="${list}" var="userVO">
			<tr>
				<th>${userVO.common_no}</th>
				<th>${userVO.role}</th>
				<th>${userVO.uid}</th>
				<th>${userVO.pw}</th>
				<th>${userVO.name}</th>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>
