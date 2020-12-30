/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    
    GridPane tablero = new GridPane();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tablero.setVisible(false);
        crearMatrices(FXMLDocumentController.getTamanioMatriz(), tablero);
        
        contenedorTablero.getChildren().add(tablero);
    }  
    
    public void crearMatrices(int tamannio,GridPane tablero){
        
        switch(tamannio){
            
            case 9:
                for (int i = 0; i < tamannio; i++) {
                    for (int j = 0; j < tamannio; j++) {
                        Button casilla = new Button();
                        
                        //Si usamos los distintos click
                        casilla.setOnMousePressed(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.isSecondaryButtonDown()){
                                    
                                    agregaBandera(casilla,30);
                                    
                                }
                                else{
                                    System.out.println("Se ha pulsado una casilla");
                                    System.out.println("Entro aca");
                                    casilla.setDisable(true);
//                                    descubrirEspacio(casilla, 30);
                                }
                            }
                        });
                        
                        
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
                        //Si usamos los distintos click
                        casilla.setOnMousePressed(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.isSecondaryButtonDown()){
                                    
                                    agregaBandera(casilla,20);
                                }
                                else{
                                    System.out.println("Se ha pulsado una casilla");
                                    System.out.println("entro");
//                                    casilla.setOpacity(0);
                                }
                            }
                        });
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
                        //Si usamos los distintos click
                        casilla.setOnMousePressed(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.isSecondaryButtonDown()){
                                    
                                    agregaBandera(casilla, 16);
                                    
                                }
                                else{
                                    System.out.println("Se ha pulsado una casilla");
                                    System.out.println("entro");
//                                    casilla.setOpacity(0);
                                    casilla.setGraphic(new ImageView(new Image("Images/Espacio.png",16,16,false,true)));
                                    
                                }
                            }
                        });
                        casilla.setMinSize(casilla.USE_PREF_SIZE,casilla.USE_PREF_SIZE);
                        casilla.setPrefSize(25, 25);
                        tablero.add(casilla, i, j);
                    }
                }
                break;
        }
    }
    public void agregaBandera(Button casilla,int sizeFlag){
        Image imagenBandera = new Image("Images/bandera.png",sizeFlag,sizeFlag,false,true);
        ImageView iconoBandera = new ImageView(imagenBandera);

        if(casilla.getGraphic()==null){
            System.out.println("Se ha marcado un virus");
            casilla.setGraphic(iconoBandera);
        }
        else{
            System.out.println("Se ha desmarcado un virus");
            casilla.setGraphic(null);
        }
        
    }
    
    public void descubrirNumero(Button casilla,int sizeFlag){
        Image imagenBandera = new Image("Images/Espacio.png",sizeFlag,sizeFlag,false,true);
        ImageView iconoBandera = new ImageView(imagenBandera);

        if(casilla.getGraphic()==null){
            System.out.println("Se ha marcado un virus");
            casilla.setGraphic(iconoBandera);
        }
        else{
            System.out.println("Se ha desmarcado un virus");
            casilla.setGraphic(null);
        }
        
    }
    
    public void descubrirVirus(Button casilla,int sizeFlag){
        Image imagenVirus = new Image("Images/Virus.png",sizeFlag,sizeFlag,false,true);
        ImageView iconoVirus = new ImageView(imagenVirus);

        if(casilla.getGraphic()==null){
            System.out.println("Se ha encontrado un virus");
            casilla.setGraphic(iconoVirus);
            casilla.setDisable(true);
            Alert a = new Alert(AlertType.NONE);
            // action event 
            EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
                public void handle(ActionEvent e){ 
                    a.setAlertType(AlertType.ERROR); 
                    a.show(); 
                } 
            }; 
        }

        
    }
    @FXML
    private void iniciar(ActionEvent event) {
        System.out.println("jugar");
        tablero.setVisible(true);
        
    }

    @FXML
    private void reiniciar(ActionEvent event) {
        System.out.println("Reiniciar");
        
        for (Node boton : tablero.getChildren()) {
            Button casilla = (Button) boton;
            casilla.setGraphic(null);
        }
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
