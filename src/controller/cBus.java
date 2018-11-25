package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.vBus;
import view.vRendicion;


public class cBus {
   ResultSet rs;
    Statement st;
     cConexion cone=new cConexion();
    Connection c= cone.conectar();
    
    public DefaultTableModel grillaBus(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Tipo de bus");//1
        modelo.addColumn("Cantidad de asientos");//2
        modelo.addColumn("Año de fabricacion");//3
        modelo.addColumn("Nro de Chapa");//4
        modelo.addColumn("Chasis");//5
        modelo.addColumn("Motor");//6
        modelo.addColumn("descripcion");
        modelo.addColumn("carroceria");
       
        vBus.grdBus.setModel(modelo);
         //crear una veriable de tipo array para almacenar los datos de la db
        String[] vector=new String[11];
         String cadena;
         cadena="select b.tipo,b.cantidadAsiento,b.anhoFabricacion,b.nroChapa,b.chasis,m.marcaMotor,m.descripcion,m.carroceria from bus b join marca m on m.codMarca=b.codCoche";
        try{
          st=c.createStatement();//crear al Stetement
            //ejecutar en un resultSet para obtener datos
            rs=st.executeQuery(cadena);
            //recorrer el resultSet
            while(rs.next()){
            //cargamos los datos al vector
            vector[0]=rs.getString(1);
            vector[1]=rs.getString(2);
            vector[2]=rs.getString(3);
            vector[3]=rs.getString(4);
            vector[4]=rs.getString(5);
            vector[5]=rs.getString(6);
            vector[6]=rs.getString(7);
            vector[7]=rs.getString(8);
           
          
            //pasar los datos del vector al objeto modelo
            modelo.addRow(vector);
                
            }
        }catch(Exception e){
            
        }
        return modelo;
    }
   
        
    
       public DefaultComboBoxModel cboMotor(){
        DefaultComboBoxModel obj = new DefaultComboBoxModel();
       
        try{
            //obj.addElement("categoria");
            //cboCategoria().removeAllElements();
            //obj.addElement("SELECCIONE LA CATEGORIA");
            String cadena="select codMarca,marcaMotor from marca";
            Statement st=c.createStatement();
            rs=st.executeQuery(cadena);
           while(rs.next()){
               
               obj.addElement(rs.getString("marcaMotor"));
               
           }
        }catch(Exception e){
            
        }
        return obj;
    }
       
       
       
       
}
