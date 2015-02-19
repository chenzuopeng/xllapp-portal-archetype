<!DOCTYPE html>
<html>
<head>
<title>表单</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" media="screen" href="<@full_path path="js/jBox/Skins/Default/jbox.css"/>"/>
<link type="text/css" rel="stylesheet" media="screen" href="<@full_path path="css/icity.css"/>"/>
<script type="text/javascript" src="<@full_path path="js/jquery/jquery-1.8.0.min.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/jquery/jquery.validate.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/jquery/jquery.validate.messages_zh.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/My97DatePicker/WdatePicker.js"/>" ></script>
<script type="text/javascript" src="<@full_path path="js/jBox/jquery.jBox-2.3.min.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/jBox/i18n/jquery.jBox-zh-CN.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/icity.js"/>"></script>
<script type="text/javascript" src="<@full_path path="js/uploadfile.js"/>"></script>
<script type="text/javascript" src="<@full_path path="upload/file/js/variables"/>"></script>

<script type="text/javascript">
<!--
$().ready(function() {
     var validator = $("#saveForm").validate({
          rules: {
				name: {
						required:true
				},
				icon: {
						required:true
				},
				status: {
						required:true
				},
		 },
		 errorClass:"search_error",
		 errorElement:"div"});
	  $(".reset").click(function() {
           validator.resetForm();
      });
});
//-->
</script>
</head>

<body>
<form id="saveForm" method="post"  action="?act=SAVE">
<input type="hidden" id="id" name="id"  value="<#if entity?has_content>${entity.id}</#if>"/>
<table class="save_form_table" border="1">
	        <tr>
				<td class="save_form_field_label"><span>用户名</span></td>
				<td><input class="save_form_field_input" id="name" name="name"  type="text"  value="<#if entity?has_content>${entity.name}</#if>" /></td>
		    </tr>
	        <tr>
				<td class="save_form_field_label"><span>密码</span></td>
				<td><input class="save_form_field_input" id="password" name="password"  type="text"  value="<#if entity?has_content>${entity.password}</#if>" /></td>
		    </tr>
	        <tr>
				<td class="save_form_field_label"><span>图标</span></td>
				<td><input class="save_form_field_input" id="icon" name="icon"  type="text"  value="<#if entity?has_content>${entity.icon}</#if>" fileUploadType="image" /></td>
		    </tr>
	        <tr>
				<td class="save_form_field_label"><span>状态</span></td>
				<td><select class="search_field_input search_field_select" id="status" name="status" >
				            <option value="">选择</option>
							<option value="0" <#if entity?has_content && entity.status!?string == '0'>selected='selected'</#if>>启用</option>
							<option value="1" <#if entity?has_content && entity.status!?string == '1'>selected='selected'</#if>>禁用</option>
			       </select></td>
		    </tr>
	        <tr>
				<td class="save_form_field_label"><span>创建时间</span></td>
				<td><input class="save_form_field_input save_form_field_readonly" id="createTime" name="createTime" type="text" readonly="true" onfocus="this.blur();" value="<#if entity?has_content && entity.createTime?has_content>${entity.createTime?datetime}</#if>"/></td>
		    </tr>
		<tr>
			<td colspan="2" class="save_form_button_panel"><input type="submit"  value="保存"/><input type="reset" class="reset" value="重置"/></td>
		</tr>
</table>
</form>
</body>
</html>