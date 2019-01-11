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
<script src="<%=request.getContextPath()%>/js/record.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-row grid-demo" style="padding: 20px;">
	<div class="layui-col-md1">
		<div class="layui-form-item">
			<button class="layui-btn" style="width:100%" id="settings">告警设置</button>
		</div>
	</div>
	
	<div class="layui-col-md12">
		<table class="layui-hide" id="recordList" lay-filter="recordList"></table>
	</div>
	
	<script type="text/html" id="bar">
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>

</div>

</body>
</html>