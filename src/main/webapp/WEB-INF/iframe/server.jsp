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
		<script src="<%=request.getContextPath()%>/js/server.js"></script>
	</head>

	<body>
		<blockquote class="layui-elem-quote layui-text">请慎重修改服务器信息！</blockquote>
		<form class="layui-form" lay-filter="editForm">
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">主机地址</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="trueip" name="trueip" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">主机名</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:220px" id="title" name="title" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">地址位置</label>
					<div class="layui-input-inline">
						<input type="text" style="width:220px" id="location" name="location" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">负责人</label>
					<div class="layui-input-inline">
						<input type="text" style="width:220px" id="principal" name="principal" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">联系电话</label>
					<div class="layui-input-inline">
						<input type="text" style="width:220px" id="phone" name="phone" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">描述</label>
					<div class="layui-input-inline">
						<input type="text" style="width:220px" id="description" name="description" class="layui-input">
					</div>
				</div>
			</div>

			<div class="layui-form-item">
				<div class="layui-inline">
					<div class="layui-input-block">
						<button class="layui-btn" lay-filter="ok" style="width:80px" lay-submit>保存</button>
						<button class="layui-btn" lay-filter="no" id="no" style="width:80px" lay-submit>取消</button>
					</div>
				</div>
			</div>
			
		</form>

	</body>

</html>