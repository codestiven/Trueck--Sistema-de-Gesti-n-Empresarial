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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import trueck.usuario;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 * FXML Controller class
 *
 * @author stive
 */
public class loginController implements Initializable {

    @FXML
    private Button btn_inicio;
    @FXML
    private PasswordField contraseña;
    @FXML
    private TextField correo;
    @FXML
    private Button btn_registro;
    @FXML
    private Label inco;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void closewindows(){
                try {
                            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/registro.fxml"));
                            
                            Parent root  = Loader.load();
                            loginController controlador = Loader.getController();
                            Scene  scene = new Scene(root);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.show();
                            
                            stage.setOnCloseRequest(e -> controlador.closewindows());
                            
                            Stage myStage = (Stage) this.btn_registro.getScene().getWindow();
                            myStage.close();
                        } catch (IOException ex) {
                            Logger.getLogger(registroController.class.getName()).log(Level.SEVERE, null, ex);
                        }
    }
    
    
        public void ventanaP(){
             try {
                            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Principal.fxml"));
                            
                            Parent root  = Loader.load();
                            loginController controlador = Loader.getController();
                            Scene  scene = new Scene(root);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.show();
                            
                            stage.setOnCloseRequest(e -> controlador.ventanaP());
                            
                            Stage myStage = (Stage) this.btn_inicio.getScene().getWindow();
                            myStage.close();
                        } catch (IOException ex) {
                            Logger.getLogger(registroController.class.getName()).log(Level.SEVERE, null, ex);
                        }     
    }

    @FXML
    private void verificar(MouseEvent event) {
        
       usuario user;
       String corr =  correo.getText();
       String con =  contraseña.getText();
       
      
        int id_usuario = 0;
        String nombre,apellido,sexo,telefono,correo,contraseña;
      
            
            
        nombre="";
        apellido="";
        sexo="";
        telefono="";
        correo="";
        contraseña="";

        Date edad = new Date();
       
       
          user = new usuario(id_usuario,nombre,apellido,edad,sexo,telefono,correo,contraseña);
                                   
        
       		try{
                    

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/trueck", "root", "");

		            
		            String sql = " SELECT * FROM usuarios where correo = "+"'"+corr+"'" + " AND " + "contraseña = " +"'"+con+"'"  ;
		            
		            PreparedStatement ps = cn.prepareStatement(sql);
		            
		            ResultSet rs = ps.executeQuery();
        
		          

///condicion
if(rs.next()){
       
        nombre="";
        apellido="";
        sexo="";
        telefono="";
        correo="";
        contraseña="";
        

                                id_usuario = rs.getInt(1);
                                nombre = rs.getString(2);
                                apellido = rs.getString(3);
                                 edad = rs.getDate(4);
                                sexo = rs.getString(5);
                             
                                
                              telefono=rs.getString(6);
                                correo = rs.getString(7);
                                contraseña= rs.getString(8);
                                
		  
//                                   System.out.println(rs.getInt(1));
//                                    System.out.println(rs.getString(2));
//                                   System.out.println(rs.getString(3));
//                                    System.out.println(rs.getString(4));
//                                   System.out.println(rs.getString(5));
//                                    System.out.println(rs.getString(6));
//                                   System.out.println(rs.getString(7));
//                                   System.out.println(rs.getString(8));
                                   
                                   
                            
                                           
		            
                            
		                   user = new usuario(id_usuario,nombre,apellido,edad,sexo,telefono,correo,contraseña);
                                   
                                   
                       
                                   
             
                                   
                                   
                                   
                                   
              
                                   
                                   
      //abriendo ventana principal ----------------------------------------------------------------------------
                                        
             try {              
                    
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close(); 
                        
          
        Parent root = FXMLLoader.load(getClass().getResource("../vista/Principal.fxml"));
        Scene scene = new Scene(root);
        Stage  stageP = new Stage(StageStyle.DECORATED);
        stageP.setScene(scene);
        stageP.setResizable(true);
        stageP.setMaximized(true);

        stageP.show();
                            
//                            stage.setOnCloseRequest(e -> controlador.ventanaP());
//                            
//                            Stage myStage = (Stage) this.btn_inicio.getScene().getWindow();
//                            myStage.close();
             } catch (IOException ex) {
                            Logger.getLogger(registroController.class.getName()).log(Level.SEVERE, null, ex);
             }        
      }else{
       
                  JOptionPane.showMessageDialog(null,"el correo o la contraseña estan incorrecto");
                   this.correo.setId("input_mal");
                   this.contraseña.setId("input_mal");
                   this.inco.setVisible(true);
      }
		            
		           

		 
                            
		            
		            
                      
                      
		        cn.close();
		        rs.close();

                          
                         
              
		           
		        }catch (SQLException err){
		        	//JOptionPane.showMessageDialog(null, err);
                                System.out.print(err);
		       
		           
		           
		           
		        }
       
       
        
        
                
    }

    @FXML
    private void ing_refistro(MouseEvent event)  throws Exception {
        
        
          Node source = (Node) event.getSource();
          Stage stage = (Stage) source.getScene().getWindow();
          stage.close();  

    
        System.out.println("entrando");
        
        
        Stage stage2 = new Stage();

Parent root = FXMLLoader.load(getClass().getResource("../vista/registro.fxml"));
Scene scene = new Scene(root);

stage = new Stage(StageStyle.DECORATED);
stage2.setScene(scene);
stage2.setResizable(false);
stage2.initStyle(StageStyle.TRANSPARENT);
stage2.show();
     
 // FXMLLoader loader = new FXMLLoader(getClass().getResource("../vista/registro.fxml"));
  
    }
    

    
}
