package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AcessoBanco {

	public static void main(String[] args) throws Exception{
		
		String user = "impacta";
		String pass = "Imp@ct@";
		String url = "jdbc:mysql://localhost/cliente-db";
		
		String sql = "select * from cliente";
		
		try(
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs =  stm.executeQuery()){
			
			while(rs.next()){
				String s = rs.getString("nm_cliente");
				System.out.println(s);
			}
		}
		
		
		
	}
}
