/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



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
    private void Cadastrar(ActionEvent cadastrar) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("TelaCadastro.fxml"));
        //StackPane sp = new StackPane();
        Scene scene = new Scene(root);
        
        Stage pagCadastrar = new Stage();
        
        pagCadastrar.setScene(scene);
        pagCadastrar.show();
    }

    @FXML
    private void Logar(ActionEvent cadastrar) {
        System.out.println("logando");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}