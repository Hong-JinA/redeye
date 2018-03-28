package com.hja.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hja.domain.BoardVO;
import com.hja.domain.SearchCriteria;
import com.hja.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class SearchBoardServiceTest {

	@Inject
	BoardService service;

	private static Logger logger = LoggerFactory.getLogger(SearchBoardServiceTest.class);

	@Test
	public void testListAll() throws Exception {
		SearchCriteria cri = new SearchCriteria();
		cri.setPage(1);
		cri.setPerPageNum(3);
		cri.setSearchType("t");
		cri.setKeyword("test");
		logger.info(service.listSearchCriteria(cri).toString());
	}


}


