/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Radha
 */
public class UploadWindow {
    public void start(Stage secondStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Retailer2.fxml"));
        
       // Scene scene = new Scene(root,300,250);
        
        Scene scene = new Scene(root);
        secondStage.setScene(scene);
        secondStage.show();
    }
    
     public void menuDisplay() throws IOException{
        FolderSelect fs2 = new FolderSelect();
        fs2.filechooser();
        ArrayList<HBox> hbox = new ArrayList<HBox>();
    }
     
     public void vBoxes(){
         FolderSelect fs3 = new FolderSelect();
         fs3.getPath();
         File folder = new File("path");
         File[] listOfFiles = folder.listFiles();
           
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                System.out.println("File " + listOfFile.getName());
            } else if (listOfFile.isDirectory()) {
                System.out.println("Directory " + listOfFile.getName());
            }
        }
    }
}
     
