package DAO_Productos_Boleta_ReportesP;
//Librerias EN ESTE CASO UTILIZAREMOS LA CLASE PARAMETROS
import java.sql.*;
import Formatos.MensajesProductos;
public class ConectarBD implements Parametros{
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    public ConectarBD(){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            //LAMAS A LA CLAE PARA QUE SE EJECUTE 
            //LISTA LOS DATOS QUE TIENE LA TABLA
            st=conexion.createStatement();
        }catch(Exception ex){
            MensajesProductos.M1("Error no se puede conectar a la BD..."+ex);
        }
    
    }
}
