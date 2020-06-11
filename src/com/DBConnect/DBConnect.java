package com.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

	// 7个变量
	private String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String Url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=FlowerDBTest";
	private String User = "sa";
	private String Pwd = "123456";

	// 创建数据库连接
	public Connection conn = null;

	public Connection getConnection()throws SQLException{
		try {
			Class.forName(DriverName);
			conn=DriverManager.getConnection(Url,User,Pwd);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		return conn;
		}
	public static void close(Connection conn,PreparedStatement pstm,ResultSet rs) {
		
		try {
			if(rs!=null);
				rs.close();
			if(pstm!=null);
				pstm.close();
			if(conn!=null)
				conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
