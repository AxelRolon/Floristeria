package Tienda;

import java.util.Scanner;

import Productos.Art_Arbol;
import Productos.Art_Factory;
import Productos.Art_Flores;
import Productos.Decoracion;
import Productos.Floristeria;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Floristeria compra= new Floristeria ("Flores");
		compra.addArticulo(new Art_Flores("Girasol", 2, 6.0, "Amarillo"));
		compra.addArticulo(new Art_Arbol("Tacuarandu", 4, 150.0, 30));
		compra.addArticulo(new Decoracion("Canasta", 24, 20.0, "Madera"));
		printStock(compra);

	}
	
	private static void printFlores(Floristeria compra) {
		System.out.println("Flores ");
		for(Art_Factory flower : compra.getFlores()) {
			System.out.println("\t- " + flower.getInformacionArticulo());
		}
	}
	private static void printArboles(Floristeria compra) {
		System.out.println("arbol:");
		for(Art_Factory arboles : compra.getArbol()) {
			System.out.println("\t- " + arboles.getInformacionArticulo());
		}
	}
	private static void printDecoracion(Floristeria compra) {
		System.out.println("Decoracion:");
		for(Art_Factory decoracion : compra.getDecoracion()) {
			System.out.println("\t- " + decoracion.getInformacionArticulo());
		}
	}
	private static void printStock(Floristeria compra) {
		System.out.println("Stock:");
		printArboles(compra);
		printFlores(compra);
		printDecoracion(compra);
	}

}
