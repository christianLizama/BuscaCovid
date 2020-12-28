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
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ckill
 */
public class InterfazMatricesController implements Initializable {

    @FXML
    private ImageView fondo;
    @FXML
    private Button iniciarJuego;
    @FXML
    private Button reiniciarJuego;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void iniciar(ActionEvent event) {
    }

    @FXML
    private void reiniciar(ActionEvent event) {
    }

    public ImageView getFondo() {
        return fondo;
    }

    public void setFondo(ImageView fondo) {
        this.fondo = fondo;
    }

    public Button getIniciarJuego() {
        return iniciarJuego;
    }

    public void setIniciarJuego(Button iniciarJuego) {
        this.iniciarJuego = iniciarJuego;
    }

    public Button getReiniciarJuego() {
        return reiniciarJuego;
    }

    public void setReiniciarJuego(Button reiniciarJuego) {
        this.reiniciarJuego = reiniciarJuego;
    }
    
}
