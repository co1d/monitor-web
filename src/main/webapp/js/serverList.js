var ip,
	companyCode= window.parent.companyCode;
layui.use(['element','table','jquery','layer'], function(){
	var element = layui.element,
		table = layui.table,
		$ = layui.$,
		layer = layui.layer;
	
	var server = table.render({
		id:'ip'
	    ,elem: '#serverList'
	    ,url:'/server/list'
	    ,where: {companyCode: companyCode}
	    ,height: 'full-55'
	    ,page: false
	    ,cols: [[
	    	{field:'trueip', width:'10%', title: '主机地址', align:'center'}
	    	,{field:'title', width:'10%', title: '主机名', align:'center'}
	    	,{field:'location', width:'10%', title: '主机位置', align:'center'}
	    	,{field:'principal', width:'10%', title: '负责人', align:'center'}
	    	,{field:'phone', width:'10%', title: '联系电话', align:'center'}
	    	,{field:'description', width:'30%', title: '描述', align:'center'}
	    	,{fixed: 'right', width:'20%', title:'操作', align:'center', toolbar: '#bar'}
	    ]]
	});
	
	//监听行工具事件
	table.on('tool(serverList)', function(obj){
		var data = obj.data;
		ip = data.ip;
	    if(obj.event === 'del'){
	    	layer.confirm('此操作将会删除服务器所有记录，确定删除吗？', function(index){
	    		$.post("/server/deleteServer", {"ip":ip, "companyCode":companyCode}, function(){
	    			$.post("/message/deleteMessage", {"ip":ip, "companyCode":companyCode}, function(){
		    			layer.msg("删除成功");
		    		});
	    		});
	    		obj.del();
	    		layer.close(index);
	    	});
	    } else if(obj.event === 'edit'){
	    	layer.open({
        		  type: 2, 
        		  area: ['400px', '510px'],
        		  content: ['/iframe/server', 'no'],
        		  end:function(){
        			  server.reload();
        		  }
      		});
	    }
	});
	
});