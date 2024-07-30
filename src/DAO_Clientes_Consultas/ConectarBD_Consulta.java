
package DAO_Clientes_Consultas;
import java.sql.*;
import Formatos.MensajesConsultas;
public class ConectarBD_Consulta implements ParametrosConsulta{
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    public ConectarBD_Consulta(){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            st=conexion.createStatement();
        }catch(Exception ex){
            MensajesConsultas.M1Consulta("Error no se puede conectar a la BD..."+ex);
        }
    
    }
}
