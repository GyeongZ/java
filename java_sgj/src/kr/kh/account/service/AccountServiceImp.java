package kr.kh.account.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.account.dao.AccountDAO;

public class AccountServiceImp implements AccountService {

		private AccountDAO accountDao;
		
		public AccountServiceImp() {
			String resource = "kr/kh/account/config/mybatis-config.xml";
			//DAO클래스명 xxxDao;
			InputStream inputStream;
			SqlSession session;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				session = sessionFactory.openSession(true);
				accountDao = session.getMapper(AccountDAO.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
