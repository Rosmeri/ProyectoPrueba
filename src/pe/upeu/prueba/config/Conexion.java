/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.prueba.config;

import java.sql.Connection;
import java.sql.DriverManager;
import static pe.upeu.prueba.config.Conexion.conex;

/**
 *
 * @author alum.fial7
 */
public class Conexion {
    public static String url="jdbc:mysql://localhost/bd_visitas";
    public static   String usuario="root";
    public static   String clave="root";
    public static Connection conex =null;
    
   public static Connection getConnection(){
       try {
            if(conex==null){
            Class.forName("com.mysql.jdbc.Driver");
            conex= DriverManager.getConnection(url,usuario,clave);
                }
       } catch (Exception e) {
       }
                    return conex;
            }
    
        }
   
 
