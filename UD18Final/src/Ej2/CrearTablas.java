package Ej2;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class CrearTablas {
	public static void createTableDepartamento(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= BD.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), PRESUPUESTO INT)";
			Statement st= BD.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// Crear Tabla Empleado
	public static void createTableEmpleado(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= BD.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(DNI VARCHAR(9) PRIMARY KEY, NOMBRE VARCHAR(100), APELLIDO VARCHAR(255), DEPARTAMENTO INT, FOREIGN KEY (DEPARTAMENTO) references Departamento(CODIGO) )";
			Statement st= BD.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
}
