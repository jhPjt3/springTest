package com.mvcproject.test.board;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class TestBoardContent {
	private int contentIdx;
	private String contentSubject;
	private String contentText;
	private String contentFile;
	private int contentWriterIdx;
	private int contentBoardIdx;
	private Date contentDate;
	
	public int getContentIdx() {
		return contentIdx;
	}
	public void setContentIdx(int contentIdx) {
		this.contentIdx = contentIdx;
	}
	public String getContentSubject() {
		return contentSubject;
	}
	public void setContentSubject(String contentSubject) {
		this.contentSubject = contentSubject;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}
	public String getContentFile() {
		return contentFile;
	}
	public void setContentFile(String contentFile) {
		this.contentFile = contentFile;
	}
	public int getContentWriterIdx() {
		return contentWriterIdx;
	}
	public void setContentWriterIdx(int contentWriterIdx) {
		this.contentWriterIdx = contentWriterIdx;
	}
	public int getContentBoardIdx() {
		return contentBoardIdx;
	}
	public void setContentBoardIdx(int contentBoardIdx) {
		this.contentBoardIdx = contentBoardIdx;
	}
	public Date getContentDate() {
		return contentDate;
	}
	public void setContentDate(Date contentDate) {
		this.contentDate = contentDate;
	}
	
	
}
