package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.ConnectionFactory;

public class Read
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		
		String sql = "SELECT * FROM user";
		
		Statement stmt = conn.createStatement(); //como n há paramatros, so o statement ja é suficiente
		ResultSet result = stmt.executeQuery(sql); //joga no resultset pra poder iterar
		
		int count = 0;
		
		while (result.next()) // .next checa se tem mais coisa depois e imprime ate nao ter mais nada
		{
			String name = result.getString(2);
			String username = result.getString(3); // pode ser passado o index da coluna em relação ao banco
			String password = result.getString("password"); // ou o nome da coluna
			
			String output = "User #%d: %s - %s - %s";
			System.out.println(String.format(output, ++count, name, username, password));
			
		}
		
		conn.close();
		
	}
}
