package com.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maneesha", "root", "root");
		return con;
	}

	public boolean addUser(User user) throws SQLException, ClassNotFoundException {
		boolean b = false;
		Connection con = getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into users(uname,pswd,email,contact,gender,address) values(?,?,?,?,?,?)");
		ps.setString(1, user.getUname());
		ps.setString(2, user.getPswd());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getContact());
		ps.setString(5, user.getGender());
		ps.setString(6, user.getAddress());
		int res = ps.executeUpdate();
		if (res > 0) {
			System.out.println(res + " record inserted successfully");
			b = true;
		}
		return b;
	}

	public boolean validUser(String uname, String pswd) throws SQLException, ClassNotFoundException {
		boolean b = false;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where uname=? and pswd=?");
		ps.setString(1, uname);
		ps.setString(2, pswd);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			b = true;
		}
		return b;
	}

	public List<User> listUser() throws SQLException, ClassNotFoundException {
		List<User> list = new ArrayList<User>();
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			User u = new User();
			u.setUid(rs.getInt(1));
			u.setUname(rs.getString(2));
			u.setPswd(rs.getString(3));
			u.setEmail(rs.getString(4));
			u.setContact(rs.getString(5));
			u.setGender(rs.getString(6));
			u.setAddress(rs.getString(7));
			list.add(u);
		}
		return list;
	}

	public boolean deleteUser(int uid) throws ClassNotFoundException, SQLException {
		boolean b = false;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("delete from users where uid=?");
		ps.setInt(1, uid);
		int res = ps.executeUpdate();
		if (res > 0) {
			b = true;
		}
		return b;
	}

	static int id = 0;
	public User getUser(int uid) throws ClassNotFoundException, SQLException {
		id = uid;
		User u = new User();
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where uid=?");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			u = new User();
			u.setUid(rs.getInt(1));
			u.setUname(rs.getString(2));
			u.setPswd(rs.getString(3));
			u.setEmail(rs.getString(4));
			u.setContact(rs.getString(5));
			u.setGender(rs.getString(6));
			u.setAddress(rs.getString(7));
		}
		return u;
	}

	public boolean updateUser(User u) throws ClassNotFoundException, SQLException {
		boolean b = false;
		Connection con = getConnection();
		String uname = u.getUname();
		String pswd = u.getPswd();
		String email = u.getEmail();
		String contact = u.getContact();
		String gender = u.getGender();
		String address = u.getAddress();

		PreparedStatement ps = con.prepareStatement("update users set uname=?,pswd=?,email=?,contact=?,gender=?,address=? where uid=" + id + " ");
		ps.setString(1, uname);
		ps.setString(2, pswd);
		ps.setString(3, email);
		ps.setString(4, contact);
		ps.setString(5, gender);
		ps.setString(6, address);

		int res = ps.executeUpdate();
		if (res > 0) {
			b = true;
		}

		return b;

	}
}
