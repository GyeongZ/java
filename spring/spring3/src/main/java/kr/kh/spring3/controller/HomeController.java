package kr.kh.spring3.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kh.spring3.model.dto.LoginDTO;
import kr.kh.spring3.model.dto.LoginDTOList;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// PostMapping은 반드시 GetMapping이 있야한다?(x)
	// post방식은 반드시 get방식이 있어야 된다(x)
	//	- 화면 없이 기능이 실행되는 경우가 있어서 그렇다 (ex_게시글 삭제, 로그아웃)
	// => get방식을 사용하는 상황 => 보여줄 화면이 필요할 때
	// => post방식은			=> 기능을 실행할 때(주로 데이터가 URL에 노출되지 않으면서 실행될때, 첨부파일처럼 URL에 데이터를 실을수 없을 때)
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		/*	서버에서 화면으로 데이터를 전송 : 화면(jsp)에 서버에서 보낸 안녕하세요가 출력되도록 작성
		 * 	- model에 담아서 전송
		 *		- 화면에서 쓸 이름(hi)과 보낼 데이터(안녕하세요)를 설정
		 *		- hi : 안녕하세요
		 *		- jsp에서는 ${hi}를 이용하여 출력
		 */
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("hi", "안녕하세요");
		
		return "home";
	}
	
	@GetMapping("/id")
	public String id(String id) {
		System.out.println(id);
		return "redirect:/"; // 콘솔에 아이디 찍히고 끝나고 나서 url이 메인인 / 여기로 이동
							// 위에 loggrt.info가 sysout과 비슷함 근데 주소와 위치 나옴 (INFO : kr.kh.spring3.HomeController - Welcome home! The client locale is ko_KR.)	
	}
	
	// a태그는 무조건 get 방식
	@GetMapping("/name")
	public String name(String name) {
		System.out.println(name);
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(Model model, LoginDTO member) {
		// 화면에 member를 전송하고, 화면에서 id와 pw를 출력하는 코드를 작성
		// 1. model 이라는 객체가 필요
		System.out.println(member);
		model.addAttribute("user", member); // 화면에 데이터를 전송하고
		return "test";
	}
	
	@GetMapping("/hobby")
	public String hobby(String [] hobby){
		if(hobby != null) {
			for(String tmp : hobby){
				System.out.println(tmp);
			}
					
		}
		return "redirect:/";
	}
	
	@GetMapping("/send/object")
	public String sendObject() {
		return "sendobject";
	}
	
	@PostMapping("/send/object")
	public String sendObjectPost(LoginDTOList list) {
		System.out.println(list);
		return "redirect:/send/object";
	}
	
	@GetMapping("/send/path/{num}")
	public String sendPath(@PathVariable("num") int num) {
		System.out.println(num);
		return "redirect:/";
	}
	
	@GetMapping("/ajax")
	public String ajax() {
		
		return "ajax";
	}
}
