package Ej9;

public class UD18Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String BD="BDUD18EJ9";
		BaseDatos.BD.openConnection();
		BaseDatos.BD.createDB(BD);
		Facultad.createTableFacultad(BD);
		Investigadores.createTableInvestigadores(BD);
		Equipos.createTableEquipos(BD);
		Reserva.createTableReserva(BD);
		Facultad.insertFacultad(BD, "Rovira");
		Facultad.insertFacultad(BD, "Virgili");
		Facultad.insertFacultad(BD, "Ramon");
		Facultad.insertFacultad(BD, "Cajal");
		Facultad.insertFacultad(BD, "Vidal");
		Investigadores.insertInvestigadores(BD, "12345678", "Marc", 1);
		Investigadores.insertInvestigadores(BD, "12345679", "Manolo", 2);
		Investigadores.insertInvestigadores(BD, "12345610", "Matias", 3);
		Investigadores.insertInvestigadores(BD, "12345611", "Estefania", 4);
		Investigadores.insertInvestigadores(BD, "12345612", "Daniel", 5);
		Equipos.insertEquipos(BD, "A1", "Tarragona", 1);
		Equipos.insertEquipos(BD, "A2", "Barcelona", 2);
		Equipos.insertEquipos(BD, "A3", "Madrid", 3);
		Equipos.insertEquipos(BD, "A4", "Badalona", 4);
		Equipos.insertEquipos(BD, "A5", "Sevilla", 5);
		Reserva.insertReserva(BD,"A1","12345678", "2021-02-26","2021-02-27");
		Reserva.insertReserva(BD,"A2","12345679", "2021-02-27","2021-02-28");
		Reserva.insertReserva(BD,"A3","12345610", "2021-02-28","2021-03-01");
		Reserva.insertReserva(BD,"A4","12345611", "2021-03-01","2021-03-02");
		Reserva.insertReserva(BD,"A5","12345612", "2021-03-02","2021-03-03");
		BaseDatos.BD.closeConnection();

		
		
	}

}
