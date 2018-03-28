package com.hja.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hja.domain.BoardVO;
import com.hja.domain.Criteria;
import com.hja.domain.PageMaker;
import com.hja.service.BoardService;

@Controller
@RequestMapping("/boards/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO vo, Model model) throws Exception {
		logger.info("register get ......");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
		logger.info("register post ......");
		logger.info(vo.toString());

		service.regist(vo);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/boards/listCri";
	}

	@RequestMapping(value = "/listOne", method = RequestMethod.GET)
	public void listOne(Model model) throws Exception {
		logger.info("show one list......");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("show all list......");
		logger.info("test : " +service.listAll().toString());
		
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listCri(Criteria cri, Model model) throws Exception {
		logger.info("show all list......");
		
		model.addAttribute("list", service.listCriteria(cri));
	}
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(Criteria cri, Model model) throws Exception {
		logger.info("show listPage......");
		
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountPaging(cri));


		
		model.addAttribute("pageMaker", pageMaker);
	}

	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {

		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {

		model.addAttribute(service.read(bno));
	}

	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
		service.remove(bno);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/boards/listCri";
	}
	
	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String removePage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {
		service.remove(bno);

		rttr.addAttribute("page", cri.getPage()); //addAttribute은 get방식으로 
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addFlashAttribute("msg", "SUCCESS"); //addFlashAttribute는 session

		return "redirect:/boards/listPage";
	}

	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyGET(int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
		logger.info("mod post......");
		
		logger.info(vo.toString());
		
		service.modify(vo);
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/boards/listCri";
	}
	
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPOST(BoardVO vo, Criteria cri, RedirectAttributes rttr) throws Exception {
		logger.info("modPage post......");
		
		service.modify(vo);
		
		rttr.addAttribute("page", cri.getPage()); //addAttribute은 get방식으로 
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addFlashAttribute("msg", "SUCCESS"); //addFlashAttribute는 session
		
		return "redirect:/boards/listPage";
	}
}
