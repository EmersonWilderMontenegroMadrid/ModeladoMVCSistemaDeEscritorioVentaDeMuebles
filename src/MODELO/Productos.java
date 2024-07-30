
package MODELO;
/*import java.text.DecimalFormat;*/  //LIbreria del DecimalFormat
//Clase Padre
public class Productos {

 
    //Atributos 
     /*private int codigo*/
      private int     idproductos;
      private String  descripcion;
      private String  precio;
      private int     stock;
      private String indicador;
      /*static  int     contador=0;*/
    
    //Constructor de la clase

    public Productos() {
       
        /*contador++;
        DecimalFormat df=new DecimalFormat ("CP000");  //DecimalFormat: Es una clase que permite dar formato textual
        codigo=df.format(contador);   //Da al formato al contador y lo almacena en el atributo codigo*/
    }
    //Metodos Getters y Setters
    //Setter:  Establecer 
    //Getter:  Mostrar
    
    public int getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(int idproductos) {
        this.idproductos = idproductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getIndicador() {     return indicador;  }
    
    public void setIndicador(String indicador) {    this.indicador = indicador;  }
    
    //Metodo propio que retorna un arreglo de tipo object[] para que sea agregado en el jTable
    public Object [] RegistroProducto(int numeracion){
        Object[]fila={numeracion,idproductos,descripcion,precio,stock};
        return fila;
    }
    
    
    /*public Object [] RegistroProducto(int numeracion){
        Object[]fila={numeracion,getIdproductos(),getDescripcion(),getPrecio(),getStock()};
        return fila;
    }*/
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

