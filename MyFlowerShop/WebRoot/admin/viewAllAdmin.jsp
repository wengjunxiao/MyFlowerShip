<%@ page contentType="text/html; charset=gb2312" language="java" import="com.*,java.util.*,java.io.*"%>
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
.style13 {font-size: 12px; color: #000000;}
-->
</style>
</head>
<body>
<center>
<h1 class="style3">查看所有的管理员</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="11%"><div align="center" class="style4 style5"><strong>Id</strong></div></td>
<td width="13%"><div align="center" class="style9">管理员名</div></td>
<td width="13%"><div align="center" class="style9">密码</div></td>
<td width="26%"><div align="center" class="style9">删除此管理员</div>  </td>
</tr>
<c:forEach var="admin" items="${adminList}">
<tr bgcolor="#FFFFFF" bordercolor="#00addf">
<td width="11%"><div align="center" class="style13"><strong>${admin.adminId}</strong></div></td>
<td width="13%"><div align="center" class="style13">${admin.adminName}</div></td>
<td width="13%"><div align="center" class="style13">${admin.adminPass}</div></td>
<td width="26%"><div align="center" class="style13"><a href="deleteAdmin?adminId=${admin.adminId}"> 删除此管理员</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

