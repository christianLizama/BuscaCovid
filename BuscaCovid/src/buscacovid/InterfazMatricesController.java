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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

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
    @FXML
    private Pane contenedorTablero;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        GridPane tablero = new GridPane();
        if(FXMLDocumentController.getTamanioMatriz()==9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    Button casilla = new Button();
                    casilla.setMinSize(casilla.USE_PREF_SIZE,casilla.USE_PREF_SIZE);
                    casilla.setPrefSize(45, 45);
                    tablero.add(casilla, i, j);
                }
            }
        }
        else if(FXMLDocumentController.getTamanioMatriz()==16){
            
        }
        else if(FXMLDocumentController.getTamanioMatriz()==32){
            
        }
        
        contenedorTablero.getChildren().add(tablero);
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
