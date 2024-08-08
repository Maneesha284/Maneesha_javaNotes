import java.sql.*;
public class JDBCDemo33 {
	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:off/off@localhost:1521:xe");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select eid,ename,esal,addr from emp4");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));	
		}
		rs.last();
		rs.updateString(2, "nayana");
		rs.updateRow();
		rs.absolute(4);
	}
}