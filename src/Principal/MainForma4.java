
package Principal;
import Controlador.ControladorForma4;
import VISTA.Panel_Dekogar;
public class MainForma4 {
    static ControladorForma4 controlf4;
    static Panel_Dekogar f4;
    public static void main(String[] args) {
        f4=new Panel_Dekogar();
        controlf4 =new ControladorForma4(f4);
    }
    
}
