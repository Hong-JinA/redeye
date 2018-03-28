package com.hja.controller;



import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.hja.domain.UserVO;
import com.hja.dto.LoginDTO;
import com.hja.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger =  LoggerFactory.getLogger(UserController.class);

 @Inject 
 private UserService service;

	  @RequestMapping(value = "/signup", method = RequestMethod.GET)
	  public void signupGET() {
	  }
	  
	  @RequestMapping(value = "/signup", method = RequestMethod.POST)
	  public String signupPOST(UserVO user, RedirectAttributes rttr) throws Exception {
		  logger.info("signup post...");

		  service.signup(user);
		  
		  rttr.addFlashAttribute("msg", "SUCCESS");
		  
		  return "redirect:/user/login";
	  }
	  
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public void loginGET(@ModelAttribute("dto") LoginDTO dto) {

	  }
	  
	  @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	  public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {

	    UserVO vo = service.login(dto);

	    if (vo == null) {
	      return;
	    }

	    model.addAttribute("userVO", vo);

	  }

	  
}