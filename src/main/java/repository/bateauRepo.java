package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;


public class bateauRepo {
	
	public static List<String> findAll() {
		MysqlDataSource ds = new MysqlDataSource();
		String url ="jdbc:mysql://localhost:3306/bateau?serverTimezone=Europe/Paris";
		String user ="bat";
		String password ="password";
		ds.setUrl(url);
		ds.setUser(user);
		ds.setPassword(password);
		try(
			Connection conn = ds.getConnection();
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("select * from bateau")
		){
			List<String> bateaux = new ArrayList<String>();
			while (res.next()) {
				bateaux.add(res.getString("nom"));
			}
			return bateaux;
		} catch (SQLException e) {
			System.err.println("Erreur lecture MySQL : " + e.getMessage());
			return Collections.singletonList("MYSQL ERROR : " + e.toString() + " : " + e.getMessage());
		}
			
	}

}
