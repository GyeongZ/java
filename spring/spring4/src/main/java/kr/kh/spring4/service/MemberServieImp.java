package kr.kh.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring4.dao.MemberDAO;

@Service
public class MemberServieImp implements MemberService{

	@Autowired
	MemberDAO memberDao;

	@Override
	public int getMemberCount() {
		return memberDao.selectMemberCount();
	}
}
