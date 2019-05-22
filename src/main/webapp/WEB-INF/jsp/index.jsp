<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>用户管理页面</title>
</head>
<body>
  <h2 align="center">用户管理系统</h2>
  <table border="1px" align="center" width="700px">
	<tr align="center">
      <td>客户ID</td>
	  <td>客户姓名</td>
	  <td>客户密码</td>
	  <td>客户手机</td>
	  <td>客户邮箱</td>
	</tr>
	<c:forEach items="${list}" var="u">
      <tr align="center">
		<td>${u.id}</td>
	    <td>${u.username}</td>
	    <td>${u.password}</td>
		<td>${u.mobile}</td>
		<td>${u.email}</td>
	  </tr>
	</c:forEach>
  </table>
</body>
</html>