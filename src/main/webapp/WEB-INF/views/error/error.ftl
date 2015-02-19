<html>
<head>
<title>错误页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<@full_path path="js/jquery/jquery-1.8.0.min.js"/>"></script>
<script type="text/javascript">

function showErrorDetail(){
      $("#error-detail-message").toggle();
}
</script>
</head>
<body>
<a href="javascript:history.back(-1)" style="margin-bottom: 10px;">返回</a>
<h4>错误信息: ${throwable.getLocalizedMessage()}</h4>
<a href="javascript:showErrorDetail()">详细信息</a>

<pre id="error-detail-message" style="display: none;">
${ExceptionUtils.getStackTrace(throwable)}
</pre>

</body>
</html>