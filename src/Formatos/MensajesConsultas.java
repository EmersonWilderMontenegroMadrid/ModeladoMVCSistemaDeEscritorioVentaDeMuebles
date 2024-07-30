package Formatos;

import javax.swing.JOptionPane;

public class MensajesConsultas {
     public static  void M1Consulta(String mensajeConsulta){
        JOptionPane.showMessageDialog(null,mensajeConsulta);
    }
    
    public static int M2Consulta(String mensajeConsulta){
        return Integer.parseInt(JOptionPane.showInputDialog(mensajeConsulta));
    }
    
    public static int M3Consulta(String titulo, String mensajeConsulta){
        return JOptionPane.showConfirmDialog(null,mensajeConsulta,titulo,JOptionPane.OK_CANCEL_OPTION);
    }//Si seleccion es OK entonces retorna 0
}
