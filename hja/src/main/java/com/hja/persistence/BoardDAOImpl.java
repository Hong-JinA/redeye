package com.hja.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.hja.domain.BoardVO;
import com.hja.domain.Criteria;
import com.hja.domain.SearchCriteria;


@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.hja.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace+".create", vo);
	}
	
	@Override
	public BoardVO read(Integer seqno) throws Exception {
		return sqlSession.selectOne(namespace+".read", seqno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);
	}

	@Override
	public void delete(Integer seqno) throws Exception {
		sqlSession.delete(namespace+".delete", seqno);
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace+".listCriteria", cri);
	}
	
	@Override
	public int countPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace+".countPaging", cri);
	}
	
	@Override
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {
		return sqlSession.selectList(namespace+".listSearch", cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return sqlSession.selectOne(namespace+".listSearchCount", cri);
	}





}

