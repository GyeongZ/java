package kr.kh.spring4.service;

import java.util.ArrayList;

import kr.kh.spring4.model.vo.BoardVO;

public interface BoardService {
	ArrayList<BoardVO> getBoardList();
}
