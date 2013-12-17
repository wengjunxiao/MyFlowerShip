package com.flowerShop.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpSession;

/**
 * 过滤处理类
 */
public class SignonFilter implements Filter {
	// 过滤处理的方法
	public void doFilter(final ServletRequest req, final ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hreq = (HttpServletRequest) req;
		HttpServletResponse hres = (HttpServletResponse) res;
		HttpSession session = hreq.getSession();
		String adminIsLogin = null;
		try {
			adminIsLogin = (String) session.getAttribute("loginAdmin");
			if (adminIsLogin != null) {
				System.out.println("在SignonFilter中验证通过");
				// 验证成功，继续处理
				chain.doFilter(req, res);
			} else {
				System.out.println("SignonFilter过滤一个请求");
				hres.sendRedirect("/MyFlowerShop/index.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setFilterConfig(final FilterConfig filterConfig) {
	}

	public void destroy() {
	}

	public void init(FilterConfig config) throws ServletException {
	}

}
