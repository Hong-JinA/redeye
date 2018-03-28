package com.hja.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DataSourceTest {
	@Inject //스프링이 생성해서 주입해 주므로 개발자가 객체 생성 혹은 다른 작업 필요 없다.
	private DataSource ds; //database 연동 코드
	
	@Test
	public void testConnection() throws Exception {
		try(Connection con = ds.getConnection()) {
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
