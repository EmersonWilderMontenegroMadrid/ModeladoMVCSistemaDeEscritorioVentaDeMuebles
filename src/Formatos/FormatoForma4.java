package Formatos;
import VISTA.Panel_Dekogar;
public class FormatoForma4 {
    public static  void PresentacionF4(Panel_Dekogar f4){
        f4.setTitle("CONSULTA");
        f4.setLocationRelativeTo(null);
    }
    
    public static void Estado1F4(Panel_Dekogar f4){
        f4.jbtnGeneroConsulta.setEnabled(true);
        f4.jbtnDNIConsulta.setEnabled(true);
        f4.jbtnMostrarTodosClientesConsulta.setEnabled(false);
    }
    
    public static void Estado2F4(Panel_Dekogar f4){
        f4.jbtnGeneroConsulta.setEnabled(true);
        f4.jbtnDNIConsulta.setEnabled(true);
        f4.jbtnMostrarTodosClientesConsulta.setEnabled(true);
    }
    
    public static void LimpiarEntradas(Panel_Dekogar f4){
         f4.jtxtIdCliente.setText("");
         f4.jtxtNomCli.setText("");
         f4.jtxtApell.setText("");
         f4.jtxtSexo.setText("");
         f4.jtxtdniCli.setText("");
         f4.jtxtEmail.setText("");
         f4.jtxtDireccion.setText("");
         f4.jtxtTele.setText("");
         f4.jtxtRuc.setText("");
         f4.jtxtIdCliente.requestFocus();
    }
}
