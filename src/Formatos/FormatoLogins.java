package Formatos;
//librerias
import MODELO.login;
import VISTA.FormularioLogins;
import VISTA.Panel_Dekogar;
import javax.swing.JOptionPane;
public class FormatoLogins {
   //Metodos que actualice el formulario Login
    public static void ActualizarForma(FormularioLogins Lo){
        Lo.setVisible(true);
        Lo.setTitle("Login");
        Lo.setLocationRelativeTo(null);
    }
    //Metodos que limpien las entradas del formularioLogins
    public static void LimpiarEntradas(FormularioLogins Lo){
        Lo.txtUsuario1.setText("");
        Lo.txtPass1.setText("");
    }
    //metodo para salir del formulario
    public static  login Salirlogin(FormularioLogins Lo){
        login p=new login();
        Lo.setVisible(false);
        return p;
    }
    //Metodos para obtener los datos del administrador
    public static login Leerlogin(FormularioLogins Lo){
        login p=new login();
        //creamos la variable Usuario y contrasena para que tomen los valores de la tabla
        String Usuario=Lo.txtUsuario1.getText();
        String contrasena=Lo.txtPass1.getText();
        if(Usuario.equals("") || contrasena.equals("")){
            JOptionPane.showMessageDialog(null,"Algun campo esta vacio");
        }else{
            if(Usuario.equals("admin1") && contrasena.equals("5521")){
                JOptionPane.showMessageDialog(null,"Bienvenido");
                Panel_Dekogar f1=new Panel_Dekogar();
                f1.setVisible(true);
            }else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
            }
        }
        return p;
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
