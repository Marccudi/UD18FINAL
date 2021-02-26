package Ej9;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class Equipos extends BD{
	public static void createTableEquipos(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Equipos"
					+ "(NUMSERIE CHAR(4) PRIMARY KEY, NOMBRE VARCHAR(100), FACULTAD INT,"
					+ "foreign key(FACULTAD)references Facultad(CODIGO))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertEquipos(String db, String NUMSERIE, String NOMBRE, int FACULTAD) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Equipos (NUMSERIE,NOMBRE,FACULTAD) VALUE(" 
					+ "\"" + NUMSERIE + "\","
					+ "\"" + NOMBRE + "\","
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
