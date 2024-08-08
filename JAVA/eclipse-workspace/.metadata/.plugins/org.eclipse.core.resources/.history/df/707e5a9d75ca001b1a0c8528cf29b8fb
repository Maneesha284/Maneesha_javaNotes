package serialize;

import java.io.*;

public class StudentTest {

	public static void main(String[] args) {
		try {
			InputStream is =new FileInputStream("student.dat");
			ObjectInputStream ois =new ObjectInputStream(is);
			while(true) {
				Student s= (Student)ois.readObject();
				System.out.println(s.getSno()+"  "+s.getSname()+"  "+s.getAge());
				
			}
		}
		catch(Exception e) {
			return;
		}
		

	}

}
