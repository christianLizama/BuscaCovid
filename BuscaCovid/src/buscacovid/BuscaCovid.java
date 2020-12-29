/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ckill
 */
public class BuscaCovid extends Application {
    
    Scanner scanner = new Scanner(System.in);
    int tablero [][] = new int[5][5];
    
    int intentos = 0;
    int nVirus = 10;
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        //Inicializar el arreglo bidireccional del tablero
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++)
                tablero[i][j] = 0;
        }
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
