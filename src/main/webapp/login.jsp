<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>用户登录</title>

<script type="text/javascript" src="${baseurl}js/jquery.min.js"></script>

<style type="text/css">

#sd{
	color:red
}

.sd1{
	color:yellow
}


</style>
<script type="text/javascript" >



$(function() {
	
	
	alert("id"+$("#userCode").val());
	
	alert("name"+ $("input[name=userCode]").val());
	
	
});


</script>
</head>


<body>

<form id="formid" action="${baseurl}login" method="post">
	<div>
		<table>
			<tr>
				<td>用户名</td>
				<td><input id="userCode" name="userCode"  value="123" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			
			<tr>
				<td>机构</td>
				<td >
				<select name ="comCode">
					<option id="sd" value='01' >天安财险总公司</option>
					<option class="sd1" value='02' >天安财险分公司</option>
					<option value='03' >天安财险中支</option>
				</select>
				</td>
			</tr>
			<tr><td ><font>${errorMessage }</font> </td></tr>
		</table>
		<input type="submit" id="submit" value="登录" ></input>
	</div>
</form>
</body>
</html>
