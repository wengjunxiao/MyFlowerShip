<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�ޱ����ĵ�</title>
<style type="text/css">
<!--
.style1 {
	font-family: "��Բ";
	font-size: 18px;
	color: #FF0000;
}
.style3 {
	font-family: "����_GB2312";
	font-size: 16px;
	color: #FF0000;
}
body {
	background-image: url();
	background-color: #FFFFFF;
}
.style4 {color: #0000FF}
-->
</style>
</head>

<body>

<p>&nbsp;</p>
<table width="505" height="158" border="0" align="center">
  <form action="queryLeaveMessage" method="post" name="form1" id="form1">
  <tr>
    <td><span class="style1">�� <a href="viewAllLeaveMessage"> �鿴��������</a></span></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><span class="style1">�� <span class="style4">���û������в��ң�</span></span></td>
    <td><span class="style1">
      <input name="queryName" type="text" id="category">
    </span></td>
    <td><span class="style1">
      <input type="submit" name="Submit" value="����">
    </span></td>
  </tr>
</table>
</form>
</body>
</html>
