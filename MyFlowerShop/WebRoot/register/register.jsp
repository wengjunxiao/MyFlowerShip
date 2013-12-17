<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<HTML><HEAD><TITLE>register</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gbk"><LINK 
href="../registerImage.files/css.css" type=text/css rel=stylesheet>
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
.style1 {
	COLOR: #353535
}
.style3 {
	COLOR: #666666
}
</STYLE>

<SCRIPT language=JavaScript>
function IsDigit()
{
  return ((event.keyCode >= 48) && (event.keyCode <= 57));
}
</SCRIPT>

<SCRIPT language=JavaScript>

function checkuserinfo()
{
   if(checkspace(document.userinfo.usersName.value)) {
	document.userinfo.usersName.focus();
    alert("对不起，请填写用户名！");
	return false;
  }
     if(checkspace(document.userinfo.usersTrueName.value)) {
	document.userinfo.usersTrueName.focus();
    alert("对不起，请填写真实姓名！");
	return false;
  }
       if(checkspace(document.userinfo.usersAddress.value)) {
	document.userinfo.usersAddress.focus();
    alert("对不起，请填写您的通讯地址！");
	return false;
  }
         if(checkspace(document.userinfo.usersPhone.value)) {
	document.userinfo.usersPhone.focus();
    alert("对不起，请填写您的联系电话！");
	return false;
  }
    if(checkspace(document.userinfo.usersPass.value) || document.userinfo.usersPass.value.length < 6 || document.userinfo.usersPass.value.length >20) {
	document.userinfo.usersPass.focus();
    alert("密码长度不能不能这空，在6位到20位之间，请重新输入！");
	return false;
  }
    if(document.userinfo.usersPass.value != document.userinfo.usersRepass.value) {
	document.userinfo.usersPass.focus();
	document.userinfo.usersPass.value = '';
	document.userinfo.usersRepass.value = '';
    alert("两次输入的密码不同，请重新输入！");
	return false;
  }
 if(document.userinfo.usersE_mail.value.length!=0)
  {
    if (document.userinfo.usersE_mail.value.charAt(0)=="." ||        
         document.userinfo.usersE_mail.value.charAt(0)=="@"||       
         document.userinfo.usersE_mail.value.indexOf('@', 0) == -1 || 
         document.userinfo.usersE_mail.value.indexOf('.', 0) == -1 || 
         document.userinfo.usersE_mail.value.lastIndexOf("@")==document.userinfo.usersE_mail.value.length-1 || 
         document.userinfo.usersE_mail.value.lastIndexOf(".")==document.userinfo.usersE_mail.value.length-1)
     {
      alert("Email地址格式不正确！");
      document.userinfo.usersE_mail.focus();
      return false;
      }
   }
 else
  {
   alert("Email不能为空！");
   document.userinfo.usersE_mail.focus();
   return false;
   }
}

function checkspace(checkstr) {
  var str = '';
  for(i = 0; i < checkstr.length; i++) {
    str = str + ' ';
  }
  return (str == checkstr);
}

</SCRIPT>

<META content="MSHTML 6.00.2900.2802" name=GENERATOR></HEAD>
<BODY 
onmouseover="window.status=' 如果您喜欢本站,别忘了把本站介绍给您的好友哦！：）';return true" 
leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">


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
  border=0></TD></TR>
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
      src="../registerImage.files/top_wh.gif" width=76 border=0></A></DIV></TD></TR>
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
    </TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=748 align=center 
background=../registerImage.files/bj_x.gif border=0>
  <TBODY>
  <TR>
    <TD height=1></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center border=0>
  <TBODY>
  <TR>
    <TD style="PADDING-TOP: 10px; LETTER-SPACING: 1px" height=40><FONT 
      color=#7f7f7f>您的位置：<SPAN style="FONT-FAMILY: Arial">Home </SPAN>&gt; 
