package DAO_Productos_Boleta_ReportesP;
/*
C: Crete
r: read
u: update
d: delete

*/
//Librerias
import Formatos.MensajesProductos;
import MODELO.Productos;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class CRUDProductos extends ConectarBD{
    public CRUDProductos(){}
    //Metodo que muestra en un JTable los registros
    public void MostrarCategoriasEnTabla(JTable tabla,JLabel etiqueta){
        String tituto[]={"Nro","Id Producto","Descripcion","Precio","Stock"};
        DefaultTableModel modelo = new DefaultTableModel(null,tituto);
        tabla.setModel(modelo);
        try{
            rs = st.executeQuery("SELECT idproductos,descripcion,precio,stock,indicador FROM productos WHERE indicador='S'");
            int contreg=0;
            while(rs.next()){
                contreg++;
                Productos pro = new Productos();
                pro.setIdproductos(rs.getInt(1));
                pro.setDescripcion(rs.getString(2));
                pro.setPrecio(rs.getString(3));
                pro.setStock(rs.getInt(4));
                pro.setIndicador(rs.getString(5));
                modelo.addRow(pro.RegistroProducto(contreg));
            }etiqueta.setText("Cantidad de registro: " +contreg);
            conexion.close();}
        catch(Exception ex){
            MensajesProductos.M1("EROR NO SE PUEDE MOSTRAR LOS REGISTROS DE PRODUCTOS"+ex);
        }
    }
    //metodo que recibe una categoria y realiza la inserccion en la tabla categoria
    public void InsertarRegistroPro(Productos pro){
        try{//prepramos la consulta agregando 2 parametros(?) a actualizar en el objeto categoria
            ps=conexion.prepareStatement("INSERT INTO productos(descripcion,precio,stock,indicador) VALUES (?,?,?,'S');");
            //actualizar los parametros
            ps.setString(1,pro.getDescripcion());//primer parametros
            ps.setString(2,pro.getPrecio());//segundo parametros
            ps.setInt(3,pro.getStock());  //Tercer parametro
            ps.executeUpdate();//actualiza el scrip y lo ejecuta
            MensajesProductos.M1("Registro insertado...");
            conexion.close();
        }catch(Exception ex){
            MensajesProductos.M1("Error no se puede insertar la categoria "+ex);
        }
    }
    //metodo que permita consultar un registro mediante el codigo
    public Productos ObtenerRegistroPro(int idpro){
        Productos pro =null;
        try{
            rs= st.executeQuery("SELECT idproductos,descripcion,precio,stock,indicador FROM productos where indicador='S' AND idproductos="+idpro);
            if(rs.next()){
                pro = new Productos();
                pro.setIdproductos(rs.getInt(1));
                pro.setDescripcion(rs.getString(2));
                pro.setPrecio(rs.getString(3));
                pro.setStock(rs.getInt(4));
                pro.setIndicador(rs.getString(5));
            }
        }catch(Exception ex){
            MensajesProductos.M1("Error no se puede recuperar el registro..."+ex);
        }return pro;
    }
    
    // metodo que recibe una producto y actualiza el registro   /*Me quede*/
    public void ActualizarRegistroPro(Productos pro){
        try{
            ps=conexion.prepareStatement("UPDATE productos SET descripcion=?,precio=? WHERE idproductos=?;");
            ps.setString(1,pro.getDescripcion());
            ps.setString(2,pro.getPrecio());
            ps.setInt(3,pro.getIdproductos());
            
            ps.executeUpdate();
            MensajesProductos.M1("Registro actualizado");
        }catch(Exception ex){
            MensajesProductos.M1("Error no se puede actualizar el registro de la categoria.."+ex);
        }
    }
    //metodo que actualiza el indicador para el proceso de eliminacion
    public void EliminarRegistro(int idpro){
        try{
            ps=conexion.prepareStatement("UPDATE productos SET indicador='N' WHERE idproductos=?;");
            ps.setInt(1,idpro);
            ps.executeUpdate();
            MensajesProductos.M1("Registro eliminado de la tabla categoria");
            conexion.close();
        }catch(Exception ex){
            MensajesProductos.M1("Error no se puede eliminar el registro de categoria "+ex);
        }
    }
    
    
    
}

