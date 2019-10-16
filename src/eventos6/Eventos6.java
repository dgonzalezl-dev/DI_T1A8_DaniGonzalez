/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos6;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Eventos6 extends Application {
    Pane panel;
    Text tx1;
  
    @Override
    public void start(Stage primaryStage) {
        panel=new Pane();
        tx1=new Text(20,20,"A");
        tx1.setOnKeyPressed(new Teclado());
        tx1.setFocusTraversable(true);
        
        panel.getChildren().add(tx1);
        Scene scene = new Scene(panel, 300, 300);
        
        primaryStage.setTitle("Eventos 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class Teclado implements EventHandler<KeyEvent>{
        double num1;
        @Override
        public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.DOWN) {
                tx1.setY(tx1.getY()+10);
                num1=tx1.getY();
                if(num1 == 300){
                    tx1.setY(0); 
                }
            }else if(event.getCode() == KeyCode.UP){
                tx1.setY(tx1.getY()-10);
                num1=tx1.getY();
                if(num1 == 0){
                    tx1.setY(300); 
                }
            }else if(event.getCode() == KeyCode.LEFT){
                tx1.setX(tx1.getX()-10);
                num1=tx1.getX();
                if(num1 == 0){
                    tx1.setX(300); 
                }
            }else if(event.getCode() == KeyCode.RIGHT){
                tx1.setX(tx1.getX()+10);
                num1=tx1.getX();
                if(num1 == 300){
                    tx1.setX(0); 
                }
            }
        }
        
    }   
    public static void main(String[] args) {
        launch(args);
    }
    
}
