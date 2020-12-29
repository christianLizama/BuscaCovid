/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author ckill
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button principiante;
    @FXML
    private Button intermedio;
    @FXML
    private Button avanzado;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nivelPrincipiante(ActionEvent event) {
    }

    @FXML
    private void nivelIntermedio(ActionEvent event) {
    }

    @FXML
    private void nivelAvanzado(ActionEvent event) {
    }
    
}
