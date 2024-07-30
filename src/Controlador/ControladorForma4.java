package Controlador;
//Librerias
import DAO_Clientes_Consultas.CRUDConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.Panel_Dekogar;
import MODELO.Clientes;
import Formatos.*;

public class ControladorForma4 implements ActionListener{
    Panel_Dekogar vista;
    CRUDConsulta crudConsul;
    Clientes cli;
    
    public ControladorForma4(Panel_Dekogar f4){
        vista = f4;
        vista.jbtnGeneroConsulta.addActionListener(this);
        vista.jbtnDNIConsulta.addActionListener(this);
        vista.jbtnMostrarTodosClientesConsulta.addActionListener(this);
        
        crudConsul= new CRUDConsulta();
        crudConsul.MostrarClientesEnTabla(vista.jtblInfoConsulta, vista.jlblNroConsulta);
        FormatoForma4.PresentacionF4(f4);
        FormatoForma4.Estado1F4(f4);
        vista.setVisible(true);
    }
    
    void LeerClientes(){
        cli=new Clientes();
        cli.setNombrecli(vista.jtxtNomCli.getText());
        cli.setApellidocli(vista.jtxtApell.getText());
        cli.setSexocli(vista.jtxtSexo.getText());
        cli.setDnicli(vista.jtxtdniCli.getText());
        cli.setEmailcli(vista.jtxtEmail.getText());
        cli.setDireccioncli(vista.jtxtDireccion.getText());
        cli.setTelefonocli(vista.jtxtTele.getText());
        cli.setRuccli(vista.jtxtRuc.getText());
       
        
    }
    
    void ActualizarTabla(){
        crudConsul= new CRUDConsulta();
        crudConsul.MostrarClientesEnTabla(vista.jtblInfoConsulta,vista.jlblNroConsulta);
        FormatoForma4.Estado1F4(vista);
        FormatoForma4.LimpiarEntradas(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource()==vista.jbtnDNIConsulta){
            int dnicli = MensajesConsultas.M2Consulta("ingrese el DNI a buscar...");
            crudConsul = new CRUDConsulta();
            cli = crudConsul.ObtenerDNICli(dnicli);
            if(cli==null){
                MensajesConsultas.M1Consulta("El dNI " +dnicli+ "no existe en la tabla Productos" );
            }
            else{
            
            }
        }*/
    }
}
