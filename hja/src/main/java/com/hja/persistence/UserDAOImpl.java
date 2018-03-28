package com.hja.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hja.domain.UserVO;
import com.hja.dto.LoginDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"com.hja.mapper.UserMapper";


	@Override
	public void insertUser(UserVO vo) {
		
		sqlSession.insert(namespace+".insertUser", vo);
		
	}
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return sqlSession.selectOne(namespace + ".login", dto);
	}

}