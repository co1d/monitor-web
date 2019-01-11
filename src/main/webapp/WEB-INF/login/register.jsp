<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>服务器信息配置</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css">
		<script src="<%=request.getContextPath()%>/layui/layui.js"></script>
		<script src="<%=request.getContextPath()%>/js/register.js"></script>
	</head>

	<body>
		<blockquote class="layui-elem-quote layui-text">请填写注册信息！</blockquote>
		<form class="layui-form" lay-filter="editForm">
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="userName" name="userName" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">密码</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="userPassword" name="userPassword" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">公司名称</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="companyName" name="companyName" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">公司代码</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="companyCode" name="companyCode" class="layui-input">
					</div>
				</div>
			</div>

			<div class="layui-form-item">
				<div class="layui-inline">
					<div class="layui-input-block">
						<button class="layui-btn" lay-filter="ok" style="width:80px" lay-submit>注册</button>
						<button class="layui-btn" lay-filter="no" id="no" style="width:80px" lay-submit>取消</button>
					</div>
				</div>
			</div>
			
		</form>

	</body>

</html>