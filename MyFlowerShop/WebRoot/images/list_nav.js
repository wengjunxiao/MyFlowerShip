var t;
t=outlookbar.addtitle('网站用户管理')
outlookbar.additem('增加用户',t,'../addUsers_menu.jsp')
outlookbar.additem('查找用户',t,'../viewUsers_menu.jsp')


t=outlookbar.addtitle('订单信息管理')
outlookbar.additem('增加订单',t,'../addOrder_menu.jsp')
outlookbar.additem('查找订单',t,'../viewOrder_menu.jsp')

t=outlookbar.addtitle('商品信息管理')
outlookbar.additem('增加类别',t,'../addSort_menu.jsp')
outlookbar.additem('增加商品',t,'../addGoods_menu.jsp')
outlookbar.additem('查看商品',t,'../viewgoods_menu.jsp')

t=outlookbar.addtitle('厂商信息管理')
outlookbar.additem('增加厂商',t,'../addProduce_menu.jsp')
outlookbar.additem('查找厂商',t,'../viewProduce_menu.jsp')

t=outlookbar.addtitle('留言信息管理')
outlookbar.additem('增加留言',t,'../addLeaveLauguage_menu.jsp')
outlookbar.additem('查找留言',t,'../viewLeaveLanguage_menu.jsp')


t=outlookbar.addtitle('网站系统管理')
outlookbar.additem('增加管理员账号',t,'../addAdmin_menu.jsp')
outlookbar.additem('查看管理员账号',t,'../viewAdmin_menu.jsp')

t=outlookbar.addtitle('退出管理系统') 
outlookbar.additem('退出管理系统',t,'../../index.jsp')
