package com.account.user;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		Implementation impl = new Implementation();

		while (true) {

			System.out.println("---------------------------------------------");
			System.out.println("             1)CreateAccount                 ");
			System.out.println("             2)SignIn                 ");
			System.out.println("             3)SignOut                 ");
			System.out.println("---------------------------------------------");
			System.out.println("Enter The Choice : ");
			int choice = sr.nextInt();
			switch (choice) {
			case 1:
				impl.reigster();
				break;
			case 2:
				System.out.println("Enter Email ");
				String email = sr.next();
				System.out.println("Enter The PassWord");
				String pass = sr.next();
				boolean flag = impl.verifyLogin(email, pass);
				if (flag)
					System.out.println("*****************Valid User******************************");
				else
					System.out.println("*************Invalid UserName And Password*************");
				break;
			case 3:
				System.out.println("Thanks for Using Application!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 3 Between");

			}

		}
	}

}
