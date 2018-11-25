
package controller;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

public class cPersona {
    
    cConexion cone=new cConexion();//objeto de cConexion
    Connection c=cone.conectar();
       ResultSet rs;
    Statement st;
   
    public void pasarDatos(mPersona per){
       per.setCiPersona(Integer.parseInt(vPersona.txtCI.getText()));
       per.setNombrePersona(vPersona.txtNombre.getText());
       per.setApellidoPersona(vPersona.txtApellido.getText());
       per.setTelefonoPersona(vPersona.txtTelefono.getText());
       per.setDireccionPersona(vPersona.txtDireccion.getText());
       per.setGeneroPersona(vPersona.cboSexo.getSelectedIndex());
       
    }
    public void insertarPersona(mPersona per){
        try {
            //PreparedStatement
            PreparedStatement pst=c.prepareStatement("call pInsertarPersona(?,?,?,?,?,?)");
            //pasar valor a los parametros
            pst.setInt(1,per.getCiPersona());
            pst.setString(2, per.getNombrePersona());
            pst.setString(3,per.getApellidoPersona());
            pst.setString(4,per.getTelefonoPersona());
            pst.setString(5,per.getDireccionPersona());
            pst.setInt(6,per.getGeneroPersona());
           // ejecutar
           pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Personal Registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println("");
        }
    } 
    int prueba=0;
    public void modificarPersona(mPersona per){
       
        try {
            PreparedStatement pst = c.prepareStatement("UPDATE persona SET ci=?,nombre = ?,"+
                    "apellido = ?,telefono = ?,	direccion = ?,genero = ? WHERE ci = ?;");
            pst.setInt(1,per.getCiPersona() );
            pst.setString(2, per.getNombrePersona());
            pst.setString(3,per.getApellidoPersona());
            pst.setString(4, per.getTelefonoPersona());
            pst.setString(5,per.getDireccionPersona() );
            pst.setInt(6, per.getGeneroPersona());
            pst.setInt(7,per.getCiViejo());
            //ejecutar update
            int var = pst.executeUpdate();
            if(var!=0){
                JOptionPane.showMessageDialog(null,"Datos actualizados");
            }
            else
                JOptionPane.showMessageDialog(null,"No se pudo actualizar");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void eliminarPersona(mPersona per){
        try {
            PreparedStatement pst=c.prepareStatement("delete from persona where ci=?");
             pst.setInt(1,per.getCiPersona());
            //ejecutar
            pst.executeUpdate();
            int var = pst.executeUpdate();
            if(var!=0){
                JOptionPane.showMessageDialog(null,"Datos eliminados");
            }
            else
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
     
    public DefaultTableModel grillaPersona(){
    //crear el objeto de DEfaulTableModel
        DefaultTableModel modelo=new DefaultTableModel();
        //titulos
        modelo.addColumn("Documento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Genero");
        //agregar los titulos a la grilla
        vPersona.grdPersona.setModel(modelo);
     
        //crear una veriable de tipo array para almacenar los datos de la db
        String[] vector=new String[6];
        //definir variable para almacenar la sentencia sql
        String cadena;
        cadena="SELECT ci,nombre,apellido,telefono,direccion,CASE WHEN genero='2' THEN 'Femenino' ELSE 'Masculino' END AS sexo FROM persona";
        try {
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
            //pasar los datos del vector al objeto modelo
            modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
       return modelo;
    }
}
