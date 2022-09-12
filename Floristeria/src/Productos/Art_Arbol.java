package Productos;

public class Art_Arbol extends Art_Factory {
	private double altura;

    public Art_Arbol(String nombre, int cantidad, double precio, double altura) throws Exception{
        super(nombre, cantidad, precio);
        setAltura(altura);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) throws Exception{
    	if(altura <= 0) throw new Exception("altura incorrecta");
        this.altura = altura;
    }

    @Override
    public String getInformacionArticulo() {
        return (getNombre() + " de altura " + altura 
                + getCantidad() + " unidades "
                + getPrecio()+" precio valorado");
    }
}



