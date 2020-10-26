/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Users;
import DAO.UserDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author emanuel
 */
public class TelaCadastroController implements Initializable {

    @FXML
    private Button btnCriar;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtSenha;

    @FXML
    public void Criar(ActionEvent criar){
        Users user = new Users();
        user.setUsuario(txtUsuario.getText());
        user.setSenha(txtSenha.getText());
        
        UserDAO dao = new UserDAO();
        dao.add(user);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
