<%@ page contentType="text/html; charset=utf-8" language="java" import="com.*,java.util.*,java.io.*" errorPage="error.jsp" %>
<!-- saved from url=(0055)http://www.qdhua.com/class.asp?lx=small&anid=20&nid=218 -->
<HTML><HEAD><TITLE>register</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"><LINK 
href="../registerImage.files/css.css" type=text/css rel=stylesheet>
<STYLE>
TD {
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
.style4 {
	font-size: 18px;
	color: #0000FF;
}
.style1 {	font-family: "幼圆";
	font-size: 18px;
	color: #FF0000;
}
.style5 {font-size: 16px}
</STYLE>

<SCRIPT language=JavaScript>
function IsDigit()
{
  return ((event.keyCode >= 48) && (event.keyCode <= 57));
}
</SCRIPT>


<META content="MSHTML 6.00.2900.2802" name=GENERATOR></HEAD>
<BODY 
onmouseover="window.status=' 如果您喜欢本站,别忘了把本站介绍给您的好友哦！：）';return true" 
leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<p>&nbsp;</p>
<p>

</p>
<p> 
    
</p>
<FORM  ACTION=addGood method=post>
<TABLE width="378" height=450 
      border=0 align=center>
  <TBODY>
    <TR bgColor=#fcfcfc>
      <TD width="51%" bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★ </span>名&nbsp;&nbsp; 称：</div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT id=goodsName name=good.goodsName maxLength=20 value="${goodInfo.goodsName}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center"><span class="style4"><span class="style1">★</span> <span class="style5">花&nbsp;&nbsp;&nbsp; 材</span>： </span></div></TD>
      <TD bgcolor="#FFFFFF"><div align="left"><FONT color=#cb6f00>
          <INPUT name=good.goodsmaterial id=goodsmaterial maxLength=20 value="${goodInfo.goodsmaterial}";>
      </FONT></div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★</span> <span class="style5">包&nbsp;&nbsp;&nbsp; 装</span>： </div></TD>
      <TD bgcolor="#FFFFFF"><div align="left"><FONT color=#cb6f00>
          <INPUT id=goodsPackage name=good.goodsPackage maxLength=20 value="${goodInfo.goodsPackage}";>
      </FONT></div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★ </span><span class="style5">花&nbsp;&nbsp;&nbsp; 语</span>：</div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT name=good.goodsLanguage id=goodsLanguage maxlength="20" value="${goodInfo.goodsLanguage}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★ </span><span class="style5">价&nbsp;&nbsp;&nbsp; 格</span>：</div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT name=good.goodsPrice id=goodsPrice maxlength="20" value="${goodInfo.goodsPrice}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD width="51%" bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★ </span><span class="style5">商品积分</span>： </div></TD>
      <TD width="49%" bgcolor="#FFFFFF"><div align="left"><FONT color=#cb6f00>
          <INPUT name=good.goodsCent id=goodsCent maxlength="20" value="${goodInfo.goodsCent}";>
      </FONT></div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★ </span><span class="style5">配送范围</span>：</div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT name=good.goodsScope id=goodsScope maxlength="20" value="${goodInfo.goodsScope}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★</span> <span class="style5">适用场合</span>： </div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT 
            name=good.goodsPlace id=goodsPlace maxlength="20" value="${goodInfo.goodsPlace}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★</span> <span class="style5">商品状态</span>： </div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT 
            name=good.goodsHabitus id=goodsHabitus maxlength="20" value="${goodInfo.goodsHabitus}";>
      </div></TD>
    </TR>
    <TR bgColor=#fcfcfc>
      <TD bgcolor="#FFFFFF">
      <div align="center" class="style4"><span class="style1">★</span> <span class="style5">类别</span>： </div></TD>
      <TD bgcolor="#FFFFFF"><div align="left">
          <INPUT 
            name=good.sortName id=sortName maxlength="20" value="${goodInfo.sortName}";>
      </div></TD>
    </TR>
    <TR bgColor=#FFFFFF>
      <TD colSpan=2 align=middle><input name="submit" type="submit" value="提交信息"></TD>
    </TR>
  </TBODY>
</TABLE>
</FORM>
<div align="center"><font color="#ff0000" size="4">${Msg}</font></div>
<p>&nbsp;</p>
</BODY></HTML>
