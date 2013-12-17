<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.*,java.util.*"%>
<%@ taglib uri="../WEB-INF/c.tld" prefix="c" %>
<HTML><HEAD><TITLE>cart</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"><LINK 
href="cartImage.files/css.css" type=text/css rel=stylesheet>
<STYLE>TD {
	FONT-SIZE: 9pt; COLOR: #353535; LINE-HEIGHT: 120%
}
BODY {
	FONT-SIZE: 9pt; LINE-HEIGHT: 120%
}
A:link {
	COLOR: #000000; TEXT-DECORATION: none
}
A:visited {
	COLOR: #000000; TEXT-DECORATION: none
}
A:active {
	COLOR: #000000; TEXT-DECORATION: none
}
A:hover {
	RIGHT: 0px; COLOR: #336699; POSITION: relative; TOP: 1px; TEXT-DECORATION: none
}
.white1 {
	FONT-WEIGHT: bold; FONT-SIZE: 9pt; COLOR: #ffffff
}
.blue1 {
	FONT-WEIGHT: bold; COLOR: #00addf
}
.blue2 {
	FONT-WEIGHT: bold; FONT-SIZE: 12pt; COLOR: #00addf
}
</STYLE>

<SCRIPT language=JavaScript type=text/JavaScript>
// 删除选中商品
function deleteAll() {
	var elements = document.getElementsByTagName("input");
	var length = elements.length;
	var URL = "../register/deleteGoods?";
	var count = 0;
	for (var i = 0; i < length; ++i) {
		if (elements[i].type == "checkbox" && elements[i].checked == true) {
			if (count==0){
				URL +="goodsId" + i + "=" + elements[i].id;
			} else {
				URL += "&" + "goodsId" + i + "=" + elements[i].id;
			}
			++count;
		}
	}
	if (count == 0) {
		alert("没有选中任何用户!");
	}
	else {
		self.location.href = URL;
	}
}
// 继续购物
function goOnShooping(){
	document.getElementById("goodsForm").action="../index.jsp";
	document.getElementById("goodsForm").action.submit();
}
// 生成订单
function generateOrder(){
	document.getElementById("goodsForm").action="generateOrder";
	document.getElementById("goodsForm").action.submit();	
}
</SCRIPT>

<STYLE type=text/css>A:link {
	FONT-SIZE: 9pt; TEXT-DECORATION: none
}
UNKNOWN {
	FONT-SIZE: 9pt; COLOR: #f51424
}
UNKNOWN {
	COLOR: #000000
}
UNKNOWN {
	FONT-SIZE: 9pt; COLOR: #000000
}
UNKNOWN {
	FONT-FAMILY: Arial, Helvetica, sans-serif
}
</STYLE>


<META content="MSHTML 6.00.2900.2802" name=GENERATOR></HEAD>


<BODY>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#ffffff 
border=0>
  <TBODY>
  <TR>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=38 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=63 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=59 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=56 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=62 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=16 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=44 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=77 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=82 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=77 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=80 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=72 border=0></TD>
    <TD><IMG height=1 alt="" src="cartImage.files/spacer.gif" width=34 
  border=0></TD></TR>
  <TR>
    <TD colSpan=6 rowSpan=2><IMG height=79 alt="" 
      src="cartImage.files/title_r1_c1.gif" width=294 border=0 name=title_r1_c1></TD>
    <TD bgColor=#ffffff colSpan=7>
      <DIV align=right><A name=top></A><A 
      href="cart.jsp"><IMG height=20 
      src="cartImage.files/top_cart.gif" width=76 border=0></A> <A onfocus=this.blur() 
      href="checkMyInfo.jsp"><IMG height=20 
      src="cartImage.files/top_my.gif" width=76 border=0></A> <A onfocus=this.blur() 
      href="../tourist/help.jsp"><IMG height=20 
      src="cartImage.files/top_faq.gif" width=76 border=0></A>  <A onfocus=this.blur() 
      href="../logout"><IMG height=20 
      src="cartImage.files/top_wh.gif" width=76 border=0></A></DIV></TD></TR>
  <TR>
    <TD bgColor=#ffffff colSpan=7>
      <TABLE height=44 cellSpacing=0 cellPadding=0 width="61%" align=right 
      border=0>
        <TBODY>
          <TR>
            <TD>
              <DIV align=left>订花热线：0532-12345678</DIV></TD>
          </TR>
          <TR>
            <TD>
              <DIV align=left>订花 Q&nbsp;Q：12345678</DIV></TD>
          </TR>
        </TBODY>
      </TABLE></TD></TR>
  <TR>
    <TD><IMG height=27 alt="" src="cartImage.files/title_r2_c1.gif" width=38 
      border=0 name=title_r2_c1></TD>
    <TD><A href="../index.jsp"><IMG height=27 alt="" 
      src="cartImage.files/title_r2_c2.gif" width=63 border=0 name=title_r2_c2></A></TD>
    <TD colspan="11"><A href="../tourist/produceInfo.jsp"><IMG height=27 
      alt="" src="cartImage.files/title_r2_c10.gif" width=77 border=0 
      name=title_r2_c10></A><A href="../tourist/leaveMessage"><IMG height=27 alt="" 
      src="cartImage.files/title_r2_c11.gif" width=80 border=0 
    name=title_r2_c11></A><A href="../tourist/flowersLanguage.jsp"><IMG 
      height=27 alt="" src="cartImage.files/title_r2_c12.gif" width=72 border=0 
      name=title_r2_c12></A><IMG height=27 alt="" src="cartImage.files/title_r2_c13.gif" width=475 
      border=0 name=title_r2_c13></TD>
