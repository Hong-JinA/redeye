package com.hja.service; //service의 역할은 DAO를 호출하기도 하지만 기능을 추가할 때 사용한다. 여러개의 DAO를 호출할 수 있다.

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hja.domain.BoardVO;
import com.hja.domain.Criteria;
import com.hja.domain.SearchCriteria;
import com.hja.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO vo) throws Exception {
		dao.create(vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}
	
	@Override
	public int listCountPaging(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
	
	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}


}
