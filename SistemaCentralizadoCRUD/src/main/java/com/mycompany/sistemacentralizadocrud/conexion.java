/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemacentralizadocrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xtratech
 */
public class conexion {
    
    public Connection getConexion(){
    Connection conexion=null;
    String servidor="localhost";
    String puerto="5432";
    String baseDatos="supermercado3";
    String url="jdbc:postgresql://" + servidor + ":" + puerto + "/" + baseDatos;
    String usuario="postgres";
    String clave="thalia11";
    try {
        conexion=DriverManager.getConnection(url,usuario,clave);
    }catch (SQLException ex){
        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,ex);
    }
    return conexion;
    
    }
    
}
