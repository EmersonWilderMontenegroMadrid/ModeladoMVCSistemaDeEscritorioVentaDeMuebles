
package Principal;
import Controlador.ControladorForma5;
import VISTA.Panel_Dekogar;
public class MainForma5 {
    static ControladorForma5 controlf5;
    static Panel_Dekogar f5;
    public static void main(String[] args) {
        f5=new Panel_Dekogar();
        controlf5 =new ControladorForma5(f5);
    }
    
}
