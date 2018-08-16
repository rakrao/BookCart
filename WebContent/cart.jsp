<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="shopping-cart">
		<div class="title">Shopping Bag</div>
		<jstl:forEach var="cart" items="${sessionScope.cart }">
			<div class="item">
				<div class="buttons">
					<span class="delete-btn"></span>
				</div>
				<div class="image">
					<img src="images/${cart.link }" height="100" width="75">

				</div>
				<div class="description">
					<span>${cart.bookName }</span> <span>${cart.authorName }</span>
				</div>
				<div class="quantity">
					<span>${cart.count }</span>
				</div>
				<div class="total-price">
					<span>${cart.price*cart.count }</span>
				</div>
			</div>
		</jstl:forEach>
	</div>
</body>
</html>