package kr.kh.spring4.dao;

import java.util.ArrayList;

import kr.kh.spring4.model.vo.BoardVO;

public interface BoardDAO {
	ArrayList<BoardVO> selectBoardList();
}
