package kr.kh.app.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.pagination.Criteria;
import kr.kh.app.pagination.PageMaker;
import kr.kh.app.service.BoardService;
import kr.kh.app.service.BoardServiceImp;


@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService boardService = new BoardServiceImp();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 검색어와 검색 타입을 가져옴. 현재 페이지 정보도 가져옴
		String search = request.getParameter("search");
		String type = request.getParameter("type");
		int page;
		// 값이 없는데 문자열로 변환 하는 경우에 예외가 발생할 수 있기 때문에
		try {
			page = Integer.parseInt(request.getParameter("page"));
		}catch(Exception e) {
			page = 1;
		}

		// 검색어, 검색타입, 현재 페이지, 한 페이지 컨텐츠 개수를 이용하여 현재 페이지 정보 객체를 생성함
		Criteria cri = new Criteria(page, 2, type, search);
		// 검색어, 검색타입에 맞는 전체 게시글 개수를 가져옴
		int totalCount = boardService.gerTotalCount(cri);
		PageMaker pm = new PageMaker(5, cri, totalCount);
		// 생성한 객체를 화면에 전달
		request.setAttribute("pm", pm);
		
		// 현재 페이지 정보에 맞는 게시글 리스트 (서비스에게 현재 페이지 정보를 주면서 게시글 리스트를 달라고 요청)
		ArrayList<BoardVO> list = boardService.getBoardList(cri); // 매게변수로 cri를 넘겨줌
		// 화면에 게시글 리스트를 전송 : 화면에서 사용할 이름 = List
		request.setAttribute("list", list); 
		request.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(request, response);
	}
}
