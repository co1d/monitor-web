layui.use(['jquery', 'layer', 'form'], function () {
    var $ = layui.$,
        layer = layui.layer,
        form = layui.form,
        index = parent.layer.index;

    $(function () {

        form.on('submit(ok)', function (data) {

            $.post("/user/register", data.field, function (msg) {
                if (msg == "\"regSuccess\"") {
                    window.parent.layer.msg("注册成功");
                    parent.layer.close(index);
                }
                else {
                    layer.msg("用户名已经被使用");
                }
            });
            return false;
        });
        $("#no").click(function () {
            parent.layer.close(parent.layer.index);
            return false;
        });
    });
});