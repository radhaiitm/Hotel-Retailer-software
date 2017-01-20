/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Radha
 */
public class Retailer1Controller implements Initializable {

    @FXML
    private AnchorPane anchorpane;
    @FXML
    private ImageView imagebg;
    @FXML
    private Button menuupload;
    @FXML
    private Button editmenu;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane2;
    @FXML
    private Label labelhome;
    @FXML
    private Label labelorder;
    @FXML
    private Label labelreserve;
    @FXML
    private Label labelstatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    } 

    @FXML
    private void menuUplaod(ActionEvent event) throws IOException {
           FolderSelect sobject=new FolderSelect();
           sobject.filechooser();
        
      /*  
        if(event.getSource()== menuupload){
        System.out.println("Button1 clicked");
        
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("C:\\Users\\Venkateswararao\\Desktop\\Intern Project"));          //Initial directory
        fc.getExtensionFilters().addAll(
                     new ExtensionFilter("pdf files","*.pdf")                                            //Opening particular extension files
        );
      */
        /*
            File f1 = fc.showOpenDialog(null);                                                          //Opening a single file
        //  List<File> f2 = fc.showOpenMultipleDialog(null);                                           //Opening multiple files
        if(f1 != null){ 
            System.out.println(f1.getName());
        }
        else{
            System.out.println("Invalid file");
        }
       
           
      }
      else if(event.getSource()== editmenu){
         System.out.println("Button2 clicked");
      }
      else{
         System.out.println("Invalid Button");
      }
      */
    }

    @FXML
    private void handleLabelEvent(MouseEvent event) {
         if(event.getSource()==labelhome){
            System.out.println("Home is selected");
        }
        else if(event.getSource()==labelorder){
            System.out.println("Ordering is selected");
        }
        else if (event.getSource()==labelreserve){
            System.out.println("Reservations is selected");
        }
        else if(event.getSource()==labelstatus){
            System.out.println("Status is selected");
        }
        else{
            System.out.println("Invalid Label");
        }
    }

    @FXML
    private void editMenu(ActionEvent event) {
    System.out.println("Edit Menu is clicked");
    }


   
    }

   
   

