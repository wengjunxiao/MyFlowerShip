<%@ page contentType="text/html; charset=utf-8" language="java" import="com.*,java.util.*,java.io.*" errorPage="error.jsp" %>
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
<h1 class="style3">查看商品信息</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="8%"><div align="center" class="style4 style5"><strong>商品号</strong></div></td>
<td width="7%"><div align="center" class="style9">商品名</div></td>
<td width="8%"><div align="center" class="style9">类别</div></td>
<td width="16%"><div align="center" class="style9">商品材料</div></td>
<td width="14%"><div align="center" class="style9">商品包装</div></td>
<td width="10%"><div align="center" class="style9">单价</div></td>
<td width="9%"><div align="center" class="style9">上架情况</div></td>
<td width="28%"><div align="center" class="style9">删除此商品</div>  </td>
</tr>
<c:forEach var="good" items="${goodList}">
<tr bgcolor="#FFFFFF" bordercolor="#00addf">
<td width="8%"><div align="center" class="style13"><strong>${good.goodsId}</strong></div></td>
<td width="7%"><div align="center" class="style13">${good.goodsName}</div></td>
<td width="8%"><div align="center" class="style13">${good.sortName}</div></td>
<td width="16%"><div align="center" class="style13">${good.goodsmaterial}</div></td>
<td width="14%"><div align="center" class="style13">${good.goodsPackage}</div></td>
<td width="10%"><div align="center" class="style13">${good.goodsPrice}</div></td>
<td width="9%"><div align="center" class="style13">${good.goodsHabitus}</div></td>
<td width="28%"><div align="center" class="style13"><a href="deleteGood?goodsId=${good.goodsId}"> 删除此商品</a></div>  </td>
</tr>
</c:forEach>
</table>
</p>
</center>
</body>
</html>

