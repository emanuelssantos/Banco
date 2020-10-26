/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionDB {
    public Connection connection;
    
    /**
     *
     * @return
     */
    public Connection getConnetion(){
            
        
            String nomeUsuario = "root";
            String senhaUsuario = "";
            String nomeBanco = "Banco";
            
            try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+nomeBanco,nomeUsuario,senhaUsuario);
            
            //enderecoServidor = "localhost:3306";
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            return connection;
        }
    
}
