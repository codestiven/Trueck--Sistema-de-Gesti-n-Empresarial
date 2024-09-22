/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author stive
 */
public class pruevaController implements Initializable {

    @FXML
    private BorderPane bpPrincipal;
    @FXML
    private VBox vbMenu;
    @FXML
    private Button btnPanel1;
    @FXML
    private Button btnPanel2;
    @FXML
    private Button btnPanel3;
    @FXML
    private AnchorPane apPanel;
    @FXML
    private Label lblContenedor;

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
            root = FXMLLoader.load(getClass().getResource(panel+".fxml")); // CAMBIA Y MUESTRA EL FXML CORRESPONDIENTE AL PANEL SELECCIONADO
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        bpPrincipal.setCenter(root);
    }

    @FXML
    private void panel1(MouseEvent event) {
         cambiarPanel("../vista/panel1");
    }

    @FXML
    private void panel2(MouseEvent event) {
        cambiarPanel("../vista/panel2");
    }

    @FXML
    private void panel3(MouseEvent event) {
        cambiarPanel("../vista/panel3");
    }
    
}
