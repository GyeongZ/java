package db.mybatis.model.vo;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String pw;
	private String email;
	
	public MemberVO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		
	
	}
}
