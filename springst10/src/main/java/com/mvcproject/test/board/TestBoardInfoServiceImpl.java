package com.mvcproject.test.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestBoardInfoServiceImpl implements TestBoardInfoService{
	
	@Autowired
	private TestBoardInfoDao testBoardInfoDao;
	
	public List<TestBoardInfo> getTopMenuList() throws Exception {
		List<TestBoardInfo> topMenuList = testBoardInfoDao.getTopMenuList();
		return topMenuList;
	}
}
