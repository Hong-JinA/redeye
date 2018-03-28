package com.hja.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hja.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"com.hja.mappers.MemberMapper";


	@Override
	public void insertMember(MemberVO vo) {
		
		sqlSession.insert(namespace+".insertMember", vo);
		
	}
}
