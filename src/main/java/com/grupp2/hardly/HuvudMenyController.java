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
    
    @FXML
    public void openNewCustomerWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/edu/petersson/wigellsconcert/NewCustomerWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 329, 245);
        Stage stage = new Stage();
        stage.setTitle("New Customer");
        stage.setScene(scene);
        stage.show();
    }
    
}
