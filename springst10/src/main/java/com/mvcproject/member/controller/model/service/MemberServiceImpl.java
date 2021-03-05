package com.mvcproject.member.controller.model.service;
//service에서는 dao를 쓴다
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcproject.member.controller.model.dao.MemberDao;
import com.mvcproject.member.controller.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override //어노테이션 안 적어도 되는데 정확히 하려면 적어줘도 됨
	public List<Member> selectMemberAll() throws Exception{
		List<Member> memberList = memberDao.selectMemberAll();
		return memberList;
	}
	@Override
	public Member selectMember(String userid) throws Exception{
		Member member = memberDao.selectMember(userid);
		return member;
	}
	@Override
	public int insertMember(Member member) throws Exception{
		int cnt = memberDao.insertMember(member);
		return cnt;
		//select query dao를 한번 더 써야 할 수도 있음  나중에 파이널 할 시 아이디 중복체크 하라고 하면
	}
	@Override
	public int updateMember(Member member) throws Exception{
		int cnt = memberDao.updateMember(member);
		return cnt;
	}
	@Override
	public int deleteMember(Member member) throws Exception{
		int cnt = memberDao.deleteMember(member);
		return cnt;
	}
}
