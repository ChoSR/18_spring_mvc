<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<h2>주문정보</h2>
	<table border="1">
		<tr>
			<th>회원 아이디</th>
			<th>회원 이름</th>
			<th>회원 연락처</th>
			<th>회원 이메일</th>
			<th>회원 거주지</th>
			<th>상품 이름</th>
			<th>상품 가격</th>
			<th>상품 배송비</th>
			<th>주문 수량</th>
			<th>주문 상태</th>
		</tr>
		<c:forEach var="orderMap" items="${orderMapList }">
			<tr>
				<td>${orderMap.memberId }</td>
				<td>${orderMap.memberName }</td>
				<td>${orderMap.hp }</td>
				<td>${orderMap.email }</td>
				<td>${orderMap.residence }</td>
				<td>${orderMap.productName }</td>
				<td>${orderMap.productPrice }</td>
				<td>${orderMap.productDeliveryPrice }</td>
				<td>${orderMap.orderGoodsQty }</td>
				<td>${orderMap.deliveryState }</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>