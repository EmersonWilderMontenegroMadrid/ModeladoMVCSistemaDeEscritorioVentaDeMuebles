package MODELO;
import java.text.DecimalFormat;
public class Boleta extends Productos{
    //Atributos Estaticos
    static final double igv=8.19;
    static int cont=0;
    //Atributos
    private String cant_Producto;
    private String Fecha;
    private double importe;
    private double subtotal;
    private double total;
    //Constructor
    public Boleta() {
        cont++;
        DecimalFormat df = new DecimalFormat("000000");
    }
    //geter setter
    public String getCant_Producto() {
        return cant_Producto;
    }
    public void setCant_Producto(String cant_Producto) {
        this.cant_Producto = cant_Producto;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Object[] RegistroProductosVentas(int numeracion){//numeracion->de la tabla
        Object[]fila ={numeracion,importe};
        return fila;
    }
    /*public double CalcularImporte(){
        importe=precio*cant_Productos;
    }*/
}
