package com.mirim.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.user.UserVO;
import com.mirim.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		if (userDAO.getUser(vo) != null) return "getBoardList.do";
		else return "login.jsp";
	}
	
}