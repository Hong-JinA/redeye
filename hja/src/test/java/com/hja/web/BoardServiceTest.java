package com.hja.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hja.domain.BoardVO;
import com.hja.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardServiceTest {
	@Inject
	BoardService service;

	private static Logger logger = LoggerFactory.getLogger(BoardServiceTest.class);

	@Test
	public void testListAll() throws Exception {
		logger.info(service.listAll().toString());
	}
	@Test
	public void testRegist() throws Exception {
		BoardVO bvo = new BoardVO();
		
		bvo.setTitle("ssssssssssssss");
		bvo.setContent("sssssssssssssssssssssssssssssssss");
		bvo.setWriter("ss");
		bvo.setRegdate("2017-09-07 09:05:00.0");
		
		service.regist(bvo);
	}

}
