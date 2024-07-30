package Controlador;
//Librerias
import DAO_Productos_Boleta_ReportesP.CRUDBoleta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.Panel_Dekogar;
import MODELO.*;
import Formatos.*;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Librerias Calendario
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControladorForma3 implements ActionListener{
    Panel_Dekogar vista;
    CRUDBoleta crudVentas;
    Clientes cli;
    public ControladorForma3(Panel_Dekogar f3){
        vista = f3;
        vista.jbtnConsultaClientesVenta.addActionListener(this);
        vista.jbtnAgregarProductosVenta.addActionListener(this);
        vista.jbtnRealizarCalculo.addActionListener(this);
        vista.jbtnImprimirVenta.addActionListener(this);
        //Calendario
        Calendar cal= new GregorianCalendar();
        vista.jdchFechaVenta.setCalendar(cal);
        //dar otro formato a la venta
//        SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd");
//        cli.setFechaVenta(sf.format(f3.jdchFechaVenta.getDate()));
        crudVentas= new CRUDBoleta();
        crudVentas.MostrarProductosVentasEnTabla(vista.jtblInformacionVenta, vista.jlblNumBoleta);
        FormatoForma3.Presentacionf3(f3);
        FormatoForma3.Estado1F3(f3);
        vista.setVisible(true);
        
    }
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
    void ActualizarTabla(){
        crudVentas= new CRUDBoleta();
        crudVentas.MostrarProductosVentasEnTabla(vista.jtblInformacionVenta,vista.jlblNumBoleta);
        FormatoForma1.Estado1(vista);
        FormatoForma1.LimpiarEntradas(vista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnConsultaClientesVenta){
            int idcli = MensajesBoleta.M2Boleta("ingrese el ID Clientes a buscar...");
            crudVentas = new CRUDBoleta();
            cli = crudVentas.ObtenerRegistroCli(idcli);
            if(cli==null){
                MensajesBoleta.M1Boleta("El ID " +idcli+ "no existe en la tabla clientes" );
            }
            else{
                vista.jtxtIdCliente.setText(Integer.toString(cli.getIdclientes()));
                vista.jtxtNomCli1.setText(cli.getNombrecli());
                vista.jtxtApell1.setText(cli.getApellidocli());
                vista.jtxtSexo1.setText(cli.getSexocli());   /**/
                vista.jtxtdniCli1.setText(cli.getDnicli());
                vista.jtxtEmail1.setText(cli.getEmailcli());
                vista.jtxtDireccion1.setText(cli.getDireccioncli());
                vista.jtxtTele1.setText(cli.getTelefonocli());
                vista.jtxtRuc1.setText(cli.getRuccli());
                FormatoForma3.Estado2F3(vista);
            }
        }
        //Consultar Productos
//        if(e.getSource()==vista.jbtnConsultaProductosVenta){
//            int idcat = MensajesProductos.M2("ingrese el ID Productos a buscar...");
//            crud = new CRUDProductos();
//            pro = crud.ObtenerRegistroPro(idcat);
//            if(pro==null){
//                MensajesProductos.M1("El ID " +idcat+ "no existe en la tabla Productos" );
//            }
//            else{
//            vista.jtxtIDProductoVenta.setText(Integer.toString(pro.getIdproductos()));
//            vista.jtxtDescripcionVenta.setText(pro.getDescripcion());
//            vista.jtxtPrecioVenta.setText(pro.getPrecio());
//            vista.jtxtStockVenta.setText(Integer.toString(pro.getStock()));
//            }
//            int cant = MensajesProductos.M2("ingrese cantidad...");
//        }
        //IMPRIMIR
//        if(e.getSource()==vista.jbtnImprimirVenta){
//            PrinterJob job = PrinterJob.getPrinterJob();
//            Printable NAYELY = null;
//        job.setPrintable(NAYELY);
//        if (job.printDialog()) {
//            try {
//                job.print();
//            } catch (PrinterException ex) {
//            }
//        }else{
//            JOptionPane.showMessageDialog(null, "La impresion se cancelo");
//        }  
//        }
//        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;}
//            }
//	    } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Panel_Dekogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Panel_Dekogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Panel_Dekogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Panel_Dekogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(() -> {
//            new Panel_Dekogar().setVisible(true);
//        });
        
        //CALCULO
        if(e.getSource()==vista.jbtnRealizarCalculo){
            
            /*double total;
            double importe;
            importe=precio*cant_Productos;
            double subtotal=0;
            subtotal=subtotal+importe;
            total=subtotal+igv;*/
            
        }
        //CALCULO
        if(e.getSource()==vista.jbtnConsultaClientesVenta){
            
        }
    }
    
}
