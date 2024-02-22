package kr.kh.app.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.app.dao.MemberDAO;
import kr.kh.app.model.dto.LoginDTO;
import kr.kh.app.model.vo.MemberVO;

public class MemberServiceImp implements MemberService {

	private MemberDAO memberDao;
	
	public MemberServiceImp() {
		String resource = "kr/kh/app/config/mybatis-config.xml";
		SqlSession session;
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			memberDao = session.getMapper(MemberDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean signup(MemberVO memberVO) {
		if(memberVO == null ||
			memberVO.getMe_id() == null ||
			memberVO.getMe_pw() == null ||
			memberVO.getMe_email() == null) {
			return false;
		}
		// 정규표현식 체크 : to do
		try {
			return memberDao.insertMember(memberVO);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public MemberVO login(LoginDTO loginDTO) {
		if(loginDTO == null) {
			return null;
		}
		// 아이디를 주고 회원 정보를 요청합니다 (memberVO user를 요청 => memberDao를 통해서)
		MemberVO user = memberDao.selectMember(loginDTO.getId());
		// 아이디가 잘못 입력되었을때 (일치하는 회원 정보가 없으면)
		if(user == null) {
			return null;
		}
		// 비밀번호가 같은지 확인
		if(user.getMe_pw().equals(loginDTO.getPw())) {
			return user;
		}
		return null;
	}
	
	
}
