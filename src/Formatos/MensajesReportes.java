
package Formatos;

import javax.swing.JOptionPane;

public class MensajesReportes {
    public static  void M1F5(String mensajeF5){
        JOptionPane.showMessageDialog(null,mensajeF5);
    }
    
    public static int M2F5(String mensajeF5){
        return Integer.parseInt(JOptionPane.showInputDialog(mensajeF5));
    }
    
    public static int M3F5(String titulo, String mensajeF5){
        return JOptionPane.showConfirmDialog(null,mensajeF5,titulo,JOptionPane.OK_CANCEL_OPTION);
    }//Si seleccion es OK entonces retorna 0
}
