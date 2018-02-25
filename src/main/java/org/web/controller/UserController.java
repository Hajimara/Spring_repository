package org.web.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.web.service.User.UserService;
import org.web.service.domain.UserVO;
import org.web.service.dto.LoginDTO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass());
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto)throws Exception {
		
	}
	
	@RequestMapping(value="/loginPost",method=RequestMethod.POST)
	public void loginPOST(LoginDTO dto,HttpSession session,Model model)throws Exception{
		
		UserVO vo = service.login(dto);
		if(vo==null) {
		return ;
		}
			model.addAttribute("userVO",vo);
			
		
		
		
//		if(dto.isUseCookie()) {
//			int amount = 60*60*24*7;
//			
//			Date sessionLimit = new Date(System.currentTimeMillis()+(1000*amount));
//			
//			service.keepLogin(vo.getUid(), session.getId(), sessionLimit);
//		}
	}
}
/* @ModelAttribute는 받아오는 데이터를 '지정'한다. */
/* Model은 이름 그대로 뷰로 전달할 모델값만 기술 하시면됩니다. */