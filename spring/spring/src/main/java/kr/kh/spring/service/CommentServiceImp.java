package kr.kh.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.CommentDAO;
import kr.kh.spring.model.vo.CommentVO;
import kr.kh.spring.pagination.Criteria;

@Service
public class CommentServiceImp implements CommentService {

	@Autowired
	CommentDAO commentDao;

	@Override
	public ArrayList<CommentVO> getCommentList(Criteria cri) {
		// 댓글은 페이지 정보가 없으면 못가져옵니다.
		if(cri == null) {
			return null;
		}
		return commentDao.selectCommentList(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		if(cri == null) {
			return 0;
		}
		return commentDao.selectTotalCount(cri);
	}
}
