package com.hja.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hja.domain.MemberVO;
import com.hja.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberDAOTest {

	@Autowired
	private MemberDAO dao;

	@Test
	public void testInsertMember() throws Exception {

		MemberVO vo = new MemberVO();
		vo.setM_id("test2");
		vo.setM_pw("test2");
		vo.setM_name("test2");
		dao.insertMember(vo);

	}

}


