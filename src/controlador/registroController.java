/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 * FXML Controller class
 *
 * @author stive
 */
public class registroController implements Initializable {

    @FXML
    private TextField correo;
    private ComboBox<String> combo;    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private DatePicker edad;
    @FXML
    private ComboBox<String> sexo;
    @FXML
    private TextField contraseña;
    @FXML
    private Button btn_r;
    @FXML
    private TextField telefono;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        sexo.getItems().addAll("M","F");
     
        
        	
        

    }    

    @FXML
    private void ing_refistro(MouseEvent event) {
        
         int idn;
		
		//------------------------------------
		 try{
	            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/trueck", "root", "");

	            
	            String sql = "SELECT AUTO_INCREMENT FROM information_schema.tables WHERE TABLE_SCHEMA='trueck' AND TABLE_NAME='usuarios';";
	            PreparedStatement ps = cn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	          

	            Object caca = rs.toString();
	   int id = 0;
	       while(rs.next()) {
	    	   id = rs.getInt(1);
	    	   System.out.print(id);
	       }
	       
       	idn = id ;
        String Nombre = nombre.getText();
	String Apellido = apellido.getText();  
        
        LocalDate Fecha1 = edad.getValue();
        String Fecha = Fecha1.toString();
        
        
                     System.out.println(Fecha1);
        
        String Sexo = (String)sexo.getValue();
        String Telefono = telefono.getText(); 
        String Correo = correo.getText();
	String Contraseña = contraseña.getText();      
	         
        

        
        
         try{
             
			            Connection cn1 = DriverManager.getConnection("jdbc:mysql://localhost/trueck", "root", "");
			            PreparedStatement pst = cn1.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?)");
			       
			            pst.setLong(1, idn);
			            pst.setString(2, Nombre);
			            pst.setString(3, Apellido);
			            pst.setString(4, Fecha);
			            pst.setString(5, Sexo);
                                    pst.setString(6, Telefono);
			            pst.setString(7, Correo);
                                    pst.setString(8, Contraseña);
			            pst.executeUpdate();
			            
			            
			            JOptionPane.showMessageDialog(null, "evento agregado con extito");
                                    
                                
                        try {
                            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/login.fxml"));
                            
                            Parent root  = Loader.load();
                            loginController controlador = Loader.getController();
                            Scene  scene = new Scene(root);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                                    stage.initStyle(StageStyle.TRANSPARENT);
       // stage.setMaximized(true);
        stage.setScene(scene);
                            stage.show();
                            
                            stage.setOnCloseRequest(e -> controlador.closewindows());
                            
                            Stage myStage = (Stage) this.btn_r.getScene().getWindow();
                            myStage.close();
                        } catch (IOException ex) {
                            Logger.getLogger(registroController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                              
                                    
                                    
                                    
                                    
			            
			         
			      
        
         }catch (SQLException e){
	           System.out.print(e.toString()); 
	       
	           
	           
	           
	        }
        
	            
	        }catch (SQLException e){
	           System.out.print(e.toString()); 
	       
	           
	           
	           
	        }
                 
                 
                 
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
