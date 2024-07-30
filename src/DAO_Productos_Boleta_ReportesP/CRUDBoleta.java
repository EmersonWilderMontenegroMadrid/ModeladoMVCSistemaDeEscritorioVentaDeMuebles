package DAO_Productos_Boleta_ReportesP;
//Librerias
import Formatos.MensajesBoleta;
import MODELO.Clientes;
import MODELO.Productos;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
public class CRUDBoleta extends ConectarBD{
    public CRUDBoleta(){}
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
            conexion.close();}
        catch(Exception ex){
            MensajesBoleta.M1Boleta("EROR NO SE PUEDE MOSTRAR LOS REGISTROS DE PRODUCTOS"+ex);
        }
    }
    //metodo que permita consultar un registro mediante el codigo
    public Clientes ObtenerRegistroCli(int idcli){
        Clientes cli =null;
        try{
            rs= st.executeQuery("SELECT idclientes,nombrecli,apellidocli,sexocli,dnicli,emailcli,direccioncli,telefonocli,ruccli,indicadorCli FROM clientes where indicadorCli='S' AND idclientes="+idcli);
            if(rs.next()){
                cli = new Clientes();
                cli.setIdclientes(rs.getInt(1));
                cli.setNombrecli(rs.getString(2));
                cli.setApellidocli(rs.getString(3));
                cli.setSexocli(rs.getString(4));
                cli.setDnicli(rs.getString(5));
                cli.setEmailcli(rs.getString(6));
                cli.setDireccioncli(rs.getString(7));
                cli.setTelefonocli(rs.getString(8));
                cli.setRuccli(rs.getString(9));
                cli.setIndicadorCli(rs.getString(10));
            }
        }catch(Exception ex){
            MensajesBoleta.M1Boleta("Error no se puede recuperar el registro..."+ex);
        }return cli;
    }
}
