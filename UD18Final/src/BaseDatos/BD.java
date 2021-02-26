package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class BD{
	public static Connection conexion;

	
	//METODO QUE ABRE LA CONEXION CON SERVER MYSQL
	public static void openConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.152:3306?useTimezone=true&serverTimezone=UTC","remote","W4WfPjZv");//credenciales temporales
			System.out.println("Server Connected");
			
			
		}catch(SQLException | ClassNotFoundException ex  ){
			System.out.print("No se ha podido conectar con mi base de datos");
			
			System.out.println(ex.getMessage());
			
		}
		
	}
		
	//METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
	public static void closeConnection() {
		try {
	
			conexion.close();
			System.out.print("Server Disconnected");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.print("Error cerrando conexion");
			
		}
	}	
	
	//METODO QUE CREA LA BASE DE DATOS
	public static void createDB(String name) {
		try {
			String Query="CREATE DATABASE "+ name;
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("DB creada con exito!");
			
		JOptionPane.showMessageDialog(null, "Se ha creado la DB " +name+ "de forma exitosa.");
		
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando la DB.");
		}	
	}
	


}
