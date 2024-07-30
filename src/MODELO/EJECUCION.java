package MODELO;

public class EJECUCION {
    double monto_total, descuento, precio, porcentaje;
    int cantidad;

    public EJECUCION(double monto_total, double descuento, double precio, int cantidad, double porcentaje) {
	this.monto_total = monto_total;
	this.descuento = descuento;
	this.precio = precio;
	this.cantidad = cantidad;
	this.porcentaje = porcentaje;
    }

    public double multiplicar(){
	return getPrecio()*getCantidad();
    }

    public double operacion(){
	return getMonto_total()*(getPorcentaje()/100);
    }
    
    public double restar(){
	return getMonto_total()-getDescuento();
    }
    
    //MONTO
    public double getMonto_total() {
	return monto_total;
    }
    public void setMonto_total(double monto_total) {
	this.monto_total = monto_total;
    }
    //DESCUENTO
    public double getDescuento() {
	return descuento;
    }
    public void setDescuento(double descuento) {
	this.descuento = descuento;
    }
    //PRECIO
    public double getPrecio() {
	return precio;
    }
    public void setPrecio(double precio) {
	this.precio = precio;
    }
    //PORCENTAJE
    public double getPorcentaje() {
	return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
	this.porcentaje = porcentaje;
    }
    //CANTIDAD
    public int getCantidad() {
	return cantidad;
    }
    public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
    }
}
