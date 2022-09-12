package Productos;

public class Art_Flores extends Art_Factory {
	
	 private String color;

	    public Art_Flores(String nombre, int cantidad, double precio, String color) throws Exception{
	        super(nombre, cantidad, precio);
	        setColor(color);
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) throws Exception{
	    	if((color == null)||(color.equals(""))) throw new Exception("Ingresa un color valido");
	        this.color = color;
	    }

	    @Override
	    public String getInformacionArticulo() {
	        return (getNombre() + " de color " + color.toLowerCase() + ": "
	                + getCantidad() + " unidades "
	                + getPrecio()+" valor asignado");
	    }

}
