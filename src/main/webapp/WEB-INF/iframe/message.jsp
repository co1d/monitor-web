<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">

<html>
<head>
<meta charset="utf-8">
<title>杭州思软服务器监控平台</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css" media="all">
<script src="<%=request.getContextPath()%>/layui/layui.js"></script>
<script src="<%=request.getContextPath()%>/highcharts/highcharts.js"></script>
<script src="<%=request.getContextPath()%>/highcharts/modules/exporting.js"></script>
<script src="<%=request.getContextPath()%>/js/message.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-row grid-demo" style="padding: 20px;">

<div class="layui-col-md11">
	<div class="layui-col-md5">
		<div class="layui-form-item">
			<label class="layui-form-label">系统版本</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="serverVersion" class="layui-input">
			</div>
		</div>
	</div>
	
	<div class="layui-col-md3">	
		<div class="layui-form-item">
			<label class="layui-form-label">内存容量</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="memoryCapacity" class="layui-input">
			</div>
		</div>
	</div>
	
	<div class="layui-col-md3">	
		<div class="layui-form-item">
			<label class="layui-form-label">磁盘容量</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="diskCapacity" class="layui-input">
			</div>
		</div>
	</div>

	<div class="layui-col-md5">
		<div class="layui-form-item">
			<label class="layui-form-label">CPU型号</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="cpuModel" class="layui-input">
			</div>
		</div>
	</div>
	
	<div class="layui-col-md3">	
		<div class="layui-form-item">
			<label class="layui-form-label">CPU个数</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="cpuNumber" class="layui-input">
			</div>
		</div>
	</div>
	
	<div class="layui-col-md3">	
		<div class="layui-form-item">
			<label class="layui-form-label">CPU核数</label>
			<div class="layui-input-block">
				<input type="text" readonly="readonly" lay-verify="required" id="cpuCoreNumber" class="layui-input">
			</div>
		</div>
	</div>
</div>

<div class="layui-col-md1">
	<div class="layui-col-md12">
		<div class="layui-form-item">
			<button class="layui-btn" style="width:100%" id="record">告警记录</button>
		</div>
	</div>
	<div class="layui-col-md12">
		<div class="layui-form-item">
			<button class="layui-btn" style="width:100%" id="history">历史记录</button>
		</div>
	</div>
</div>
	
	<div class="layui-col-md4">
		<div id="cpu" style="height:300"></div>
	</div>
	
	<div class="layui-col-md4">
		<div id="memory" style="height:300"></div>
	</div>
	
	<div class="layui-col-md4">
		<div id="disk" style="height:300"></div>
	</div>
	
	<div class="layui-col-md12">
		<table class="layui-hide" id="process"></table>
	</div>
	
</div>

</body>
</html>