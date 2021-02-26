package Ej9;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class Reserva extends BD{
	public static void createTableReserva(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Reserva"
					+ "(NUMSERIE CHAR(4), DNI VARCHAR(8), COMIENZO DATETIME, DIN DATETIME,"
					+ "foreign key(NUMSERIE)references Equipos(NUMSERIE),foreign key(DNI)references Investigadores(DNI))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertReserva(String db, String NUMSERIE, String DNI, String COMIENZO, String DIN) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Reserva (NUMSERIE,DNI,COMIENZO, DIN) VALUE(" 
					+ "\"" + NUMSERIE + "\","
					+ "\"" + DNI + "\","
					+ "\"" + COMIENZO + "\","
					+ "\"" + DIN + "\""+
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
