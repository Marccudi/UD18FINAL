package Ej2;

public class UD18Ej2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BaseDatos.BD.openConnection();
		BaseDatos.BD.createDB("Ejercicio2UD18");
		CrearTablas.createTableDepartamento("Ejercicio2UD18","Departamento");
		CrearTablas.createTableEmpleado("Ejercicio2UD18","Empleado");
		InsertarDatos.insertDepartamento("Ejercicio2UD18","Departamento", "I+D", 40000);
		InsertarDatos.insertEmpleado("Ejercicio2UD18", "Empleado", "1234567A", "Juan", "Pérez", 1 );
		InsertarDatos.insertDepartamento("Ejercicio2UD18","Departamento", "RRHH", 40000);
		InsertarDatos.insertEmpleado("Ejercicio2UD18", "Empleado", "2234567A", "Pepe", "Pérez", 2 );
		InsertarDatos.insertDepartamento("Ejercicio2UD18","Departamento", "Limpieza", 40000);
		InsertarDatos.insertEmpleado("Ejercicio2UD18", "Empleado", "3234567A", "Pedro", "Pérez", 3 );
		InsertarDatos.insertDepartamento("Ejercicio2UD18","Departamento", "Marketing", 40000);
		InsertarDatos.insertEmpleado("Ejercicio2UD18", "Empleado", "4234567A", "Richard", "Pérez", 4 );
		InsertarDatos.insertDepartamento("Ejercicio2UD18","Departamento", "Bienestar", 40000);
		InsertarDatos.insertEmpleado("Ejercicio2UD18", "Empleado", "5234567A", "Walter", "Pérez", 5 );
		BaseDatos.BD.closeConnection();	
	}

}