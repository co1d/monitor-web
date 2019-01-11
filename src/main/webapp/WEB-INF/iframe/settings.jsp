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
		<script src="<%=request.getContextPath()%>/js/settings.js"></script>
	</head>

	<body>
		<blockquote class="layui-elem-quote layui-text">请配置告警信息！</blockquote>
		<form class="layui-form" lay-filter="editForm">
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">告警项目</label>
					<div class="layui-input-inline">
						<input type="checkbox" id="cpu" name="cpu" title="CPU">
						<input type="checkbox" id="memory" name="memory" title="内存">
						<input type="checkbox" id="disk" name="disk" title="磁盘">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">CPU限度</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:255px" id="cpumax" name="cpumax" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">内存限度</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:255px" id="memorymax" name="memorymax" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">磁盘限度</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:255px" id="diskmax" name="diskmax" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">告警短信</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:255px" id="phone" name="phone" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">告警邮箱</label>
					<div class="layui-input-inline">
						<input type="text" lay-verify="required" style="width:255px" id="email" name="email" class="layui-input">
					</div>
				</div>
				
			</div>

			<div class="layui-form-item">
				<div class="layui-inline">
					<div class="layui-input-block">
						<button class="layui-btn" lay-filter="ok" style="width:85px" lay-submit>保存</button>
						<button class="layui-btn" lay-filter="no" id="no" style="width:85px" lay-submit>取消</button>
					</div>
				</div>
			</div>
			
		</form>
	</body>
</html>