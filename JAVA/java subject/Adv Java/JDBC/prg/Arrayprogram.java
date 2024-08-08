import java.sql.*;
import java.io.*;
public class JDBCDemo30 {
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException,  ClassNotFoundException  {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:off/off@localhost:1521:xe");
		Statement st=con.createStatement();
		int count=st.executeUpdate("insert into std1 values('anu', subnumber(40,41,42,43))");
		System.out.println(count+" record inserted");
		ResultSet rs=st.executeQuery("select * from std1");
		System.out.println("sname\t\tsno");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t\t");
			Array obj=rs.getArray(2);
			ResultSet rs1=obj.getResultSet();
			while(rs1.next()) {
				System.out.print(rs1.getInt(2)+"\t");
			}
			System.out.println();
		}
	}
}

