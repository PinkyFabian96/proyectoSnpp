package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.*;
import model.*;


public class cChofer {
    cConexion cone=new cConexion();//objeto de cConexion
    Connection c=cone.conectar();
       ResultSet rs;
    Statement st;
    
    public void pasarDatos(mChofer ch){
        ch.setCiChofer(Integer.parseInt(vChofer.txtCi.getText()));
        ch.setAntiguedadChofer(Integer.parseInt(vChofer.txtIngreso.getText()));
        ch.setEstadocivilChofer(vChofer.cboEstadoCivil.getSelectedIndex());
        ch.setTiposangreChofer(vChofer.cboTipoSangre.getSelectedIndex());
        ch.setRegistroChofer(vChofer.txtRegisto.getText());
    }
    public void insertarChofer(mChofer ch){
        try {
            //PreparedStatement
            PreparedStatement pst=c.prepareStatement("INSERT INTO chofer(personaCi,antiguedad,estadoCivil,tipoSangre,registro)\n" +
                "VALUES(?,?,?,?,?)");
            //pasar valor a los parametros
            pst.setInt(1,ch.getCiChofer());
            pst.setInt(2,ch.getAntiguedadChofer());
            pst.setInt(3,ch.getEstadocivilChofer());
            pst.setInt(4,ch.getTiposangreChofer());
            pst.setString(5,ch.getRegistroChofer());
          
           // ejecutar
           pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Chofer Registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println("");
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
        vChofer.grdChofer.setModel(modelo);
     
        //crear una veriable de tipo array para almacenar los datos de la db
        String[] vector=new String[6];
        //definir variable para almacenar la sentencia sql
        String cadena;
        cadena="SELECT ci,nombre,apellido,telefono,direccion,CASE WHEN genero='2' THEN 'Femenino' ELSE 'Masculino' END AS sexo"
                + " FROM persona WHERE funcionario=0 AND chofer=0";
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
    public DefaultTableModel grillaChofer(){
    //crear el objeto de DEfaulTableModel
        DefaultTableModel modelo=new DefaultTableModel();
        //titulos
        modelo.addColumn("Documento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Antiguedad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Tipo de Sangre");
        modelo.addColumn("Registro de Conducir");
        //agregar los titulos a la grilla
        vChofer.grdChofer.setModel(modelo);
     
        //crear una veriable de tipo array para almacenar los datos de la db
        String[] vector=new String[9];
        //definir variable para almacenar la sentencia sql
        String cadena;
        cadena="SELECT 	personaCi,p.nombre,p.apellido,antiguedad,p.telefono,p.direccion,\n" +
            "CASE WHEN estadoCivil='1' THEN 'Soltero(a' \n" +
            "WHEN estadoCivil='2' THEN 'Casado(a)'\n" +
            "WHEN estadoCivil='3' THEN 'Divorciado(a)'\n" +
            "WHEN estadoCivil='4' THEN 'Viudo(a)' END,\n" +
            "CASE WHEN tipoSangre='1' THEN '0 RH+'\n" +
            "WHEN tipoSangre='2' THEN '0 RH-'\n" +
            "WHEN tipoSangre='3' THEN 'A RH+'\n" +
            "WHEN tipoSangre='4' THEN 'A RH-'\n" +
            "WHEN tipoSangre='5' THEN 'A RH-'\n" +
            "WHEN tipoSangre='6' THEN 'B RH+'\n" +
            "WHEN tipoSangre='7' THEN 'B RH-'\n" +
            "WHEN tipoSangre='8' THEN 'AB RH+'\n" +
            "WHEN tipoSangre='9' THEN 'AB RH-' END\n" +
            ",registro	\n" +
            "FROM chofer ch JOIN persona p ON p.ci=ch.personaCi ;";
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
            vector[6]=rs.getString(7);
            vector[7]=rs.getString(8);
            vector[8]=rs.getString(9);
            //pasar los datos del vector al objeto modelo
            modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
       return modelo;
    }
}
