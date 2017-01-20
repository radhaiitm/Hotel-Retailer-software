/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailer;

import java.io.File;
import java.io.IOException;
import javafx.stage.Stage;
import javax.swing.JFileChooser;

/**
 *
 * @author Radha
 */
public class FolderSelect {
    int filechooser() throws IOException{
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
          //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
          // System.out.println("getSelectedFile() : " + chooser.getSelectedFile()); 
          //File path = chooser.getSelectedFile();
          //int n = path.listFiles().length;
          UploadWindow  uw = new UploadWindow();
          Stage s2 = new Stage();
          uw.start(s2);
          //uw.vBoxes();
         
        } 
        else {
          System.out.println("No Selection ");
        }
        //File path= chooser.getSelectedFile();
        //return path;
        File path = chooser.getSelectedFile();
        int n = path.listFiles().length;
        return n;
    } 
    
    File getPath(){
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        File path= chooser.getSelectedFile();
        return path;
    }
}
