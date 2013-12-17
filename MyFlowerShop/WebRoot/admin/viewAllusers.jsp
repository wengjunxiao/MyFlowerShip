<%@ page contentType="text/html; charset=gb2312" language="java" import="com.*,java.util.*,java.io.*" errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="../WEB-INF/c.tld" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
}
.style3 {color: #0000FF; font-size: 16px;}
.style4 {color: #FFFFFF}
.style5 {font-size: 12px}
.style9 {color: #FFFFFF; font-size: 12px; font-weight: bold; }
-->
</style>
</head>
<body>
<center>
<h1 class="style3">查看用户信息</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="11%"><div align="center" class="style4 style5"><strong>用户号</strong></div></td>
<td width="13%"><div align="center" class="style4 style5"><strong>用户名</strong></div></td>
<td width="13%"><span class="style9">用户真实性名</span></td>
<td width="19%"><div align="center" class="style9">用户地址</div></td>
<td width="22%"><div align="center" class="style9">用户电话</div></td>
<td><div align="center" class="style9">用户Email</div>  </td>
<td><div align="center" class="style9">删除此用户</div>  </td>
</tr>
<c:forEach var="user" items="${userList}">
<tr bgcolor=#FFFFFF bordercolor=#00addf>
<td width="11%"><div align="center" class="style13"><strong>${user.usersId}</strong></div></td>
<td width="13%"><div align="center" class="style13"><strong>${user.usersName}</strong></div></td>
<td width="13%"><span class="style13">${user.usersTrueName}</span></td>
<td width="19%"><div align="center" class="style13">${user.usersAddress}</div></td>
<td width="22%"><div align="center" class="style13">${user.usersPhone}</div></td>
<td><div align="center" class="style13">${user.usersE_mail}</div>  </td>
<td><div align="center" class="style13"><a href="deleteUser?userId=${user.usersId}"> 删除此用户</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

