package kaf.tengo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorLite {
	public static Connection connLite;
	public static void setupConnectorLite() {
		try 
		{
			Class.forName("org.sqlite.JDBC");
			connLite = DriverManager.getConnection("jdbc:sqlite:/home/ritesh/javaee/projects/eclipse-workspace/tengo/src/chinook.db");
			System.out.println("connlite created");
		}
		catch(SQLException se){
	        se.printStackTrace();
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
	}
}
