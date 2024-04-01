package kr.kh.spring3.model.dto;

import lombok.Data;

@Data
public class LoginDTO {
	private String id;
	private String pw;
	
	public String getIdPw() {
		return id + "," + pw;
	}
}
