package Controlador;
//librerias
import MODELO.login;
import VISTA.FormularioLogins;
import java.awt.event.ActionListener;
import Formatos.*;
import java.awt.event.ActionEvent;
public class ControladorFormatoLogin implements ActionListener{
     //Atributos
    FormularioLogins vista;
    login l;
    //Constructor
    public ControladorFormatoLogin(FormularioLogins Lo){
        vista=Lo;
        vista.jbtnIngreso.addActionListener(this);
        vista.jbtnCerrar.addActionListener(this);
        FormatoLogins.ActualizarForma(Lo);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //mira que boton se presiono
        //guardar
        if(e.getSource()==vista.jbtnIngreso){
            l=FormatoLogins.Leerlogin(vista);
            FormatoLogins.LimpiarEntradas(vista);   
        }
        //Salir
        if(e.getSource()==vista.jbtnCerrar){
            l=FormatoLogins.Salirlogin(vista);
            FormatoLogins.LimpiarEntradas(vista);
        }
    }
}
