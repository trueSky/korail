<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<!-- IE 최신버전 이용 -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		
    	<!-- HTML5 호환 -->
    	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
   		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		
		<title>에러페이지</title>
	</head>
	<body class="body-style">
		<p style="color: #054D7D; margin: 0px; font-size: 50px; margin-top: 15px;">500 - <%=exception.getClass().getSimpleName() %></p>
		<h2 style="color: #6799FF;">
			class : <%=exception.getClass().getName() %>
			<br>
			message : <%=exception.getMessage() %>
		</h2>
	</body>
</html>