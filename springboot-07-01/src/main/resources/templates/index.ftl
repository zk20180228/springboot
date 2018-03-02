<!doctype html>
<html>
<head>
    <title>
        cors跨域请求
    </title>
</head>
<body>
<button id="bt">cors跨域请求</button>
</body>
</html>
<script src="/webjars/jquery/2.1.4/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">

    $("#bt").click(function () {
        $.ajax({
            type:"post",
            data:"name=张三&age=25",
            url:"http://192.168.0.26:9999/cors/getUsers",
            success:function(backData){
                console.log(JSON.stringify(backData))
            }

        })
    })


</script>