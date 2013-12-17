<%@ page contentType="text/html; charset=gb2312" language="java" import="com.*,java.util.*,java.io.*" errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="../WEB-INF/c.tld"%>
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
<h1 class="style3">查看留言信息</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="11%"><div align="center" class="style4 style5"><strong>Id</strong></div></td>
<td width="11%"><div align="center" class="style4 style5"><strong>姓名</strong></div></td>
<td width="13%"><div align="center" class="style9">QQ</div></td>
<td width="11%"><div align="center" class="style9">E-mail</div></td>
<td width="21%"><div align="center" class="style9">留言内容</div></td>
<td width="22%"><div align="center" class="style9">留言时间</div></td>
<td width="26%"><div align="center" class="style9">删除此留言</div>  </td>
</tr>
<c:forEach var="leave" items="${leaveMessageList}">
<tr bgcolor="#FFFFFF" bordercolor="#00addf">
<td width="11%"><div align="center" class="style13"><strong>${leave.leaveLanguageId}</strong></div></td>
<td width="11%"><div align="center" class="style13"><strong>${leave.name}</strong></div></td>
<td width="13%"><div align="center" class="style13">${leave.qq}</div></td>
<td width="11%"><div align="center" class="style13">${leave.email}</div></td>
<td width="21%"><div align="center" class="style13">${leave.leaveLanguage}</div></td>
<td width="22%"><div align="center" class="style13">${leave.dateTime}</div></td>
<td width="26%"><div align="center" class="style9"><a href="deleteLeaveMessage?leaveLanguageId=${leave.leaveLanguageId}"> 删除此留言</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

