<%@ page contentType="text/html; charset=GBK" language="java"  %>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<%@ page import="java.sql.*,com.*,java.util.*,java.sql.*" %>
<HTML>
<style type="text/css">
<!--
.style4 {color: #FF0000}
-->
</style>
<HEAD>
<TITLE>add  userinfo into table </TITLE>
</HEAD>
<BODY>
<p>
</p>
<p>
  <SCRIPT language=JavaScript type=text/JavaScript>
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//-->
  </SCRIPT>
</p>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#ffffff 
border=0>
  <TBODY>
    <TR>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=38 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=63 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=59 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=56 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=62 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=16 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=44 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=77 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=82 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=77 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=80 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=72 
border=0></TD>
      <TD><IMG height=1 alt="" src="../registerImage.files/spacer.gif" width=34 
  border=0></TD>
    </TR>
    <TR>
      <TD colSpan=6 rowSpan=2><IMG height=79 alt="" 
      src="../registerImage.files/title_r1_c1.gif" width=294 border=0 name=title_r1_c1></TD>
      <TD bgColor=#ffffff colSpan=7>
        <DIV align=right><A name=top></A><A 
      href="cart.jsp"><IMG height=20 
      src="../blessingImage.files/top_cart.gif" width=76 border=0></A> <A 
      onfocus=this.blur() href="checkMyInfo.jsp"><IMG 
      height=20 src="../registerImage.files/top_my.gif" width=76 border=0></A> <A 
      onfocus=this.blur() href="../tourist/help.jsp"><IMG height=20 
      src="../registerImage.files/top_faq.gif" width=76 border=0></A>  <A onfocus=this.blur() 
      href="../logout"><IMG height=20 
      src="../registerImage.files/top_wh.gif" width=76 border=0></A></DIV></TD>
    </TR>
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
        </TABLE></TD>
    </TR>
    <TR>
      <TD><IMG height=27 alt="" src="../registerImage.files/title_r2_c1.gif" width=38 
      border=0 name=title_r2_c1></TD>
      <TD><A href="../index.jsp"><IMG height=27 alt="" 
      src="../registerImage.files/title_r2_c2.gif" width=63 border=0 
    name=title_r2_c2></A></TD>
      <TD colspan="11"><A href="../tourist/produceInfo.jsp"><IMG height=27 
      alt="" src="../blessingImage.files/title_r2_c10.gif" width=77 border=0 
      name=title_r2_c10></A><A href="../tourist/language.jsp"><IMG height=27 alt="" 
      src="../blessingImage.files/title_r2_c11.gif" width=80 border=0 
    name=title_r2_c11></A><A 
      href="../tourist/flowersLanguage.jsp"><IMG 
      height=27 alt="" src="../blessingImage.files/title_r2_c12.gif" width=72 border=0 
      name=title_r2_c12></A><IMG height=27 alt="" src="../registerImage.files/title_r2_c13.gif" width=482 
      border=0 name=title_r2_c13></TD>
    </TR>
  </TBODY>
</TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=748 align=center 
background=../registerImage.files/bj_x.gif border=0>
  <TBODY>
    <TR>
      <TD height=1></TD>
    </TR>
  </TBODY>
</TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center border=0>
  <TBODY>
    <TR>
      <TD style="PADDING-TOP: 10px; LETTER-SPACING: 1px" height=40><FONT 
      color=#7f7f7f>您的位置：<SPAN style="FONT-FAMILY: Arial">Home </SPAN>&gt; 新会员注册</FONT></TD>
    </TR>
  </TBODY>
</TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#cccccc 
border=0>
  <TBODY>
    <TR>
      <TD>&nbsp;      </TD>
    </TR>
  </TBODY>
</TABLE>
<p>&nbsp;</p>
<p align="center"><span class="style4">恭喜您，您已注册成功，请牢记您的用户名和密码，返回首页进行登陆，谢谢您使用本网站。</span></p>
<p align="center">&nbsp;</p>
<p align="center"><a href="../index.jsp">返回首页</a></p>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#e0e0e0 
border=0>
  <TBODY>
    <TR>
      <TD>&nbsp;</TD>
    </TR>
  </TBODY>
</TABLE>
<table width=812 height="48" border=0 align=center cellpadding=0 cellspacing=0>
  <tbody>
    <tr>
      <td height="16" bgcolor=#f5f5f5><div align="center"><SPAN class=cfont><FONT 
                        color=#7f7f7f><B><A 
                        href="../admin/CheckLogin.jsp">管理员登陆</A></B></FONT></SPAN></div></td>
    </tr>
    <tr>
      <td height="31" bgcolor=#f5f5f5><div align="center">Copyright &copy; All Rights Reserved </div></td>
    </tr>
  </tbody>
</table>
<p>&nbsp;</p>
<p align="center">&nbsp;</p>
<p align="center">&nbsp;</p>
<p align="center"><BR>
  <STRONG></STRONG></p>
</body>
</html>
