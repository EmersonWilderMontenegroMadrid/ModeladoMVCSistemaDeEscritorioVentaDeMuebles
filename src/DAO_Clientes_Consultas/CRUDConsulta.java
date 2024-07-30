package DAO_Clientes_Consultas;

//Librerias
import Formatos.MensajesConsultas;
import MODELO.Clientes;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDConsulta extends ConectarBD_Consulta{
    public CRUDConsulta(){};
    //METODO MUESTRA EN EL JTable LOS CLIENTES
   public void MostrarClientesEnTabla(JTable tabla,JLabel etiqueta){
        String titulo[]={"Nro","Id Cliente","Nombre","Apellido","Sexo","DNI","Email","Direccion","Telefono","RUC"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulo);
        tabla.setModel(modelo);
        try{
            rs = st.executeQuery("SELECT idclientes,nombrecli,apellidocli,sexocli,dnicli,emailcli,direccioncli,telefonocli,ruccli,indicadorCli FROM clientes WHERE indicadorCli='S';");
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
            MensajesConsultas.M1Consulta("EROR NO SE PUEDE MOSTRAR LOS REGISTROS DE CLIENTES"+ex);
        }
    }
    
    
    //METODO QUE PERMITE TRAER EL GENERO EN CONSULTA
    /*public Clientes ObtenerDNICli(int dnicli){
        Clientes cli =null;
        try{
            rs= st.executeQuery("SELECT idclientes,nombrecli,apellidocli,sexocli,dnicli,emailcli,direccioncli,telefonocli,ruccli,indicadorCli FROM clientes where indicadorCli='S' AND dnicli= "+dnicli);
            //IF->VERIFICA SI EXISTE SOLO ESE DNI SELECCIONADO
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
            MensajesConsultas.M1Consulta("Error no se puede recuperar el DNI..."+ex);
        }return cli;
    }*/
}
