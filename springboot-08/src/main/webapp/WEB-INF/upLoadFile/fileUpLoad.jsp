<%--
  DESC:
  User: zhangkui
  Date: 2018/1/12
  Time: 16:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring-boot-fileUpload</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file/upLoadFile" id="form" method="post" enctype="multipart/form-data">
    <input type="file" id="ff" name="file" >
    <button id="bb">上传</button>
</form>

</body>
</html>
<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js" ></script>
<script type="text/javascript">
    $("#bb").click(function(){
        //提交表单
        $("#form").submit();
        alert("xx");
    });


</script>

