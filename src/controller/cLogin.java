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
import model.mLogin;
import view.vLogin;

/**
 *
 * @author Fabian
 */
public class cLogin {

    cConexion cone = new cConexion();//objeto de cConexion
    Connection c = cone.conectar();
    ResultSet rs;
    Statement st;
    public String usuario,clave;

    public void pasarDatos(mLogin login) {
        login.setUsuario(vLogin.txtUsuario.getText());
        login.setClave(vLogin.txtClave.getText());
    }

    public boolean validarUsuario(mLogin login) {
        try {
            //PreparedStatement pst=c.prepareStatement("SELECT usuario,contrasenha FROM usuario WHERE usuario = ? AND contrasenha= ? ");
            PreparedStatement pst=c.prepareStatement("call pValidarUsuario(?,?)");
            pst.setString(1,login.getUsuario());
            pst.setString(2,login.getClave());
            rs=pst.executeQuery();
            if(rs.next()){
            usuario=rs.getString("usuario");
            //clave=rs.getString("contrasenha");
            JOptionPane.showMessageDialog(null,"INGRESADO");
            return true;
            }else{
                JOptionPane.showMessageDialog(null,"ERROR CLAVE O USUARIO INCORRECTOS");
                return false;
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR\n"+e);
            return false;
        }
    }
}
