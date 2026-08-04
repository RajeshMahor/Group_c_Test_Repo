package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CRUD_Operation {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection url,username,pwd
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbi","root","root");
		
//		//insert query
//		String sql =""" 
//				insert into accountDetails(accountNumber,account_Name,currentBalance) 
//				values(default,'Capt. America',1119)""";
//		Statement stmt = con.createStatement();
//		stmt.execute(sql);
//		
//		//update query
//		String sql1 ="""
//			update accountDetails set account_Name='Jarviiis' where accountNumber=1002 """;	
//		stmt.execute(sql1);
//		
//		//delete query
//		String sql2 ="""
//			delete from accountDetails where accountNumber=1001""";
//		stmt.execute(sql2);
//		System.out.println("executed successfully");
		
		
		//using prepared statement
		
//		PreparedStatement pstmt = con.prepareStatement("insert into accountDetails(accountNumber,account_Name,currentBalance) values(?,?,?)");
//		pstmt.setInt(1, 2001);
//		pstmt.setString(2, "Wanda");
//		pstmt.setDouble(3, 2100.30);
//		pstmt.execute();
		
		PreparedStatement pstmt1 = con.prepareStatement("delete from accountDetails where accountNumber=?");
		pstmt1.setInt(1, 10003);
		pstmt1.executeUpdate();
		
		System.out.println("executed successfully");

		try (con;pstmt1){
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
