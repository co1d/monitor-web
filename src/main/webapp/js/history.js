layui.use(['jquery','layer','laydate'], function(){
	var $ = layui.$,
		layer = layui.layer,
		laydate = layui.laydate,
		ip = window.parent.ip,
		companyCode = window.parent.companyCode;
	
	allChart(1,500);
	$("#day").click(function(){
		allChart(1,500);
	});
	$("#threeDay").click(function(){
		allChart(3,1000);
	});
	$("#week").click(function(){
		allChart(7,2000);
	});
	$("#month").click(function(){
		allChart(30,10000);
	});
	function allChart(day ,frequency) {
		chart('cpu','CPU使用率','cpuUsageRate',day,frequency);
		chart('memory','内存使用率','memoryUsageRate',day,frequency);
		chart('disk','磁盘使用率','diskUsageRate',day,frequency);
	}
	
	function chart(id,title,sort,day,frequency) {
		$(function(){  
			Highcharts.setOptions({
				global: {useUTC: false}
			});
		    $.getJSON("/message/queryHistory", {"companyCode":companyCode ,"ip":ip ,"sort":sort ,"day":day ,"frequency":frequency}, function (history) {
		    	console.log(history);
		    	var chart = Highcharts.chart(id, {
		        	title: {text: title},
		            credits:enabled=false,
					legend: enabled=false,
		            xAxis: {
		            	type: 'datetime'
		            },
		            yAxis: {
		            	title: null,
						tickPixelInterval: 50,
						labels: {
							formatter: function () {
								return Highcharts.numberFormat(this.value, 2) + '%';
							}
						}
		            },
		            tooltip: {
						formatter: function () {
							return Highcharts.dateFormat('%Y-%m-%d %H:%M', this.x) + '<br/>' +
							Highcharts.numberFormat(this.y, 2) + "%";
						}
		            },
		            series: [{
		            	marker: {
							enabled: false
						},
		        		data: history
		        	}]		
		        });
		    });
		});
	}

	laydate.render({
		elem: '#starTime',
		max: new Date().getTime()
	});
	laydate.render({
		elem: '#stopTime',
		max: new Date().getTime()
	});

});