package Ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class UD18Ej1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMADA A METODOS MYSQL
				BaseDatos.BD.openConnection();
				//BaseDatos.BD.createDB("BDUD18EJ1");
				//Fabricantes.createTableFabricantes("BDUD18EJ1","Fabricantes");
				//Articulos.createTableArticulos("BDUD18EJ1","Articulos");
				Fabricantes.insertFabricante("BDUD18EJ1","Fabricantes", "Panasonic");
				Fabricantes.insertFabricante("BDUD18EJ1","Fabricantes", "NVIDIA");
				Fabricantes.insertFabricante("BDUD18EJ1","Fabricantes", "Apple");
				Fabricantes.insertFabricante("BDUD18EJ1","Fabricantes", "Microsoft");
				Fabricantes.insertFabricante("BDUD18EJ1","Fabricantes", "ASUS");
				Articulos.insertArticulos("BDUD18EJ1", "Articulos", "Pantalla", 100, 1 );
				Articulos.insertArticulos("BDUD18EJ1", "Articulos", "Grafica", 100, 2 );
				Articulos.insertArticulos("BDUD18EJ1", "Articulos", "MacBook", 100, 3 );
				Articulos.insertArticulos("BDUD18EJ1", "Articulos", "Xbox One x", 100, 4 );
				Articulos.insertArticulos("BDUD18EJ1", "Articulos", "Pantalla2", 100, 5 );
				BaseDatos.BD.closeConnection();
				
	}
		

		

		 

		

}
