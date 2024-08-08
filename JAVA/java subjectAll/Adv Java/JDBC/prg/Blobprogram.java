import java.sql.*;
import java.util.*;
import java.io.FileNotFoundException;
public class JDBCDemo31 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException ,FileNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:off/off@localhost:1521:xe");
		PreparedStatement ps=con.prepareStatement("insert into empblob11 values(?,?,?)"); 
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter emp id");
		int eid=sr.nextInt();
		System.out.println("Enter emp name");
		String ename=sr.next();
		System.out.println("Enter emp photo path");
		String path=sr.next();
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		int fileSize=(int)f.length();
		ps.setInt(1,eid);
		ps.setString(2, ename);
		ps.setBinaryStream(3,fis,fileSize);
		int count=ps.executeUpdate();
		System.out.println(count+".record inserted");
	}
}

