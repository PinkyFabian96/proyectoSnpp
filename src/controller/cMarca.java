/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import model.mMarca;
import view.vMarca;
/**
 *
 * @author Fabian
 */
public class cMarca {

    cConexion cone = new cConexion();//objeto de cConexion
    Connection c = cone.conectar();
    ResultSet rs;
    Statement st;
    
    
    public void pasarDatos(mMarca marca){
        
        marca.setCarroceriaMarca(vMarca.txtCarroceria.getText());
        marca.setDescripcionMarca(vMarca.txtDescripcion.getText());
        marca.setMarcaMotorMarca(vMarca.txtMarcaMotor.getText());
      
    }
    
    public void insertarMarca(mMarca marca) {

    try {
        //PreparedStatement
            PreparedStatement pst=c.prepareStatement("call pInsertarMarca(?,?,?)");
            pst.setString(1,marca.getCarroceriaMarca());
            pst.setString(2,marca.getDescripcionMarca());
            pst.setString(3,marca.getMarcaMotorMarca());
            //EJECUTAMOS 
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"DATOS DE LAS MARCAS INSERTADAS");
            System.out.println(pst);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR VERIFIQUE LOS DATOS");
           
           
        }

    }

}
