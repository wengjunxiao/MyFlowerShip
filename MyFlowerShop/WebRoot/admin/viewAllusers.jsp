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
<h1 class="style3">�鿴�û���Ϣ</h1>
<table width=91% border="1" bordercolor="#00addf" bgcolor="#00addf">
<tr bgcolor="#00addf" bordercolor="#00addf">
<td width="11%"><div align="center" class="style4 style5"><strong>�û���</strong></div></td>
<td width="13%"><div align="center" class="style4 style5"><strong>�û���</strong></div></td>
<td width="13%"><span class="style9">�û���ʵ����</span></td>
<td width="19%"><div align="center" class="style9">�û���ַ</div></td>
<td width="22%"><div align="center" class="style9">�û��绰</div></td>
<td><div align="center" class="style9">�û�Email</div>  </td>
<td><div align="center" class="style9">ɾ�����û�</div>  </td>
</tr>
<c:forEach var="user" items="${userList}">
<tr bgcolor=#FFFFFF bordercolor=#00addf>
<td width="11%"><div align="center" class="style13"><strong>${user.usersId}</strong></div></td>
<td width="13%"><div align="center" class="style13"><strong>${user.usersName}</strong></div></td>
<td width="13%"><span class="style13">${user.usersTrueName}</span></td>
<td width="19%"><div align="center" class="style13">${user.usersAddress}</div></td>
<td width="22%"><div align="center" class="style13">${user.usersPhone}</div></td>
<td><div align="center" class="style13">${user.usersE_mail}</div>  </td>
<td><div align="center" class="style13"><a href="deleteUser?userId=${user.usersId}"> ɾ�����û�</a></div>  </td>
</tr>
</c:forEach>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</center>
</body>
</html>

