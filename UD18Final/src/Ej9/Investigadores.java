package Ej9;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class Investigadores extends BD{

	public static void createTableInvestigadores(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Investigadores"
					+ "(DNI VARCHAR(8) PRIMARY KEY, NOMAPELS VARCHAR(255), FACULTAD INT,"
					+ "foreign key(FACULTAD)references Facultad(CODIGO))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertInvestigadores(String db, String DNI, String NOMAPELS, int FACULTAD) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Investigadores (DNI,NOMAPELS,FACULTAD) VALUE(" 
					+ "\"" + DNI + "\","
					+ "\"" + NOMAPELS + "\","
					+FACULTAD+
							");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}
}
