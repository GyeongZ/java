package kr.kh.spring4.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import kr.kh.spring4.dao.BoardDAO;
import kr.kh.spring4.model.vo.BoardVO;

public class BoardServiceImp implements BoardService {


	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {
		return boardDao.selectBoardList();	
	}

	
	
}
