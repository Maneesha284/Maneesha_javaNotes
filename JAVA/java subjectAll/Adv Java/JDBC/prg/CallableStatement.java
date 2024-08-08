import java.util.*;
import java.sql.*;
import java.sql.Types;
public class JDBCDemo34 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:off/off@localhost:1521:xe");
		CallableStatement cs= con.prepareCall("{call emp_pro(?,?,?,?,?)}");
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter eid number for update sal");
		int eid = sr.nextInt();
		System.out.println("Enter emp inc salary ");
		int sal = sr.nextInt();
		cs.setInt(1, eid);
		cs.setInt(2, sal);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.VARCHAR);
		cs.registerOutParameter(5, Types.NUMERIC);
		cs.execute();
		String ename = cs.getString(3);
		String eaddr = cs.getString(4);
		int esal = cs.getInt(5);
		System.out.println(eid+"\t"+ename+"\t"+eaddr+"\t"+esal);
	}
}