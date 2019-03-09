package ProgOggetti;
import java.sql.*;

/*
 * JDBC è un API che permette ad applicazioni 
 * JAVA di accedere a database SQL ed è definita nel 
 * package java.sql
 */

public class SQLJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //Carica il driver
		String url = "jdbc:mysql://localhost:8080/CRI"; //Specifico il percorso al database
		Connection conn = DriverManager.getConnection(url); //creo la connessione
		String query = "SELCT * FROM CRI.Volontario";
		Statement s = null;
		ResultSet r = null;
		String risultato = "ID_VOLONTARIO | NOME | COGNOME | DATANASCITA | CF " +"\n";
		try {
			//Esecuzione delle query 
			s = conn.createStatement();
			r = s.executeQuery(query);	
			while(r.next()) {
				risultato+= r.getInt("ID_Volontario") + " | ";
				risultato+= r.getString("Nome") + " | ";
				risultato+= r.getString("Cognome") + " | ";
				risultato+= r.getString("DataNascita") + " | ";
				risultato+= r.getString("CF") + " | ";
				risultato+="\n";
			}
			System.out.println("risultato\n"+risultato);
		}catch(SQLException e) {
			System.out.println("SQLException : "+e);
		}finally {
			if( s != null)
				s.close();
		}
		
		
		
		conn.close();
		System.out.println("JAVA");

	}

}
