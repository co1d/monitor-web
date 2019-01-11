layui.use(['jquery', 'layer', 'form'], function() {
	var $ = layui.$,
		layer = layui.layer,
		form = layui.form,
		ip = window.parent.ip,
		companyCode= window.parent.companyCode;
	
	$.post("/server/sMessage", {"ip":ip, "companyCode":companyCode}, function(sMessage){
		var sMessage = eval("(" + sMessage + ")");
		$("#trueip").val(sMessage.trueip);
		$("#title").val(sMessage.title);
		$("#location").val(sMessage.location);
		$("#principal").val(sMessage.principal);
		$("#phone").val(sMessage.phone);
		$("#description").val(sMessage.description);
	});
				
	$(function() {
		form.on('submit(ok)', function(data) {
			var d = data.field;
				d.ip = ip;
				d.companyCode = companyCode;
			$.post("/server/updateServer", d, function(msg) {
				parent.layer.msg("修改成功");
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