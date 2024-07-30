
package DAO_Clientes_Consultas;

import Formatos.MensajesReportes;
import MODELO.Clientes;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDReportesCli extends ConectarBD_Consulta{
    
    //Metodo que muestra en un JTable los registros
    public void MostrarClientesEnTabla(JTable tabla,JLabel etiqueta){
        String titulo[]={"Nro","Id Cliente","Nombre","Apellido","Sexo","DNI","Email","Direccion","Telefono","RUC"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulo);
        tabla.setModel(modelo);
        try{
            rs = st.executeQuery("SELECT idclientes,nombrecli,apellidocli,sexocli,dnicli,emailcli,direccioncli,telefonocli,ruccli,indicadorCli FROM clientes WHERE indicadorCli='S'");
            int contreCl=0;
            while(rs.next()){
                contreCl++;
                Clientes cli = new Clientes();
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
                modelo.addRow(cli.RegistrDatosCli(contreCl));
            }etiqueta.setText("Cantidad de registro: " +contreCl);
            conexion.close();}
        catch(Exception ex){
            MensajesReportes.M1F5("EROR NO SE PUEDE MOSTRAR LOS REGISTROS DE CLIENTES"+ex);
        }
    }
}
