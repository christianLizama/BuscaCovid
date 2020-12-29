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
    
    //Declaración de variables para el tablero
    int ancho = 5; //depende de la dificultad se debe hacer genérico
    int alto = 5;
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
    
    //Coloca el número de virus dependiendo del ancho y alto del tablero
    public void generarVirus(int numeroVirus){
        double randomX = 0;
        double randomY = 0;
        int condicion = 0;
        
        do{
            randomX = Math.random()*ancho;
            randomY = Math.random()*alto;
            
            if(randomY!=0 && randomX!=0 && randomY!=alto-1 && randomX!=ancho-1){               
                //asignamos un numero para las bombas generadas en el tablero
                tablero[(int)randomX][(int)randomY] = 9; 
                condicion++;
            }
            
            
        }while(condicion<=ancho);
    }
    
}
