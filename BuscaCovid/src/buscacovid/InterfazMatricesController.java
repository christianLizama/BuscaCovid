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
        crearMatrices(FXMLDocumentController.getTamanioMatriz(), tablero);
        
        contenedorTablero.getChildren().add(tablero);
    }  
    
    public void crearMatrices(int tamannio,GridPane tablero){
        
        switch(tamannio){
            
            case 9:
                for (int i = 0; i < tamannio; i++) {
                    for (int j = 0; j < tamannio; j++) {
                        Button casilla = new Button();
                        casilla.setMinSize(casilla.USE_PREF_SIZE,casilla.USE_PREF_SIZE);
                        casilla.setPrefSize(45, 45);
                        tablero.add(casilla, i, j);
                    }
                }
                
                break;
            
            case 16:
                contenedorTablero.setLayoutX(10);
                for (int i = 0; i < tamannio; i++) {
                    for (int j = 0; j < tamannio; j++) {
                        Button casilla = new Button();
                        casilla.setMinSize(casilla.USE_PREF_SIZE,casilla.USE_PREF_SIZE);
                        casilla.setPrefSize(30, 30);
                        tablero.add(casilla, i, j);
                    }
                }
                
                break;
            case 32:
                
                contenedorTablero.setLayoutY(100);
                
                double height, width;
                
                height=fondo.getFitHeight();
                width=fondo.getFitWidth();
                
                //Agrandamos la imagen del tablero
                fondo.setFitHeight(height+155);
                fondo.setFitWidth(width+390);
                
                
                double xBotonIniciar=iniciarJuego.getLayoutX();
                double yBotonIniciar=iniciarJuego.getLayoutY();
                double xBotonReiniciar=reiniciarJuego.getLayoutX();
                double yBotonReiniciar=reiniciarJuego.getLayoutY();
                
                //iniciarJuego.setOpacity(100);
                //reiniciarJuego.setOpacity(100);
                
                //Movemos los botones para poder dejar todo acorde al nuevo tamaño
                iniciarJuego.setLayoutX(xBotonIniciar+163);
                iniciarJuego.setLayoutY(yBotonIniciar+9);
                reiniciarJuego.setLayoutX(xBotonReiniciar+225);
                reiniciarJuego.setLayoutY(yBotonReiniciar+9);
              
                for (int i = 0; i < tamannio; i++) {
                    for (int j = 0; j < tamannio; j++) {
                        Button casilla = new Button();
                        casilla.setMinSize(casilla.USE_PREF_SIZE,casilla.USE_PREF_SIZE);
                        casilla.setPrefSize(25, 25);
                        tablero.add(casilla, i, j);
                    }
                }
                break;
        }
    }

    
    @FXML
    private void iniciar(ActionEvent event) {
        System.out.println("jugar");
    }

    @FXML
    private void reiniciar(ActionEvent event) {
        System.out.println("Reiniciar");
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
