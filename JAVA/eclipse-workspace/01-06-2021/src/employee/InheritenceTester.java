package employee;

import java.util.Scanner;

public class InheritenceTester {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
        System.out.println("Enter  ename, empid and salary");
        Manager manager = new Manager(sr.next(), sr.nextInt(), sr.nextDouble(), ManagerType.HR);
        System.out.println(manager.setSalary());
        System.out.println(manager);
        System.out.println("Enter the name,id salary,speed,Accuracy");
        Cleark clerak = new Cleark(sr.next(), sr.nextInt(), sr.nextDouble(), sr.nextInt(),
                sr.nextInt());
        System.out.println(clerak.setSalary());
        System.out.println(clerak);
	}

}
