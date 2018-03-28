package com.hja.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hja.domain.Criteria;
import com.hja.domain.BoardVO;
import com.hja.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class CriteriaTest {
	@Inject
	BoardDAO dao;

	private static Logger logger = LoggerFactory.getLogger(CriteriaTest.class);

	@Test
	public void testCriteria() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(1);
		cri.setPerPageNum(6);
		
		List<BoardVO> list = dao.listCriteria(cri);
		for(BoardVO vo : list) {
			logger.info("bno = "+vo.getBno());
		}
	}
	

}
