package com.mvcproject.member.controller.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvcproject.member.controller.model.vo.Member;

@Repository //repository는 dao에다/ @controller(클래스에다)  , 둘 다 기본 기능은 클래스를 자동으로 생성해 동작할 수 있게 해줌
public class MemberDao {

	@Autowired // di(spring의 특징)
	private SqlSessionTemplate sqlSession;
	
	public MemberDao() {
		
	}
	public List<Member> selectMemberAll() throws Exception {
		List<Member> memberList = sqlSession.selectList("Member.selectMemberAll");
		return memberList;
	}
	public Member selectMember(String userid) throws Exception{ //문자열로 userid넣어주기
		Member member = sqlSession.selectOne("Member.selectMember", userid); //db와 연결됨
		return member;
	}
	//INSERT UPDATE DELETE는 리턴 값이 INT임.
	public int deleteMember (Member member) throws Exception{ //member-mapper에서 deleteMember 만듦
		int cnt = sqlSession.delete("Member.deleteMember", member);
										//namespace, 쿼리아이디
		return cnt;
	}
	public int insertMember (Member member) throws Exception{ /////
		int cnt = sqlSession.insert("Member.insertMember", member);
		return cnt;
	}
	public int updateMember (Member member) throws Exception{
		int cnt = sqlSession.update("Member.updateMember", member);
		return cnt;
	}
}
