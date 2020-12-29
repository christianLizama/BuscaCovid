/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nivelPrincipiante(ActionEvent event) throws IOException {
        cambioEscena("interfazMatrices.fxml");
        
    }

    @FXML
    private void nivelIntermedio(ActionEvent event) {
    }

    @FXML
    private void nivelAvanzado(ActionEvent event) {
    }
    
    public void cambioEscena(String nombreFxml) throws IOException{
        Stage stage2 = (Stage) this.principiante.getScene().getWindow();
        stage2.close();
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource(nombreFxml));
        Scene scene = new Scene(root2);

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
    }
    
}
