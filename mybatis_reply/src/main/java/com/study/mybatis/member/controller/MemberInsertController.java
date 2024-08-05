package com.study.mybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.study.mybatis.member.service.MemberServiceImpl;
import com.study.mybatis.member.vo.Member;


public class MemberInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*
		  Member m = new Member(); m.setUserId(request.getParameter("userId"));
		  m.setUserPwd(request.getParameter("userPwd"));
		  m.setUserId(request.getParameter("userName"));
		  m.setUserId(request.getParameter("email"));
		  m.setUserId(request.getParameter("birthday"));
		  m.setUserId(request.getParameter("gender"));
		 */
		
		Member m = new Member(
				request.getParameter("userId"),
				request.getParameter("userPwd"),
				request.getParameter("userName"),
				request.getParameter("email"),
				request.getParameter("birthday"),
				request.getParameter("gender"),
				request.getParameter("phone"),
				request.getParameter("address")
				);
		
		int result = new MemberServiceImpl().insertMember(m);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath());
		}else {
//			request.getRequestDispatcher("WEB-INF/views/member/memberEnrollForm.jsp").forward(request, response);
			request.setAttribute("errorMsg", "회원가입 실패");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

}