新会员注册</FONT></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=812 align=center bgColor=#cccccc 
border=0>
  <TBODY>
  <TR>
    <TD>
      <FORM  name=userinfo ACTION="register" method="post">
      <TABLE height=321 cellSpacing=1 cellPadding=2 width="812" align=center 
      border=0>
        <TBODY>
        <TR bgColor=#a4ffb8>
          <TD colSpan=2>
            <DIV align=left><FONT color=#4ea3a5><B>　</B></FONT><B><SPAN 
            class=style3>会员注册</SPAN><font color="#ff0000" size="4">${message}</font></B></DIV></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD width="24%">
            <div align="center"><FONT color=#cb6f00>用 户 名：</FONT></div></TD>
          <TD width="76%"><div align="left">
            <INPUT id=usersName 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            maxLength=20 name=user.usersName value=${registerInfo.usersName}> 
            <FONT color=red>*</FONT> 
          中文或英文，请勿有空格</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>密　　码：</FONT><FONT 
            color=#cb6f00> </FONT></div></TD>
          <TD><div align="left"><FONT color=#cb6f00>
            <INPUT id=usersPass 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            type=password maxLength=20 name=user.usersPass> 
            <FONT 
            color=red>*</FONT> </FONT>长度必须大于6个字符小于20个字符</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>确认密码： </FONT></div></TD>
          <TD><div align="left"><FONT color=#cb6f00>
            <INPUT id=usersRepass 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            type=password maxLength=20 name=usersRepass > 
            <FONT 
            color=red>*</FONT> </FONT>请再次输入密码，以免设置密码出错</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>密码提问：</FONT></div></TD>
          <TD><div align="left">
                <INPUT id=usersPassQuestion 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            name=user.usersPassQuestion value=${registerInfo.usersPassQuestion}> 
                用于密码遗忘时使用,可不填</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>密码答案：</FONT></div></TD>
          <TD><div align="left">
                <INPUT id=usersPassReply 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            name=user.usersPassReply value=${registerInfo.usersPassReply}> 
                可不填</div></TD></TR>
        <TR bgColor=#a4ffb8>
          <TD colSpan=2>
            <P><FONT color=#4ea3a5><B class=efont>　</B></FONT><B 
            class=efont><SPAN class=style3>请填写您的个人信息</SPAN></B><BR></P></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD width="24%">
            <div align="center"><FONT color=#cb6f00>真实姓名： </FONT></div></TD>
          <TD width="76%"><div align="left"><FONT color=#cb6f00>
            <INPUT id=usersTrueName 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            name=user.usersTrueName value=${registerInfo.usersTrueName}> 
            </FONT><FONT color=red>*</FONT> 
            送花时我们将向接收人说明</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>联系地址：</FONT></div></TD>
          <TD><div align="left">
            <INPUT id=usersAddress 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            size=30 name=user.usersAddress value=${registerInfo.usersAddress}> 
            <FONT color=red>*</FONT> 
            可简单填写,比如山东.青岛</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>联系电话：</FONT> </div></TD>
          <TD><div align="left">
            <INPUT id=usersPhone 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            name=user.usersPhone value=${registerInfo.usersPhone} > 
            <FONT color=red>*</FONT> 很重要,请一定正确填写</div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD>
            <div align="center"><FONT color=#cb6f00>电子邮件：</FONT> </div></TD>
          <TD><div align="left">
            <INPUT id=usersE_mail 
            style="BORDER-RIGHT: #ffffff 1px groove; BORDER-TOP: #ffffff 1px groove; BORDER-LEFT: #ffffff 1px groove; COLOR: #333333; BORDER-BOTTOM: #ffffff 1px groove; HEIGHT: 18px; BACKGROUND-COLOR: #ffcc66" 
            name=user.usersE_mail value=${registerInfo.usersE_mail}> 
            <FONT color=red>*</FONT> 填写您的电子邮箱，方便联系(格式必须是 xxx@xxx.xxx 的形式) </div></TD></TR>
        <TR bgColor=#fcfcfc>
          <TD align=middle colSpan=2><BR><input type="submit" value="提交信息" onClick="return checkuserinfo();"> (带<FONT 
            color=red>*</FONT>为必填项) 
</TD></TR></TBODY></TABLE>
      </FORM></TD></TR></TBODY></TABLE><BR>
<STRONG></STRONG>


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