</TR></TBODY></TABLE>
<DIV align=left><BR></DIV>
<TABLE cellSpacing=1 cellPadding=2 width=812 align=center border=0>
  <TBODY>
  <TR>
    <TD width=397 height=40>
      <DIV class=blue2 align=center>
      <DIV align=left>购物车</DIV><div><font color="#ff0000" size="4">${loginMessage}</div>
      </DIV></TD>
    <TD width=352>
<DIV align=center><IMG height=60 src="cartImage.files/liucheng1.gif" 
      width=235></DIV></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=1 cellPadding=1 width=812 align=center bgColor=#00addf 
border=0>
  <FORM id = "goodsForm" action="deleteGoods" method=post>
  <TBODY>
  <TR bgColor=#00addf>
    <TD width="20%" bgColor=#00addf height=22>
      <DIV class=white1 align=center>选中从购物车中移除</DIV></TD>
    <TD width="25%" height=22>
      <DIV class=white1 align=center>商品名称</DIV></TD>
    <TD width="15%" height=22>
      <DIV class=white1 align=center>单价 (青岛) </DIV></TD>
    <TD class=white1 width="15%" height=22>
      <DIV align=center>数 量</DIV></TD>
   </TR>
<c:forEach var="good" items="${myGoods}">
	<tr bordercolor="#FFFFFF" bgcolor="#FFFFFF">
    <td align="center"><input type="checkbox" name="goodsId" id=${good.goodsId}></td>   
    <td><div align="center"><div>${good.goodsName}</div></td>
	<td><div align="center"><div>${good.goodsPrice}</div></td>
	<td><div align="center"><input type="text" name="${good.goodsId}" width=4 value=1></td>    
  </tr>
</c:forEach>


  <TR bgColor=#ffffff>
    <TD colSpan=6 height=25>
	   &nbsp;
	   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=button value="删除" name="delete" onclick="deleteAll()">
	<DIV align=center>
	<INPUT onFocus=this.blur() 
      onClick="goOnShooping()" type=image height=43 width=93 
      src="cartImage.files/cart01.gif" border=0 name=imageField>  
      <INPUT onfocus=this.blur() 
      onclick="generateOrder()" type=image 
      height=43 width=165 src="cartImage.files/cart04.gif" border=0 name=imageField222 
      ;window.close()?>
      </DIV>
</FORM>
  </TBODY></TABLE><BR>


      <TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#e0e0e0 
border=0>
  <TBODY>
  <TR>
<TD>&nbsp;</TD></TR></TBODY></TABLE>
      <table width=812 height="48" border=0 align=center cellpadding=0 cellspacing=0>
        <tbody>
          <tr>
            <td height="16" bgcolor=#f5f5f5><div align="center"><SPAN class=cfont><FONT 
                        color=#7f7f7f><B><A 
                        href="../admin/CheckLogin.jsp">管理员登陆</A></B></FONT></SPAN></div></td>
          </tr>
          <tr>
            <td height="31" bgcolor=#f5f5f5><div align="center">Copyright &copy;  All Rights Reserved </div></td>
          </tr>
        </tbody>
</table>
<p>&nbsp;</p>
</BODY></HTML>
