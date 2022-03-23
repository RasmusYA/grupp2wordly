package com.grupp2.hardly;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HuvudMenyController {
    @FXML
    private Button Val5;
    @FXML
    private Button Val6;
    @FXML
    private Button Val7;
    
    
    public void val5(){
        openScene2(5);
    }
    
    public void val6(){
        openScene2(6);
    }
    
    public void val7(){
        openScene2(7);
    }
    
    public void openScene2(int wordLength) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2Controller.fxml"));
        Parent root = loader.load();
        scene2Controller crmController = loader.getController();
        //crmController.setWordLength(wordLength); // Sätter längden på ord i scene2 (setWordLength metoden är inte implementerad i scen2 än).
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
}
