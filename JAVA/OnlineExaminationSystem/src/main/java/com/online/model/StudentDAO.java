package com.online.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maneesha", "root", "root");
		return con;
	}
	public boolean addStudent(Student s) throws ClassNotFoundException, SQLException {
		boolean b=false;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student1(sname,email,contactno,suname,spswd) values(?,?,?,?,?)");
		ps.setString(1, s.getSname());
		ps.setString(2, s.getEmail());
		ps.setString(3, s.getContactno());
		ps.setString(4, s.getSuname());
		ps.setString(5, s.getSpswd());
		int result=ps.executeUpdate();
		if(result>0) {
			b=true;
		}
		return b;
	}	
	public boolean validStudent(String suname,String spswd) throws ClassNotFoundException, SQLException {
		boolean b=false;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student1 where suname=? and spswd=?");
		ps.setString(1, suname);
		ps.setString(2, spswd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			b=true;
		}
		return b;
	}
	public boolean validAdmin(String aname,String apswd) throws ClassNotFoundException, SQLException {
		boolean b=false;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from adminlogin where aname=? and apswd=?");
		ps.setString(1, aname);
		ps.setString(2, apswd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			b=true;
		}
		return b;
	}
	public boolean addQuestion(Question q) throws ClassNotFoundException, SQLException {
		boolean b=false;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into questions(qid,qname,option1,option2,option3,option4,correct) values(?,?,?,?,?,?,?)");
		ps.setInt(1, q.getQid());
		ps.setString(2, q.getQname());
		ps.setString(3, q.getOption1());
		ps.setString(4, q.getOption2());
		ps.setString(5, q.getOption3());
		ps.setString(6, q.getOption4());
		ps.setString(7, q.getCorrect());
		int result=ps.executeUpdate();
		if(result>0) {
			b=true;
		}
		return b;
	}
	public List<Question> listQuestions() throws ClassNotFoundException, SQLException {
		List<Question> list = new ArrayList<Question>();
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from Questions");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Question q = new Question();
			q.setQid(rs.getInt(1));
			q.setQname(rs.getString(2));
			q.setOption1(rs.getString(3));
			q.setOption2(rs.getString(4));
			q.setOption3(rs.getString(5));
			q.setOption4(rs.getString(6));
			q.setCorrect(rs.getString(7));
			list.add(q);
		}
		return list;
	}
}
