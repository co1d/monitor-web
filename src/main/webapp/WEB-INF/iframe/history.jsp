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
<script src="<%=request.getContextPath()%>/js/history.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-row grid-demo" style="padding: 20px;">
	<div class="layui-col-md12">
		<div class="layui-inline" style="width:300px">
		<button class="layui-btn" id="day">一天</button>
		<button class="layui-btn" id="threeDay">三天</button>
		<button class="layui-btn" id="week">一周</button>
		<button class="layui-btn" id="month">一月</button>
		</div>
	</div>
	
	<div class="layui-col-md12">
		<div id="cpu" style="height:30%"></div>
	</div>
	
	<div class="layui-col-md12">
		<div id="memory" style="height:30%"></div>
	</div>
	
	<div class="layui-col-md12">
		<div id="disk" style="height:30%"></div>
	</div>
	
</div>

</body>
</html>