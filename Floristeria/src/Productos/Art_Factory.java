package Productos;

public abstract class Art_Factory {
	
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Art_Factory(String nombre, int cantidad, double precio) throws Exception{
		if(nombre == null || nombre.equals("")) throw new Exception("no debe dejar un campo vacio");
		this.nombre = nombre;
		setCantidad(cantidad);
		setPrecio(precio);
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}

	// Setters
	public void setCantidad(int cantidad) throws Exception{
		if(cantidad < 0) throw new Exception("Ingresa una cantidad correcta.");
		this.cantidad = cantidad;
	}
	public void setPrecio(double precio) throws Exception{
		if(precio < 0.0) throw new Exception("Ingrese una cantidad correcta");
		this.precio = precio;
	}

	public abstract String getInformacionArticulo();
}


