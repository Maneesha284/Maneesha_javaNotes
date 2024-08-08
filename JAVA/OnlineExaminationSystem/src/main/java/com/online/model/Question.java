package com.online.model;

public class Question {
	private int qid;
	private String qname;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correct;
	
	public Question(int qid, String qname, String option1, String option2, String option3, String option4,
			String correct) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correct = correct;
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", correct=" + correct + "]";
	}
	
	
}
