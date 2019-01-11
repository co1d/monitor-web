layui.use(['jquery', 'form'], function(){
	var $ = layui.$,
		form = layui.form;
	form.render();
				
	//注册
	form.on('submit(register)',function(obj) {
		layer.open({
    		  type: 2, 
    		  area: ['400px', '390px'],
    		  content: ['/iframe/register', 'no'],
  		});
		return false;
	});
	
	//提交
	form.on('submit(login)',function(obj) {
		$.post("/user/checkLogin", obj.field, function(msg){
			if (msg == "\"success\"") {
				layer.msg("登录成功!");
				location.href = "/user/index";
			}else if (msg == "\"fail\"") {
				layer.msg("账号密码错误!");
			}
		});
		return false;
	});
});