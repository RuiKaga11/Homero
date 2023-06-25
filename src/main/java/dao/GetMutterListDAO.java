package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;

public class GetMutterListDAO {
	public List<Mutter> execute(){
		List<Mutter> mutterList = new ArrayList<>();
		try {
			BaseMutterDAO bmDAO = new BaseMutterDAO();
			Connection conn = bmDAO.getConnection();
			
			// SELECT文の準備
			String sql = "SELECT ID,CATEGORY,HOUR,MINUTE FROM MUTTER ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECT文の実行
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String category = rs.getString("CATEGORY");
				int hour = rs.getInt("HOUR");
				int minute = rs.getInt("MINUTE");
				Mutter mutter = new Mutter(id, category, hour, minute);
				mutterList.add(mutter);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}
	
	public List<Mutter> sortListFind(String sort){
		List<Mutter> mutterList = new ArrayList<>();
		try {
			BaseMutterDAO bmDAO = new BaseMutterDAO();
			Connection conn = bmDAO.getConnection();
			
			// SELECT文の準備
			String sql = "SELECT ID,CATEGORY,HOUR,MINUTE FROM MUTTER WHERE CATEGORY=? ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, sort);
			
			// SELECT文の実行
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String category = rs.getString("CATEGORY");
				int hour = rs.getInt("HOUR");
				int minute = rs.getInt("MINUTE");
				Mutter mutter = new Mutter(id, category, hour, minute);
				mutterList.add(mutter);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}
}
