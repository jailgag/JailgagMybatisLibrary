package com.mybatis.customer.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mybatis.customer.model.Service.CustomerService;
import com.mybatis.customer.model.vo.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/customer/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/views/include/login.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("userId");
		String userPw  = request.getParameter("userPw");
		Customer customer = new Customer(userId, userPw);
		CustomerService cService = new CustomerService();
		Customer result = cService.selectOneByLogin(customer);
		//결과값에 따른 페이지 이동
		if(result != null) {
			//성공시 메인페이지 이동
			//세션에 로그인 정보 저장
			HttpSession session = request.getSession();
			//session.setAttribute("result", result);
			session.setAttribute("userId", result.getUserId());
			session.setAttribute("userName", result.getUserName());
			//System.out.println("테스트");
			response.sendRedirect("/");
		}else {
			//실패시 에러페이지이동
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp")
			.forward(request, response);
		}
	}

}
