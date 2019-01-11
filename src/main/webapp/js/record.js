var ip = window.parent.ip,
	companyCode= window.parent.companyCode;
layui.use(['element','table','jquery','layer'], function(){
	var element = layui.element,
		table = layui.table,
		$ = layui.$,
		layer = layui.layer;
		
	var record = table.render({
		id: 'id'
		,elem: '#recordList'
	    ,url:'/record/queryAll'
	    ,where: {ip: ip, companyCode: companyCode}
		,height: 'full-110'
	    ,page: false
	    ,cols: [[
	    	{field:'time', width:'25%', title: '告警时间', align:'center',
	    		templet :function (row){
                    return createTime(row.time);
                }
	    	}
	    	,{field:'type', width:'25%', title: '告警项目', align:'center'}
	    	,{field:'text', width:'25%', title: '告警值', align:'center'}
	    	,{fixed: 'right', width:'25%', title:'操作', align:'center', toolbar: '#bar'}
	    ]]
	});
	
	//监听行工具事件
	table.on('tool(recordList)', function(obj){
		var data = obj.data,
			id = data.id;
	    if(obj.event === 'del'){
	    	layer.confirm('确定删除该条记录吗？', function(index){
	    		$.post("/record/delete", {"id":id ,"companyCode": companyCode}, function(){
		    		layer.msg("删除成功");
	    		});
	    		obj.del();
	    		layer.close(index);
	    	});
	    } 
	});
	
	$("#settings").click(function(){
		layer.open({
			type: 2, 
  		  	area: ['410px', '510px'],
  		  	content: ['/iframe/settings', 'no'],
		});
	});
	
	function createTime(time){
		var date = new Date(time);
	    var y = date.getFullYear();
	    var m = date.getMonth()+1;
	    m = m<10?'0'+m:m;
	    var d = date.getDate();
	    d = d<10?("0"+d):d;
	    var h = date.getHours();
	    h = h<10?("0"+h):h;
	    var M = date.getMinutes();
	    M = M<10?("0"+M):M;
	    var S = date.getSeconds();
        S = S<10?("0"+S):S;  
        return y+"-"+m+"-"+d+" "+h+":"+M+":"+S;
	}
	
});