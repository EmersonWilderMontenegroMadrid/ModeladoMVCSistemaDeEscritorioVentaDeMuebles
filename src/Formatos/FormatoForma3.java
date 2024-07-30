package Formatos;
import VISTA.*;
//Librerias Calendario
import java.util.Calendar;
import java.util.GregorianCalendar;
public class FormatoForma3 {
    public static void Presentacionf3(Panel_Dekogar f3){
        f3.setVisible(true);
        f3.setTitle(" Venta ");
        f3.setLocationRelativeTo(null);
        
    }
    public static void Estado1F3(Panel_Dekogar f3){
        f3.jbtnConsultaClientesVenta.setEnabled(true);
        f3.jbtnAgregarProductosVenta.setEnabled(true);
        f3.jbtnRealizarCalculo.setEnabled(true);
        f3.jbtnImprimirVenta.setEnabled(true);
    }
    
    public static void Estado2F3(Panel_Dekogar f3){
        f3.jbtnConsultaClientesVenta.setEnabled(true);
        f3.jbtnAgregarProductosVenta.setEnabled(true);
        f3.jbtnRealizarCalculo.setEnabled(true);
        f3.jbtnImprimirVenta.setEnabled(true);
    }
    
    public static void LimpiarEntradas(Panel_Dekogar f3){
         f3.jtxtIdCliente.setText("");
         f3.jtxtNomCli1.setText("");
         f3.jtxtApell.setText("");
         f3.jtxtSexo1.setText("");
         f3.jtxtdniCli1.setText("");
         f3.jtxtEmail1.setText("");
         f3.jtxtDireccion1.setText("");
         f3.jtxtTele1.setText("");
         f3.jtxtRuc1.setText("");
         Calendar cal=new GregorianCalendar();
         f3.jdchFechaVenta.setCalendar(cal);
         f3.jtxtIdCliente.requestFocus();
    }
}
