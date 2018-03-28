package com.hja.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String filename;
	private int readcnt;

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getwriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(regdate);
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
		
		regdate = sdf.format(date);
		this.regdate = regdate;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	@Override
	public String toString() {
		return "BoardVO [title="+title+",content="+content+"]";
	}
}
