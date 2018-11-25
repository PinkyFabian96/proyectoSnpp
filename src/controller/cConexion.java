/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class cConexion {
     //definir variables para almacenar los datos de la conexion
    public String bd="boleto";
    public String url="jdbc:mysql://localhost/"+bd;
    public String user="root";
    public String pass="";
    //crear metodo de conexion
    public Connection conectar(){
        //crear variable de conexion
        Connection con=null;
        //Driver de conexion 
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}
