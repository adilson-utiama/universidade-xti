package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class IncluirDados {

	public static void main(String[] args) throws SQLException{
		
		String user = "impacta";
		String pass = "Imp@ct@";
		String url = "jdbc:mysql://localhost/cliente-db";
		
		String sql = "insert into cliente values (?, ?, ?, ?, ?, ?)";
		String[] nomes = {"Pedro", "Bino", "JOJO"};
		String[] sobreNomes = {"Utiama", "Barbosa", "Juju"};
		String[] datasNasc = {"1958-11-05", "1999-05-05", "2000-10-10"};
		
		try(
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement stm = con.prepareStatement(sql)){
				
			for (int i = 0; i < nomes.length; i++) {
				stm.setInt(1, i+3);
				stm.setString(2, nomes[i]);
				stm.setString(3, sobreNomes[i]);
				stm.setInt(4, 1);
				stm.setString(5, "M");
				stm.setString(6, datasNasc[i]);
				stm.addBatch();
			}
			stm.executeBatch();
			
		}
		
	}
}
