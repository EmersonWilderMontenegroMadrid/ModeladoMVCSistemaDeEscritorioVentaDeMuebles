
package Controlador;
//Librerias
import DAO_Clientes_Consultas.CRUDReportesCli;
import DAO_Productos_Boleta_ReportesP.CRUDProductos;
import DAO_Productos_Boleta_ReportesP.CRUDReportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.Panel_Dekogar;
import MODELO.Productos;
import Formatos.*;
import MODELO.Clientes;
public class ControladorForma5 implements ActionListener{
    Panel_Dekogar vista;
    CRUDReportes crudreport;
    CRUDReportesCli crudreportcli;
    Productos pro;
    Clientes cli;
    //MOSTRAR PRODUCTOS
    public ControladorForma5(Panel_Dekogar f5){
        vista = f5;
        /*vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);*/
        crudreport = new CRUDReportes();
        crudreport.MostrarProductosVentasEnTabla(vista.jtblReportesProductos, vista.jlblReportes);
        crudreportcli=new CRUDReportesCli ();
        crudreportcli.MostrarClientesEnTabla(vista.jtblReportesclientes, vista.jlblReportesClientes);
        FormatosForma5.PresentacionF5(f5);
        FormatosForma5.Estado1F5(f5);
        vista.setVisible(true);
    }
    void LeerProductos(){
        pro=new Productos();
        pro.setDescripcion(vista.jtxtDescripcion.getText());
        pro.setPrecio(vista.jtxtPrecio.getText());
        pro.setStock(Integer.valueOf(vista.jtxtStock.getText()));
        /*pro.setNombrecat(vista.jtxtNombreCategoria.getText());
        pro.setDescripcion(vista.jtxaDescripcion.getText());*/
    }
    
    void ActualizarTabla(){
        crudreport= new CRUDReportes();
        crudreport.MostrarProductosVentasEnTabla(vista.jtblReportesProductos,vista.jlblReportes);
        FormatoForma1.Estado1(vista);
        FormatoForma1.LimpiarEntradas(vista);
    }
    //CLIENTES
    void LeerClientes(){
        cli=new Clientes();
        cli.setNombrecli(vista.jtxtNomCli.getText());
        cli.setApellidocli(vista.jtxtApell.getText());
        cli.setSexocli(vista.jtxtSexo.getText());
        cli.setDnicli(vista.jtxtdniCli.getText());
        cli.setEmailcli(vista.jtxtEmail.getText());
        cli.setDireccioncli(vista.jtxtDireccion.getText());
        cli.setTelefonocli(vista.jtxtTele.getText());
        cli.setRuccli(vista.jtxtRuc.getText());
       
        
    }
    
    void ActualizarTablaCli(){
        crudreport= new CRUDReportes();
        crudreportcli.MostrarClientesEnTabla(vista.jtblReportesclientes,vista.jlblReportesClientes);
        FormatosForma5.Estado1F5(vista);
        FormatosForma5.LimpiarEntradasF5(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
