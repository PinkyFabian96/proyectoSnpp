
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

public class cRendicion {
     cConexion cone=new cConexion();//objeto de cConexion
    Connection c=cone.conectar();
       ResultSet rs;
    Statement st;

    public void pasarDatos(mRendicion ren){
        //cr.setRecaudacionBoletoChoferRendicion(Integer.parseInt(vRendicion.txtRecaudacionChofer.toString()));//
        ren.setGastoGasoilRendicion(Integer.parseInt(vRendicion.txtGastoGasoil.toString()));//
        ren.setInicioboletoRendicion(Integer.parseInt(vRendicion.txtInicioBoleto.toString()));//
        ren.setFinBoletoRendicion(Integer.parseInt(vRendicion.txtFinBoleto.toString()));//
        ren.setTotalredondoRendicion(Integer.parseInt(vRendicion.txtRedondo.toString()));//
       // bus.setCodBus(Integer.parseInt(vRendicion.txtChoche.toString()));//
       // per.setNombrePersona(vRendicion.txtChofer.toString());
        ren.setGastoRendicion(Integer.parseInt(vRendicion.txtGastos.toString()));
       
    }  
    public void insertarRendicion(mRendicion ren){
       
        try {
            //PreparedStatement
            PreparedStatement pst=c.prepareStatement("INSERT INTO rendicion(gastoGasoil,"
            + "inicioBoleto,finBoleto,totalRedondo,Gasto_codGasto)\n" +
            "VALUES(?,?,?,?,?);");
            //pasar valor a los parametros

            pst.setInt(1, ren.getGastoGasoilRendicion());//
            pst.setInt(2, ren.getInicioboletoRendicion());//
            pst.setInt(3, ren.getFinBoletoRendicion());//
            pst.setInt(4, ren.getTotalredondoRendicion());//
            pst.setInt(5, ren.getGastoRendicion());
  
           // ejecutar
           pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Rendicion Registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println("");
        }
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
            JOptionPane.showMessageDialog(null,"Rendicion Registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println("");
        }
    } 
     public DefaultTableModel grillaRendicion(){
    //crear el objeto de DEfaulTableModel
        DefaultTableModel modelo=new DefaultTableModel();
        //titulos
        
        modelo.addColumn("Fecha");//1
        modelo.addColumn("Recaudacion por Chofer");//2
        modelo.addColumn("Gasoil");//3
        modelo.addColumn("Inicio de Boleto");//4
        modelo.addColumn("Fin de Boleto");//5
        modelo.addColumn("Promedio de Boletos");//6
        modelo.addColumn("Redondos Realizados");//7
        modelo.addColumn("Gasto General");//8
         modelo.addColumn("N° de Coche");//9
         modelo.addColumn("Chofer");//10
         modelo.addColumn("ci");
        //agregar los titulos a la grilla
       
        vRendicion.grdRendicion.setModel(modelo);
        //crear una veriable de tipo array para almacenar los datos de la db
        String[] vector=new String[11];
        //definir variable para almacenar la sentencia sql
        String cadena;
        cadena="SELECT  r.fecha, r.recaudacionChofer, r.gastoGasoil,r.finBoleto,r.inicioBoleto,r.finBoleto-r.inicioBoleto, \n" +
        "r.totalRedondo, g.gastoAdminstrativo+g.gastoVarios, r.bus_codCoche,CONCAT(p.nombre,\" \",p.apellido),p.ci FROM rendicion r\n" +
        "JOIN gasto g ON g.codGasto=r.Gasto_codGasto\n" +
        "JOIN choferrendicion chr ON chr.rendicion_idRendicion=r.idRendicion\n" +
        "JOIN chofer ch ON ch.persona_ci=chr.chofer_persona_ci\n" +
        "JOIN persona p ON p.ci=ch.persona_ci ORDER BY (r.idRendicion) DESC;";
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
            vector[9]=rs.getString(10);
            vector[10]=rs.getString(11);
            //pasar los datos del vector al objeto modelo
            modelo.addRow(vector);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
       return modelo;
    }     
         
          
}
