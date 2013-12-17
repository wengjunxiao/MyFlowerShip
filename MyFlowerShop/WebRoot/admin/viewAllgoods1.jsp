<%@ page contentType="text/html; charset=gb2312" language="java" import="com.*,java.util.*,java.io.*" errorPage="error.jsp" %>
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
<h1 class="style3">查看所有的商品</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="11%"><div align="center" class="style4 style5"><strong>商品号</strong></div></td>
<td width="13%"><div align="center" class="style9">商品名</div></td>
<td width="11%"><div align="center" class="style9">类别</div></td>
<td width="21%"><div align="center" class="style9">商品材料</div></td>
<td width="22%"><div align="center" class="style9">商品包装</div></td>
<td width="10%"><div align="center" class="style9">单价</div></td>
<td width="12%"><div align="center" class="style9">上架情况</div></td>
<td width="25%"><div align="center" class="style9">删除此商品</div>  </td>
</tr>

</table>
<p class="style5"> 页次：/ 页 共有种商品
<a href="viewAllgoods.jsp">首页 </a>- 
<a href="viewAllgoods1.jsp?pages=">上一页 </a>- 
</p>
</center>
</body>
</html>

