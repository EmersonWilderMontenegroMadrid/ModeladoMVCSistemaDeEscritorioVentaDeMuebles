package Principal;
//librerias
import Controlador.ControladorFormatoLogin;
import VISTA.FormularioLogins;
public class MainLogins {
    static ControladorFormatoLogin controlLo;
    static FormularioLogins Lo;
    public static void main(String[] args) {
        Lo=new FormularioLogins();
        controlLo=new ControladorFormatoLogin(Lo);
    }
}
