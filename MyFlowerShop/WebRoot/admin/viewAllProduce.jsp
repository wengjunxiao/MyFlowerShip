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
.style13 {font-size: 12px; color: #000000;}
-->
</style>
</head>
<body>
<center>
<h1 class="style3">查看厂商信息</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="28%"><div align="center" class="style4 style5"><strong>厂商号</strong></div></td>
<td width="46%"><div align="center" class="style9">厂商名</div></td>
<td width="26%"><div align="center" class="style9">删除此厂商</div>  </td>
</tr>
<c:forEach var="produce" items="${produceList}">
<tr bgcolor="#FFFFFF" bordercolor="#00addf">
<td width="28%"><div align="center" class="style13"><strong>${produce.produceId}</strong></div></td>
<td width="46%"><div align="center" class="style13">${produce.produceName}</div></td>
<td width="26%"><div align="center" class="style13"><a href="deleteProduce?produceId=${produce.produceId}"> 删除此厂商</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

