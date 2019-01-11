var hostId=window.parent.hostId;

layui.use(['element','table','jquery','layer'], function(){
	var element = layui.element,
		table = layui.table,
		$ = layui.$,
		layer = layui.layer,
		cpuUsageRate,
		memoryUsageRate,
		diskUsageRate;
		
	/*table.render({
	    elem: '#process'
	    ,url:'/proccer/list'
	    ,where: {hostId:hostId}
	    ,height: 'full-463'
	    ,page: false
	    ,cols: [[
	      {field:'procezzPID', width:'13%', title: 'PID', align:'center'}
	      ,{field:'procezzUSER', width:'13%', title: '用户', align:'center'}
	      ,{field:'procezzCPU', width:'13%', title: 'CPU占用率(%)', align:'center'}
	      ,{field:'procezzRSS', width:'13%', title: '内存占用(Mb)', align:'center'}
	      ,{field:'procezzSTARTED', width:'13%', title: '开始时间', align:'center'}
	      ,{field:'procezzTIME', width:'13%', title: '占用CPU时间', align:'center'}
	      ,{field:'procezzCOMMAND', width:'22%', title: '命令行', align:'center'}
	    ]]
	});*/
		
	$.post("/message/queryHostData", {"hostId":hostId}, function(message){
		var message = eval("(" + message + ")");
		document.getElementById('cpuModel').value = message.cpuModel;
		document.getElementById('cpuNumber').value = message.cpuNumber;
		document.getElementById('memoryCapacity').value = Math.round(message.memoryCapacity*100)/100 + "G";
		document.getElementById('diskCapacity').value = message.diskCapacity;
		document.getElementById('serverVersion').value = message.serverVersion;
		document.getElementById('cpuCoreNumber').value = message.cpuCoreNumber;
	});
	
	setInterval(function(){
		$.post("/message/queryHostData", {"hostId":hostId}, function(message){
			var message = eval("(" + message + ")");
			cpuUsageRate = message.cpuUsageRate*1;
			memoryUsageRate = message.memoryUsageRate*1;
			diskUsageRate = message.diskUsageRate.replace("%","")*1;
			
		});
	},1500);
		
	chart('cpu','CPU使用率','cpuUsageRate');
	chart('memory','内存使用率','memoryUsageRate');
	chart('disk','磁盘使用率','diskUsageRate');
	
	$("#record").click(function(){
		$(window.parent.document).find("#main").prop("src", "/iframe/record");
	});
	
	$("#history").click(function(){
		$(window.parent.document).find("#main").prop("src", "/iframe/history");
	});
	
	function chart(id,title,y) {
		Highcharts.setOptions({
			global: {useUTC: false}
		});
		function activeLastPointToolip(chart) {
			var points = chart.series[0].points;
			chart.tooltip.refresh(points[points.length -1]);
		}
		var chart = Highcharts.chart(id, {
			title: {text: title},
			credits:enabled=false,
			legend: enabled=false,
			chart: {
				type: 'spline',
				marginRight: 10,
				events: {
					load: function () {
						var series = this.series[0],
							chart = this,
							yy = y;
						activeLastPointToolip(chart);
						setInterval(function () {
							var x = (new Date()).getTime(),
								y = eval(yy);
							series.addPoint([x, y], true, true);
							activeLastPointToolip(chart);
						}, 2000);
					}
				}
			},
			xAxis: {
				type: 'datetime',
				tickPixelInterval: 100
			},
			yAxis: {
				title: null,
				min: 0,
				max: 100,
				tickPixelInterval: 50,
				labels: {
					formatter: function () {
						return Highcharts.numberFormat(this.value, 0) + '%';
					}
				}
			},
			tooltip: {
					formatter: function () {
						return Highcharts.dateFormat('%H:%M:%S', this.x) + '<br/>' +
						Highcharts.numberFormat(this.y, 1) + "%";
					}
			},
			series: [{
				marker: {
					enabled: false
				},
				data: (function () {
					var data = [],
						time = (new Date()).getTime();
					for (var i = -299; i <= 0; i += 1) {
						data.push({x: time + i * 1000});
					}
					console.log(data);
					return data;
				}())
			}]
		});
	}
});