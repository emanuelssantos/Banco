package startPage;


import Classes.Users;
import DAO.UserDAO;
import JDBC.ConnectionDB;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuel
 */
public class TesteDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new ConnectionDB().getConnetion();
        Users u = new Users();
        u.setUsuario("emanuel");
        u.setSenha("123");
        
        UserDAO dao = new UserDAO();
        dao.add(u);
    }
    
}
