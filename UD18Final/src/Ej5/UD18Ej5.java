package Ej5;

public class UD18Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseDatos.BD.openConnection();
		BaseDatos.BD.createDB("BDUD18EJ5");
		CrearTablas.createTableDespacho("BDUD18EJ5","Despacho");
		CrearTablas.createTableDirectores("BDUD18EJ5","Directores");
		InsertarDatos.insertDespacho("BDUD18EJ5","Despacho", "Despacho1", 15);
		InsertarDatos.insertDirector("BDUD18EJ5", "Directores", "12345678A", "Juan Pérez", "12345678A", 1 );
		InsertarDatos.insertDespacho("BDUD18EJ5","Despacho", "Despacho2", 15);
		InsertarDatos.insertDirector("BDUD18EJ5", "Directores", "22345678A", "Juan Pérez", "12345678A", 2 );
		InsertarDatos.insertDespacho("BDUD18EJ5","Despacho", "Despacho3", 15);
		InsertarDatos.insertDirector("BDUD18EJ5", "Directores", "32345678A", "Pedro Pérez", "12345678A", 3 );
		InsertarDatos.insertDespacho("BDUD18EJ5","Despacho", "Despacho4", 15);
		InsertarDatos.insertDirector("BDUD18EJ5", "Directores", "42345678A", "Pepe Pérez", "12345678A", 4 );
		InsertarDatos.insertDespacho("BDUD18EJ5","Despacho", "Despacho5", 15);
		InsertarDatos.insertDirector("BDUD18EJ5", "Directores", "52345678A", "Walter Pérez", "12345678A", 5 );
		
		BaseDatos.BD.closeConnection();
	}


}
