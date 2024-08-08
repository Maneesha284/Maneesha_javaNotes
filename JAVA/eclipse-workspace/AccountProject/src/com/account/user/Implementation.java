package com.account.user;

import java.util.Scanner;

public class Implementation {
	static Scanner sr = new Scanner(System.in);
	User addUsers[] = null;

	public void reigster() {
		System.out.println("How Many Users Can Represent");
		int size = sr.nextInt();
		addUsers = new User[size];
		for (int i = 0; i < addUsers.length; i++) {
			System.out.println("Enter User Id ");
			int uid = sr.nextInt();
			System.out.println("Enter First Name :");
			String fname = sr.next();
			System.out.println("Enter Last Name");
			String lname = sr.next();
			System.out.println("Enter Email ");
			String email = sr.next();
			System.out.println("Enter Mobile Number ");
			long mb = sr.nextLong();
			System.out.println("Enter The PassWord");
			String pass = sr.next();

			User user = new User();
			user.setUserID(uid);
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setEmail(email);
			user.setMobileNo(mb);
			user.setPassword(pass);

			addUsers[i] = user;
			System.out.println("User Register Successfully");
		}
	}

	public boolean verifyLogin(String email, String pass) {
		boolean flag = false;

		for (User user : addUsers) {
			if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
				flag = true;
			}

		}

		return flag;
	}

}
