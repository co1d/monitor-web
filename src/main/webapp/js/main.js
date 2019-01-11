var hostId,
    companyId;

layui.config({
    base: '/layui/navbar/'
}).use(['navbar','jquery','layer','element'], function() {
    var navbar = layui.navbar(),
    	$ = layui.jquery,
    	layer = layui.layer,
    	element = layui.element,
        userName = document.getElementById("userName").innerText;
    
    $.post("/user/companyId", {"userName":userName},function(msg){
    	companyId = msg.replace("\"", "").replace("\"", "");
    	navbar.set({
            elem: '#serverName',
            url: '/server/queryServerName?companyId='+ companyId
        });
    	// 刷新左侧菜单栏
        navbar.render();
        //刷新之后点击服务器，显示对应的传送数据
        navClick();
	});
    
    function navClick() {
    	navbar.on('click(serverName)', function(data) {
        	var serverName = data.field.title;
        	$.post("/server/queryHostId", {"serverName":serverName,"companyId":companyId},function(msg){
        		hostId = msg.replace("\"", "").replace("\"", "");
        		$("#main").prop("src", "/iframe/message");
    		});
        });
	}
    
    element.on('nav(headNav)', function(elem){
    	if (elem.text() == "刷新服务器") {
			$.post("/server/refresh", {"hostId":hostId},function(){
	    		navbar.render();
	    		navClick();
	    		layer.msg("已刷新");
			});
		}
    	
    	if (elem.text() == "服务器信息") {
            hostId = null;
    		$("#main").prop("src", "/iframe/serverList");
		}
    });
});
