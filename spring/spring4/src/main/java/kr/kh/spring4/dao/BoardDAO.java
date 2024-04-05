package kr.kh.spring4.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.kh.spring4.model.vo.BoardVO;
import kr.kh.spring4.model.vo.CommunityVO;
import kr.kh.spring4.model.vo.FileVO;
import kr.kh.spring4.pagination.Criteria;

public interface BoardDAO {
	ArrayList<BoardVO> selectBoardList(@Param("cri") Criteria cri);

	int selectBoardTotalCount(@Param("cri") Criteria cri);

	boolean insertBoard(@Param("board") BoardVO board);

	ArrayList<CommunityVO> selectCommunityList();

	void insertFile(@Param("file") FileVO fileVO);
}
