layui.use(['jquery', 'layer', 'form'], function() {
	var $ = layui.$,
		layer = layui.layer,
		form = layui.form,
		ip = window.parent.ip,
		companyCode= window.parent.companyCode;
	
	$.post("/settings/queryAll", {"ip":ip, "companyCode":companyCode}, function(message){
		var message = eval("(" + message + ")");
		if (message.cpu == "on") {
			$('#cpu').attr('checked', true);
		}
		if (message.memory == "on") {
			$('#memory').attr('checked', true);
		}
		if (message.disk == "on") {
			$('#disk').attr('checked', true);
		}
		form.render('checkbox');
		$("#cpumax").val(message.cpumax);
		$("#memorymax").val(message.memorymax);
		$("#diskmax").val(message.diskmax);
		$("#phone").val(message.phone);
		$("#email").val(message.email);
	});
		
	$(function() {
		form.on('submit(ok)', function(data) {
			var d = data.field;
				d.ip = ip;
				d.companyCode = companyCode;
			$.post("/settings/update", d, function(msg) {
				parent.layer.msg("配置成功");
			});
			parent.layer.close(parent.layer.index);
			return false;
		});
		$("#no").click(function(){
			parent.layer.close(parent.layer.index);
			return false;
		});
	});
});