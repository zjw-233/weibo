<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>
		关注<a href="#">${sessionScope.a.follow }</a>|
		粉丝<a href="#">${sessionScope.a.fans }</a>|
		微博<a href="#">${sessionScope.a.weibo }</a>
		
	</div>
		
	<div>
		<c:forEach items="${p.show }" var="w">
			
			<div>
				<h3>${w.account.name }</h3>
				<p>${w.text }</p>
			</div>
		
		</c:forEach>
	</div>
	
	<div>
		<c:if test="${p.current >1 }">
			<a href="/u/${sessionScope.a.accountId }/1/home">首页</a>
			<a href="/u/${sessionScope.a.accountId }/${p.current -1}/home">上一页</a>
		</c:if>
		
		<c:forEach var="page" begin="1" end="${p.inAll }" step="1">
			<c:choose>
				<c:when test="${page == p.current }">
					<a href="javaScript:void(0)">${page }</a>
				</c:when>
				<c:otherwise>
					<a href="/u/${sessionScope.a.accountId }/${page}/home">${page }</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		
		<c:if test="${p.current <p.inAll }">
			<a href="/u/${sessionScope.a.accountId }/${p.current +1}/home">下一页</a>
			<a href="/u/${sessionScope.a.accountId }/${p.inAll}/home">尾页</a>
		</c:if>
	
	
	
	
	
	</div>

</body>
</html>