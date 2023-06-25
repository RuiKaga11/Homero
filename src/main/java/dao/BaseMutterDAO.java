package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseMutterDAO {
	private final String DB_URL = "";	// 接続先DB
	private final String DB_USER = "";	// ユーザー名
	private final String DB_PASS = "";	// パスワード
	
	protected Connection getConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		return conn;
	}
}
