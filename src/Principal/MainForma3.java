package Principal;
import Controlador.ControladorForma3;
import VISTA.Panel_Dekogar;
public class MainForma3 {
    static ControladorForma3 controlf3;
    static Panel_Dekogar f3;
    public static void main(String[] args) {
        f3=new Panel_Dekogar();
        controlf3 =new ControladorForma3(f3);
    }
    
}
