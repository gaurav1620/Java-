package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;     //THis has to be added manually
import javafx.event.ActionEvent;

import javax.swing.event.ChangeEvent;
import java.security.PrivateKey;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloID;
    @FXML
    private Button byeID;
    @FXML
    private CheckBox checkID;

    @FXML
    public void initialize(){
        helloID.setDisable(true);
        byeID.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent e){
        System.out.println("The following was clicked:-"+e.getSource());
        if(e.getSource().equals(helloID)){
            System.out.println("Hello "+nameField.getText());
        }else if(e.getSource().equals(byeID)){
            System.out.println("Bye "+nameField.getText());
        }
//        try {
//            Thread.sleep(3000);
//        }catch(InterruptedException event){
//            //Nothing is used here
//        }
        clearORnotClear();
        checkID.setSelected(false);
    }

    @FXML
    public void handleKeyReleased(){
        String inp = nameField.getText();
        boolean disableButtons = inp.isEmpty() || inp.trim().isEmpty();
        helloID.setDisable(disableButtons);
        byeID.setDisable(disableButtons);
    }

    public void handleChange(){
        System.out.println("The Checkbox is "+(checkID.isSelected() ? "Selected!" : "Not Selected!"));
    }
    public void clearORnotClear(){
        if(checkID.isSelected()){
            nameField.clear();
            helloID.setDisable(true);
            byeID.setDisable(true);
        }
    }


}
