package kr.kh.spring2.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {

	private String me_id; 
	private String me_ms; 
	private String me_pw; 
	private String me_email; 
	private String me_authority; 
	private String me_stop; 
	private int me_fail;
}
