package com.mvcproject.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.member.controller.model.dao.MemberDao;
import com.mvcproject.member.controller.model.service.MemberService;
import com.mvcproject.member.controller.model.vo.Member;

@Controller
public class MemberController {

	@Autowired // 자동생성되게끔? new Member()를 생성 안 해도 됨
	MemberService memberService; // serviceimpl 파일 생성 후 기존 memberDao -> memberService로 다 바꾸기
	
	@RequestMapping(value="memberList.do", method=RequestMethod.GET) //url치고 들어옴
	public ModelAndView memberListService(ModelAndView modelAndView)throws Exception{
		
		List<Member> memberList = memberService.selectMemberAll();
		//LIST에 데이터가 담겨 있음
		
		Member mem1 = memberList.get(0);
		Member mem2 = memberList.get(1);
		Member mem3 = memberList.get(2);
		
		
		//MEMBERLIST.SIZE()는 list 데이터 건수를 리턴 jsp <% %> ${} jstl
	/*	for(int i=0; i<memberList.size(); i++) {
			//System.out.println(i); // memberlist 데이터 갯수만큼 반복
		
			Member member = memberList.get(i); // data 날라가지 않게 리턴해주기
		System.out.println(i+"name"+member.getName());
		System.out.println(i+"passwd"+member.getPasswd());
		//출력시  0name서윤  1name윤 이런 식으로 출력 됨 (디비에 저장되어 있는 데이터와 연동됨)
		}*/
		
		modelAndView.addObject("memberList", memberList); //key, value 값
		//request.setAttribute
		modelAndView.setViewName("member/memberList");//jsp로 넘기기
		
		return modelAndView;
	}
	
	@RequestMapping(value="memberView.do", method=RequestMethod.GET)// 호출해서 실행하기
	public String memberViewService(@RequestParam("id")String id, Model model, HttpServletRequest request)throws Exception{
		
		Member member = memberService.selectMember(id);
		
		model.addAttribute("member", member); //저장해주기, vo member, model일때는 model 리턴x
		
		return "member/memberView"; //jsp 이동
		
	}
	@RequestMapping(value="memberDel.do", method=RequestMethod.GET) // @PostMapping도 있음 , @RequestMapping과 같음
	//@GetMapping("memberDel.do")
	public ModelAndView deleteMember(Member member, ModelAndView modelAndView) throws Exception{
				
		int cnt = memberService.deleteMember(member);
		
		modelAndView.addObject("cnt",cnt); //jsp에서 cnt 가져가기
		modelAndView.setViewName("member/memberDelComplete"); //jsp 이동
		return modelAndView;
	}
	@RequestMapping(value="memberIns.do", method=RequestMethod.GET)  ////
	public ModelAndView insertMember(Member member, ModelAndView modelAndView) throws Exception{
									//html form에서 넘어옴
		int cnt = memberService.insertMember(member);
		
		modelAndView.addObject("cnt", cnt); //몇 건 됐는지 jsp에서 보여주려고
		modelAndView.setViewName("member/memberInsertComplete");
		return modelAndView;
	}
				//입력도와줌(못 적은 부분)
	   @RequestMapping(value="memberForm.do", method=RequestMethod.GET)
	   public ModelAndView memberForm(ModelAndView modelAndView) throws Exception{
	      
	      modelAndView.setViewName("member/memberInsert"); //jsp 이동
	      return modelAndView;
	   }
	   @RequestMapping(value="memberUpt.do", method=RequestMethod.GET)
	   public ModelAndView memberupdate(Member member,ModelAndView modelAndView ) throws Exception{
		   int cnt = memberService.updateMember(member);
		   modelAndView.addObject("cnt", cnt);
		   modelAndView.setViewName("member/memberUpdateComplete");
		   
		   return modelAndView;
	   }
}
