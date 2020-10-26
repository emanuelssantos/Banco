/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Users;
import JDBC.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanuel
 */
public class UserDAO {
    private Connection con;

    public UserDAO() {
        this.con = new ConnectionDB().getConnetion();
    }
    
    public boolean add(Users user){
        String sql = "INSERT INTO user(usuario, senha) VALUES(?,?);";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getSenha());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }
    
    
}
