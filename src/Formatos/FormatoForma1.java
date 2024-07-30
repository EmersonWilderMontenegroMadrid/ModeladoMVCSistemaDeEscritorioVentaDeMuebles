package Formatos;

/*import MODELO.Productos;*/
import VISTA.Panel_Dekogar;
/*import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;//para tener mejor modelo de la tabla modelo de la tabla propia*/

public class FormatoForma1 {
    
    public static  void Presentacion(Panel_Dekogar f1){
        f1.setTitle("MANTENIMIENTO Productos");
        f1.setLocationRelativeTo(null);
        f1.jtxtIDProducto.setEnabled(false);
    }
    
    public static void Estado1(Panel_Dekogar f1){
        f1.jbtnRegistrar.setEnabled(true);
        f1.jbtnConsultar.setEnabled(true);
        f1.jbtnActualizar.setEnabled(false);
        f1.jbtnEliminar.setEnabled(false);
    }
    
    public static void Estado2(Panel_Dekogar f1){
        f1.jbtnRegistrar.setEnabled(false);
        f1.jbtnConsultar.setEnabled(false);
        f1.jbtnActualizar.setEnabled(true);
        f1.jbtnEliminar.setEnabled(true);
    }
    
    public static void LimpiarEntradas(Panel_Dekogar f1){
         f1.jtxtIDProducto.setText("");
         f1.jtxtDescripcion.setText("");
         f1.jtxtPrecio.setText("");
         f1.jtxtPrecio.setText("");
         f1.jtxtIDProducto.requestFocus();
    }
    
    
    
    /*//atributos estaticos->pertenece a la clase->controlador ahora va aca el encabezado
        public static String[] Titulo={"Codigo","Descripción","Precio","Stock"};
    //metodos que actualize el formulario
    public static void ActualizarForma(Panel_Dekogar f1){
        f1.setVisible(true);
        f1.setTitle("Productos");
        f1.setLocationRelativeTo(null);//null->ventana se posiciona en el centro
        
    }
    //metodos que limpie el formulario
    public static void LimpiarEntradas(Panel_Dekogar f1){
        //una vez que ingresar la informacion se limpian las entradas
        f1.jtxtDescripcion.setText("");
        f1.jtxtPrecio.setText("");
        f1.jtxtStock.setText("");
        f1.jtxtDescripcion.requestFocus();
        
    } 
    //metodo para salir del formulario
    public static  Productos CancelarProductos(Panel_Dekogar f1){
        Productos P = new Productos();
        f1.setVisible(false);
        return P;
    }
    //metodo para obtener datos del Productos y mande el objeto al jtxt
    public static Productos LeerProductos(Panel_Dekogar f1){
        Productos P = new Productos();
        
        P.setDescripcion(f1.jtxtDescripcion.getText());
        P.setPrecio(Double.valueOf(f1.jtxtPrecio.getText()));
        P.setStock(Integer.valueOf(f1.jtxtStock.getText()));
        return P;
    }
    public static Productos EliminarProductos(Panel_Dekogar f1){
        Productos P = new Productos();
        //Ayudara para eliminar datos de la tabla
        DefaultTableModel dtm=new DefaultTableModel();
        //seleccionamos la cabezera del dtm->DefaultTableModel()
        dtm.setColumnIdentifiers(Titulo);
        //asume que el modedo desde adelante sera dtm
        f1.jtblInformacion.setModel(dtm);
        
        //pide la fila seleccionada para poder eliminarla
        int filaseleccionada=(f1.jtblInformacion.getSelectedRow());//getSelectedRow().-se selecciona la fila
        dtm.removeRow(filaseleccionada);
        return P;
    }
    public static Productos ActualizarProductos(Panel_Dekogar f1){
       Productos P = new Productos();
       //Ayudara para eliminar datos de la tabla
        DefaultTableModel dtm=new DefaultTableModel();
        //seleccionamos la cabezera del dtm->DefaultTableModel()
        dtm.setColumnIdentifiers(Titulo);
        //asume que el modedo desde adelante sera dtm
        f1.jtblInformacion.setModel(dtm);
       int filaseleccionada=(f1.jtblInformacion.getSelectedRow());
       dtm.setValueAt(f1.jtxtDescripcion.getText(), filaseleccionada,1);//setValueAt->editar datos fila //0 es columna
       dtm.setValueAt(f1.jtxtPrecio.getText(), filaseleccionada,2);
       dtm.setValueAt(f1.jtxtStock.getText(), filaseleccionada,3);//gettext recuepera texto
       return P;
    }     */


}