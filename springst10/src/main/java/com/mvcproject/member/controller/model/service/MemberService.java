package com.mvcproject.member.controller.model.service;
//dao와 연결, 인터페이스에는 실제 메소드(impl) 구현하지 않고 가상 메소드만 넣어줬음
import java.util.List;

import com.mvcproject.member.controller.model.vo.Member;

public interface MemberService {

	public List<Member> selectMemberAll() throws Exception;
	
	public Member selectMember(String userid) throws Exception;
	
	public int insertMember(Member member) throws Exception;
	
	public int updateMember(Member member) throws Exception;
	
	public int deleteMember(Member member) throws Exception;
	
	//교재 82p  다형성 적용 = 인터페이스름 만든다
	// 컨트롤러는 수정하지 않고도 되게 하는 장점..
	
	//여기에서 먼저 가상 메소드 만들고 9-17행 복사해서 serviceimpl 생성 후 붙여넣기. 
}
