package com.hja.service;

import java.util.List;

import com.hja.domain.BoardVO;
import com.hja.domain.Criteria;
import com.hja.domain.SearchCriteria;

public interface BoardService {
	public void regist(BoardVO vo) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void modify(BoardVO vo) throws Exception;
	public void remove(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	public int listCountPaging(Criteria cri) throws Exception;
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;

}
