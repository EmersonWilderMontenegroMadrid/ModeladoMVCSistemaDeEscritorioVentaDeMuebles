package DAO_Productos_Boleta_ReportesP;
//Librerias
import Formatos.MensajesReportes;
import MODELO.Productos;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
public class CRUDReportes extends ConectarBD{
    public CRUDReportes(){}
    //Metodo que muestra en un JTable los registros
    public void MostrarProductosVentasEnTabla(JTable tabla,JLabel etiqueta){
        String tituto[]={"Nro","Id Producto","Descripcion","Precio","Stock"};
        DefaultTableModel modelo = new DefaultTableModel(null,tituto);
        tabla.setModel(modelo);
        try{
            rs = st.executeQuery("SELECT idproductos,descripcion,precio,stock,indicador FROM productos WHERE indicador='S'");
            int contreP=0;
            while(rs.next()){
                contreP++;
                Productos pro = new Productos();
                pro.setIdproductos(rs.getInt(1));
                pro.setDescripcion(rs.getString(2));
                pro.setPrecio(rs.getString(3));
                pro.setStock(rs.getInt(4));
                pro.setIndicador(rs.getString(5));
                modelo.addRow(pro.RegistroProducto(contreP));
            }etiqueta.setText("Cantidad de registro: " +contreP);
            conexion.close();//CERRAMOS LA CONEXION DE LA BASE DE DATOS
        }catch(Exception ex){
            MensajesReportes.M1F5("EROR NO SE PUEDE MOSTRAR LOS REGISTROS DE PRODUCTOS"+ex);
        }
    }
}
