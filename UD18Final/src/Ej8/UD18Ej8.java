package Ej8;

public class UD18Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String BD="BDUD18EJ8";
		BaseDatos.BD.openConnection();
//		BaseDatos.BD.createDB(BD);
//		Productos.createTableProductos(BD);
//		MaquinasRegistradoras.createTableMaquinasRegistradoras(BD);
//		Cajeros.createTableCajeros(BD);
//		Venta.createTableVenta(BD);
		Productos.insertProductos(BD, "PATATA", 10);
		Productos.insertProductos(BD, "Manzana", 30);
		Productos.insertProductos(BD, "Papadelta", 80);
		Productos.insertProductos(BD, "Cebolla", 60);
		Productos.insertProductos(BD, "Col", 10);
		MaquinasRegistradoras.insertMaquinasRegistradoras(BD, 1);
		MaquinasRegistradoras.insertMaquinasRegistradoras(BD, 2);
		MaquinasRegistradoras.insertMaquinasRegistradoras(BD, 3);
		MaquinasRegistradoras.insertMaquinasRegistradoras(BD, 4);
		MaquinasRegistradoras.insertMaquinasRegistradoras(BD, 5);
		Cajeros.insertCajeros(BD, "Maria");
		Cajeros.insertCajeros(BD, "Magdalena");
		Cajeros.insertCajeros(BD, "Jose");
		Cajeros.insertCajeros(BD, "Paloma");
		Cajeros.insertCajeros(BD, "Dios");
		Venta.insertVenta(BD, 1, 1, 1);
		Venta.insertVenta(BD, 2, 2, 2);
		Venta.insertVenta(BD, 3, 4, 5);
		Venta.insertVenta(BD, 3, 4, 5);
		Venta.insertVenta(BD, 3, 4, 5);
		BaseDatos.BD.closeConnection();

	}

}
