package com.oracel.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCookie
 */
public class NewCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 创建cookie
		Cookie cookieName  = new  Cookie("userName", "zhangsan");
		Cookie cookiePass  = new  Cookie("userPass", "123456");
		
		//设置携带路径
		cookieName.setPath("/NewCookie");
		cookiePass.setPath("/NewCookie");
		
		// 存
		response.addCookie(cookieName);
		response.addCookie(cookiePass);
		
		response.getWriter().write("sendCookie");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
