/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author stive
 */
public class principalController implements Initializable {

 
    @FXML
    private BorderPane Paneles;
    @FXML
    private HBox usuario;
    @FXML
    private HBox btn_inicio;
    @FXML
    private HBox btn_producto;
    @FXML
    private HBox btn_deudas;
    private  AnchorPane anchorPane = new AnchorPane();
    @FXML
    private AnchorPane ccc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
        private void cambiarPanel(String panel) {
        Parent root = null;
        
        try {
            root = FXMLLoader.load(getClass().getResource(panel+".fxml"));
            
// CAMBIA Y MUESTRA EL FXML CORRESPONDIENTE AL PANEL SELECCIONADO
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
  
      //  Paneles.getWidth();

         // root.setMax();
//         root.maxHeight(Double.MAX_VALUE);
//         root.maxWidth(Double.MAX_VALUE);
         
          root.prefHeight(Double.MAX_VALUE);
          root.prefWidth(Double.MAX_VALUE);

          

          Paneles.setTop(root);
    }

    @FXML
    private void Abrir_inicio(MouseEvent event) {
           cambiarPanel("../vista/Paneles/Inicio");
    }

    @FXML
    private void Abrir_productor(MouseEvent event) {
            cambiarPanel("../vista/Paneles/Productos");
    }

    @FXML
    private void Abrir_deudas(MouseEvent event) {
          cambiarPanel("../vista/Paneles/Deudas");
    }


    
}
