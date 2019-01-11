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
<script src="<%=request.getContextPath()%>/js/main.js"></script>

</head>
<body class="layui-layout-body">

<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">杭州思软云监控服务平台</div>
    <!-- 头部区域 -->
    <ul class="layui-nav layui-layout-left"  lay-filter="headNav">
      <li class="layui-nav-item"><a href="javascript:;">刷新服务器</a></li>
      <li class="layui-nav-item"><a href="javascript:;">服务器信息</a></li>
    </ul>

    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a id="download" href="<%=request.getContextPath()%>/download/com_hzsr_monitor_server-1.0.jar">download</a>
      </li>
      <li class="layui-nav-item">
        <a id="userName" href="javascript:;">${userName}</a>
      </li>
      <li class="layui-nav-item"><a href="/user/outLogin">退出登录</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域 -->
      <div id="serverName" lay-filter="serverName"></div>
    </div>
  </div>

  <div class="layui-body">
    <!-- 内容主体区域 -->
    <iframe width="100%" height="100%" id="main" style="border: none"></iframe>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © 杭州思软信息技术有限公司
  </div>
  
</div>

</body>
</html>