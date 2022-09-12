package Productos;
public class Decoracion extends Art_Factory{

	   private Material material;

	    public Decoracion (String nombre, int cantidad, double precio, String material) throws Exception{
	        super(nombre,cantidad,precio);
	        setMaterial(material);
	    }

	    public String getMaterial() {
	        return material.toString().toLowerCase();
	    }

	    public void setMaterial(String material) throws Exception{
	        try{
	            this.material = Material.valueOf(material.toUpperCase());
	        }
	        catch (Exception e){
	            throw new Exception("incorrecto");
	        }
	    }

	    @Override
	    public String getInformacionArticulo() {
	        return getNombre() + " tipo de material " + material.toString().toLowerCase() 
	                + getCantidad() + " unidades "
	                + getPrecio()+" valor asignado";
	    }
	
}
