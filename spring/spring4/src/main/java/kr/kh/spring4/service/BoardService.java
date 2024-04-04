package kr.kh.spring4.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import kr.kh.spring4.model.vo.BoardVO;
import kr.kh.spring4.model.vo.MemberVO;
import kr.kh.spring4.pagination.Criteria;

public interface BoardService {


	ArrayList<BoardVO> getBoardList(Criteria cri);

	int getBoardTotalCount(Criteria cri);

	boolean insertBoard(BoardVO board, MemberVO user);

}