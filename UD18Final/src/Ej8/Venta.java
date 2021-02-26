package Ej8;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class Venta extends BD{

	public static void createTableVenta(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Venta"
					+ "(CAJERO INT, MAQUINA INT, PRODUCTO INT,PRIMARY KEY(CAJERO, MAQUINA, PRODUCTO),"
					+ "foreign key(CAJERO)references Cajeros(CODIGO),"
					+ "foreign key(MAQUINA)references Maquinas_Registradoras(CODIGO),foreign key(PRODUCTO)references Productos(CODIGO))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertVenta(String db, int CAJERO, int MAQUINA, int PRODUCTO) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Venta (CAJERO,MAQUINA,PRODUCTO) VALUE(" 
					+ CAJERO+","+
					+ MAQUINA+","+
					+ PRODUCTO+
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
