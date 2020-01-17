package com.lol.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConn {
	private static DBConn DBC = new DBConn();
	private DBConn() {};
	static public DBConn getDB() {
		return DBC;
	}
	public Connection getConn() 
	{
		/*String url = "jdbc:mysql://jinwoo.clwsj46gvpjl.ap-northeast-2.rds.amazonaws.com:3306/mydb?user=jinwoo&password=jinwoo2619!";
		String user = "jinwoo";
		String password ="jinwoo2619!";*/
		Connection conn = null;
		try{
			/*Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			System.out.println(conn);*/
			Context initctx = new InitialContext();
			DataSource ds = (DataSource)initctx.lookup("java:comp/env/jdbc/jinwoo");
			conn = ds.getConnection();
			System.out.println(conn);
		}catch(NamingException | SQLException e) {
			System.out.println(e);
		}
		return conn;
	}
	
}
