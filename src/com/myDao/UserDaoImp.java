package com.myDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DBConnect.DBConnect;
import com.myBean.UserBean;

public class UserDaoImp implements UserDao {

	// 初始化数据库的操作对象
	Connection conn = null;
	PreparedStatement pstmt = null;
	int rs = 0;
	// 创建DBConnect对象
	DBConnect db = new DBConnect();

	@Override
	public boolean add(UserBean ub) {
		
		try {
			//获取数据库连接
			conn = db.getConnection();
			
			//预编译sql
			//insert into meassage values
			//(4,'adsdad','30','2018-4-6','132456789','dadasd')
			
			String sql="insert into [meassage] (content,"+
			"name,telephone) values(?,?,?) ";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, ub.getContent());
			pstmt.setString(2, ub.getName());
			pstmt.setString(3, ub.getTelephone());			
			
			rs=pstmt.executeUpdate();
			//System.out.println(rs);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
