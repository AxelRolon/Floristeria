package Productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {
	
	// List para almacenar productos de cada tipo y tener un stock detallado
	private String nombre;
	private List<Art_Factory> stock = new ArrayList<>();
	
	public Floristeria(String name) throws Exception{
		setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws Exception{
		if(nombre == null || nombre.equals("")) throw new Exception("El nombre de la floristeria es incorrecta.");
		this.nombre = nombre;
	}
	
	//Public Methods
	public void addArticulo(Art_Factory articulo) throws Exception {
		int i = buscarArticulo(articulo);
		if(i != -1) {
			int newCantidad = stock.get(i).getCantidad()+articulo.getCantidad();
			stock.get(i).setCantidad(newCantidad);
		} else {
			stock.add(articulo);
		}
	}
	public int buscarArticulo(Art_Factory articulo) {
		for(int i = 0; i < stock.size(); i++) {
			if(stock.get(i).getNombre().equalsIgnoreCase(articulo.getNombre())) {
				return i;
			}
		}
		return -1;
	}
	public List<Art_Flores> getFlores(){
		List<Art_Flores> listaFlores = new ArrayList<>();
		for(Art_Factory art : stock) {
			if(art instanceof Art_Flores) {
				listaFlores.add((Art_Flores)art);
			}
		}
		return listaFlores;
	}
	public List<Art_Arbol> getArbol(){
		List<Art_Arbol> listaArboles = new ArrayList<>();
		for(Art_Factory art : stock) {
			if(art instanceof Art_Arbol) {
				listaArboles.add((Art_Arbol)art);
			}
		}
		return listaArboles;
	}
	public List<Decoracion> getDecoracion(){
		List<Decoracion> listaDecoraciones = new ArrayList<>();
		for(Art_Factory art : stock) {
			if(art instanceof Decoracion) {
				listaDecoraciones.add((Decoracion)art);
			}
		}
		return listaDecoraciones;
	}

}
