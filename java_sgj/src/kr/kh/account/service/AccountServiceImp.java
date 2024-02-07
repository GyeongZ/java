package kr.kh.account.service;

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
