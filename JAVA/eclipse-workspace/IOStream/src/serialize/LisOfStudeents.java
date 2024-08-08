package serialize;

import java.io.*;

public class LisOfStudeents {

	public static void main(String[] args) {
		OutputStream is;
		ObjectOutputStream ois;
		try {
			is =new FileOutputStream("student.dat");
			ois=new ObjectOutputStream(is);
			Student s1= new Student(101,"Harika",23);
			Student s2= new Student(102,"Jyothi",28);
			Student s3= new Student(103,"Mani",25);
			Student s4= new Student(104,"Nithya",33);
			Student s5= new Student(105,"Kalyani",22);
			Student s6= new Student(106,"Archana",23);
			ois.writeObject(s1);
			ois.writeObject(s2);
			ois.writeObject(s3);
			ois.writeObject(s4);
			ois.writeObject(s5);
			ois.writeObject(s6);
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
