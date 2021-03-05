package com.mvcproject.test.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestBoardInfoDao {
	// TopMenu
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<TestBoardInfo> getTopMenuList() throws Exception {
		List<TestBoardInfo> topMenuList = sqlSession.selectList("TestBoardInfo.selectBoardInfoAll");
		return topMenuList;
	}
}
