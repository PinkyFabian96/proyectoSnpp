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
import model.mGasto;
import view.*;

/**
 *
 * @author DELL
 */
public class cGasto {

    cConexion cone = new cConexion();//objeto de cConexion
    Connection c = cone.conectar();
    ResultSet rs;
    Statement st;
    
    public void pasarDatos(mGasto gas){
        gas.setGastoadministrativoGasto(Integer.parseInt(vGasto.txtGastoAdministrativo.getText()));
        gas.setGastoVariosGasto(Integer.parseInt(vGasto.txtGastoVarios.getText()));
        gas.setDescripcionGasto(vGasto.txtDescripcion.getText());
    }    

    public void insertarGasto(mGasto gas) {
        try {
        //PreparedStatement
            PreparedStatement pst=c.prepareStatement("call pInsertarGasto(?,?,?)");
            pst.setInt(1,gas.getGastoadministrativoGasto());
            pst.setInt(2,gas.getGastoVariosGasto());
            pst.setString(3,gas.getDescripcionGasto());
            //EJECUTAMOS 
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"GASTOS ADMINISTRATIVOS INSERTADOS");
            System.out.println(pst);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR VERIFIQUE LOS DATOS");
           
           
        }

    }

}
