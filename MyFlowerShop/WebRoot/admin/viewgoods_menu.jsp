<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*"%>
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
<p align="center" class="style3">&nbsp;</p>
<p align="center" class="style3">&nbsp;</p>
<form action="queryGood" method="post" name="form1" id="form1">
  <p align="center" class="style1">�� <a href="viewAllGoods"> �鿴������Ʒ</a> </p>
  <p align="center" class="style1">	�� <span class="style4">����Ʒ�Ž��в���:</span>
  <input name="queryId" type="text" id="category">
  <input type="submit" name="Submit" value="����">
</form>
<form action="queryGood" method="post" name="form2" id="form2">
<div align="center">
  <p class="style1">�� <span class="style4">����Ʒ�����в���:</span>    
    <input name="queryName" type="text" id="category2">
    <input type="submit" name="Submit2" value="����">
  </p></form>
  <form action="queryGood" method="post" name="form3" id="form3">
  <p class="style1">��<span class="style4">&nbsp;&nbsp; ���۸���в���:

</span>
    <input name="queryPrice" type="text" id="category3">
    <input type="submit" name="Submit3" value="����">
</p>
  </form>
</div>
<p align="center" class="style1">&nbsp;  </p>

<p align="center" class="style1">&nbsp;</p>
<p align="center" class="style1 style4">&nbsp;</p>
</body>
</html>
