package Controlador;
//designa tareas del formato
//Librerias
import DAO_Productos_Boleta_ReportesP.CRUDProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.Panel_Dekogar;
import MODELO.Productos;
import Formatos.*;
/*import MODELO.Productos;
import VISTA.Panel_Dekogar;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Formatos.*;
import java.awt.event.ActionEvent;*/

public class ControladorForma1 implements ActionListener{
    Panel_Dekogar vista;
    CRUDProductos crud;
    Productos pro;
    public ControladorForma1(Panel_Dekogar f1){
        vista = f1;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crud = new CRUDProductos();
        crud.MostrarCategoriasEnTabla(vista.jtblInformacion, vista.jlblCantRegistro);
        FormatoForma1.Presentacion(f1);
        FormatoForma1.Estado1(f1);
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
        crud= new CRUDProductos();
        crud.MostrarCategoriasEnTabla(vista.jtblInformacion,vista.jlblCantRegistro);
        FormatoForma1.Estado1(vista);
        FormatoForma1.LimpiarEntradas(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerProductos();
            crud=new CRUDProductos();
            crud.InsertarRegistroPro(pro);
            ActualizarTabla();
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idcat = MensajesProductos.M2("ingrese el ID Productos a buscar...");
            crud = new CRUDProductos();
            pro = crud.ObtenerRegistroPro(idcat);
            if(pro==null){
                MensajesProductos.M1("El ID " +idcat+ "no existe en la tabla Productos" );
            }
            else{
            vista.jtxtIDProducto.setText(Integer.toString(pro.getIdproductos()));
            vista.jtxtDescripcion.setText(pro.getDescripcion());
            vista.jtxtPrecio.setText(pro.getPrecio());
            vista.jtxtStock.setText(Integer.toString(pro.getStock()));
            FormatoForma1.Estado2(vista);
            }
        }
        if(e.getSource() == vista.jbtnActualizar){
            LeerProductos();
            pro.setIdproductos(Integer.parseInt(vista.jtxtIDProducto.getText()));
            crud =new CRUDProductos();
            crud.ActualizarRegistroPro(pro);
            ActualizarTabla();
        }if(e.getSource()== vista.jbtnEliminar){
            int respuesta = MensajesProductos.M3("Confirmar...","¿Desea eliminar el registro?");
            if(respuesta==0){int idpro = Integer.parseInt(vista.jtxtIDProducto.getText());
            crud = new CRUDProductos();
            crud.EliminarRegistro(idpro);
            ActualizarTabla();
            }
            
        }
      
    }
        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*  //Atributos
    Panel_Dekogar vista;
    DefaultTableModel modelotabla;
    Productos p;
    
    //Constructor
    public ControladorForma1(Panel_Dekogar f1){
        vista=f1;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        modelotabla=new DefaultTableModel(null,FormatoForma1.Titulo);
        vista.jtblInformacion.setModel(modelotabla);
        FormatoForma1.ActualizarForma(f1);//distribuye la tarea
    }

    @Override
    //Implemenatar metodos abstractos
    public void actionPerformed(ActionEvent e) {
        //mira que boton se presiono
        //guardar
        if(e.getSource()==vista.jbtnRegistrar){
            p=FormatoForma1.LeerProductos(vista);//captura la info de Leer Productos
            modelotabla.addRow((Object[]) p.RegistrarDatos());
            FormatoForma1.LimpiarEntradas(vista);
        }
        //cancelar
        if(e.getSource()==vista.jbtnEliminar){
            p=FormatoForma1.CancelarProductos(vista);
            modelotabla.addRow((Object[]) p.RegistrarDatos());
            FormatoForma1.LimpiarEntradas(vista);
        }
        //eliminar info de la tabla
        if(e.getSource()==vista.jbtnConsultar){
            p=FormatoForma1.EliminarProductos(vista);
            modelotabla.addRow((Object[]) p.RegistrarDatos());
            FormatoForma1.LimpiarEntradas(vista);
        }
        //actualizar info de la tabla
        if(e.getSource()==vista.jbtnActualizar){
            p=FormatoForma1.ActualizarProductos(vista);
            modelotabla.addRow((Object[]) p.RegistrarDatos());
            FormatoForma1.LimpiarEntradas(vista);
        }
    }*/
   

