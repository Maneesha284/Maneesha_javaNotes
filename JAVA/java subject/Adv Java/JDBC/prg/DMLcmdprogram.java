import java.sql.*;
public class JDBCDemo35 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:off/off@localhost:1521:xe");
		Statement st = con.createStatement();
		int count=st.executeUpdate("insert into emp4 values(107,'aparna',9000,'pune')");
		int count2=st.executeUpdate("update emp4 set ename='lakshmi' where eid=105");
		int count3=st.executeUpdate("delete from emp where eid=104");
		System.out.println(count+" .record inserted");
		System.out.println(count2+" .record updated");
		System.out.println(count3+" .record deleted");	
	}
}