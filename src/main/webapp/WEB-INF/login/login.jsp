<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>用户登入</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css" media="all">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/admin.css" media="all">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css" media="all">
<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/login.js"></script>
</head>
<body>

	<div class="layadmin-user-login layadmin-user-display-show"
		id="LAY-user-login" style="display: none;">

		<div class="layadmin-user-login-main">
			<div class="layadmin-user-login-box layadmin-user-login-header">
				<h1>杭州思软云监控服务平台</h1>
			</div>
			<form>
				<div class="layadmin-user-login-box layadmin-user-login-body layui-form">
					<div class="layui-form-item">
						<label class="layadmin-user-login-icon layui-icon layui-icon-username" for="userName"></label>
						<input type="text" name="userName" id="userName" value="tt" lay-verify="required" placeholder="用户名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="layadmin-user-login-icon layui-icon layui-icon-password" for="userPassword"></label>
						<input type="password" name="userPassword" id="userPassword" value="tt" lay-verify="required" placeholder="密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<button class="layui-btn layui-btn-sm" style="width:47%" lay-submit lay-filter="register">注 册</button>
						<button class="layui-btn layui-btn-sm" style="width:48%" lay-submit lay-filter="login">登 入</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>