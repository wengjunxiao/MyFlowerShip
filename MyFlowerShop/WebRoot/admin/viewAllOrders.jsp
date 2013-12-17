<%@ page contentType="text/html; charset=utf-8" language="java" import="com.*,java.util.*,java.io.*"%>
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
-->
</style>
</head>
<body>
<center>
<h1 class="style3">查看订单信息</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="13%"><div align="center" class="style4 style5"><strong>订单Id</strong></div></td>
<td width="21%"><div align="center" class="style4 style5"><strong>用户名</strong></div></td>
<td width="11%"><div align="center"><span class="style9">总价值</span></div></td>
<td width="30%"><div align="center" class="style9">订单时间</div></td>
<td width="25%"><div align="center" class="style9">删除此订单</div>  </td>
</tr>
<c:forEach var="order" items="${orderList}">
<tr bgcolor="#FFFFFF" bordercolor="#00addf">
<td width="13%"><div align="center" class="style13"><strong>${order.ordersId}</strong></div></td>
<td width="21%"><div align="center" class="style13"><strong>${order.usersName}</strong></div></td>
<td width="11%"><div align="center"><span class="style13">${order.ordersPrice}</span></div></td>
<td width="30%"><div align="center" class="style13">${order.ordersDatetime}</div></td>
<td width="25%"><div align="center" class="style13"><a href="deleteOrder?orderId=${order.ordersId}"> 删除此订单</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

