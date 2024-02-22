package kr.kh.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.kh.app.model.dto.LoginDTO;
import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.service.MemberService;
import kr.kh.app.service.MemberServiceImp;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService memberService = new MemberServiceImp();    
    
    // 화면에서 전달한 id와 pw를 콘솔창에 출력    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberVO user = memberService.login(new LoginDTO(id, pw));

		
		// 로그인 후 로그인을 로그아웃 전까지 유지시키기 위해서 서버에 세션에 저장 (로그아웃 하면 세션은 사라짐)
		if(user != null) {
			// 세션에 회원 정보를 저장하여 로그인 유지
			HttpSession session = request.getSession(); // request에 있는 세션을 가져옴
			session.setAttribute("user", user); // 세션에 user라는 이름으로 회원 정보를 저장합니다.
			response.sendRedirect(request.getContextPath() + "/"); // 성공했을때 메인페이지로 이동 시킵니다.
		}else {
			doGet(request, response); // 실패하면 그 페이지에 있는다.
		}
	}

}
