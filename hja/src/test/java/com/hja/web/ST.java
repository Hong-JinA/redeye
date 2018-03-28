package com.hja.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hja.domain.BoardVO;
import com.hja.dto.LoginDTO;
import com.hja.service.BoardService;
import com.hja.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ST {

	@Inject
	UserService service;

	private static Logger logger = LoggerFactory.getLogger(ST.class);

	@Test
	public void testRegist() throws Exception {
		LoginDTO dto = new LoginDTO();
		
		dto.setUid("ddd");
		dto.setUpw("ddd");
		
		service.login(dto);
	}

}