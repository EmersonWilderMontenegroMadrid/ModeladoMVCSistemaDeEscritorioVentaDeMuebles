package Formatos;
import javax.swing.JOptionPane;
public class MensajesBoleta {
     public static  void M1Boleta (String mensajeBoleta ){
        JOptionPane.showMessageDialog(null,mensajeBoleta );
    }
    
    public static int M2Boleta (String mensajeBoleta ){
        return Integer.parseInt(JOptionPane.showInputDialog(mensajeBoleta ));
    }
    
    public static int M3Boleta (String titulo, String mensajeBoleta ){
        return JOptionPane.showConfirmDialog(null,mensajeBoleta ,titulo,JOptionPane.OK_CANCEL_OPTION);
    }//Si seleccion es OK entonces retorna 0
}
