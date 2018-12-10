package cn.dkc_1210;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://123.0.0.1:8888/du";
		String user = "dz";
		String pwd = "123";
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stat = con.createStatement();
			stat.execute("insert into userfo(user,pwd) values('dkc','c++')");
			ResultSet rst = stat.executeQuery("select * from userfo");
			while(rst.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Connection con;
		Statement stat;
		ResultSet rst;
		String driverClass = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String url = "jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName = db_database08";
		String user = "dz";
		String pwd = "123";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, user, pwd);
			stat = con.createStatement();
			String name = "dkc",mima = "456";
			String insert = "INSERT INTO userfo(name,pwd) VALUES("+"'"+name+"'"+","+","+mima+")";
			String delet = "DELETE FROM userfo WHERE username = 'dz' ";
			stat.executeQuery(insert);
			stat.executeQuery(delet);
			rst = stat.executeQuery("SELECT * FROM user");
			while(rst.next()) {
				String username = rst.getString("username");
				String password = rst.getString("password");
				System.out.println("用户名:"+username);
				System.out.println("密码:"+password);
			}
			rst.close();
			stat.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
