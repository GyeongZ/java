package kr.kh.spring4.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.spring4.model.vo.MemberVO;

public interface MemberDAO {

	int selectMemberCount();

	MemberVO selectMember(@Param("me_id") String me_id);

	boolean insertMember(@Param("member") MemberVO member);

}
