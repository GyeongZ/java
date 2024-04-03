package kr.kh.spring4.service;

import kr.kh.spring4.model.vo.MemberVO;

public interface MemberService {

	int getMemberCount();

	boolean signup(MemberVO member);

	MemberVO login(MemberVO member);

}
