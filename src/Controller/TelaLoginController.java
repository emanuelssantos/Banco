package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import startPage.Cadastro;

import JDBC.ConnectionDB;





/**
 *
 * @author emanuel
 */
public class TelaLoginController implements Initializable {

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnLogar;

    @FXML
    private Button btnCadastrar;

    @FXML
    public void Cadastrar(ActionEvent cadastrar) throws IOException{
        Cadastro cadastro = new Cadastro();
        try {
            cadastro.start(new Stage());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void Logar(ActionEvent logar) {
        ConnectionDB connectionDB = new ConnectionDB();
        Connection conection = connectionDB.getConnetion();
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }    
    
}
