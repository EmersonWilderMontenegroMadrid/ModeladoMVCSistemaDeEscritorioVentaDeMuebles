
package Principal;

import Controlador.ControladorForma1;
import VISTA.Panel_Dekogar;


public class MainForma1 {
    static ControladorForma1 controlf1;
    static Panel_Dekogar f1;

    public static void main(String[] args) {
        f1=new Panel_Dekogar();
        controlf1 =new ControladorForma1(f1);
        
    }
    
}
