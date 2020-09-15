package com.oracel.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookie
 */
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����cookie
		Cookie  cookie = new Cookie("name", "zs");
		
		// Я��·��
		cookie.setPath("/readCookie");
		
		// ��
		response.addCookie(cookie);
		
		// ��ȡ
		 String val=null;
		Cookie[] cookies = request.getCookies();
		// �ж�
		if (cookies !=null) {
			// ����
			for (Cookie c : cookies) {
				if (c.getName().equals("name")) {
					 val =c.getValue();
				}
			}
			System.out.println(val);
			
			
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
