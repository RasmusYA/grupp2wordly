package com.grupp2.hardly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HuvudMenyController {
    @FXML
    private Button Val5;
    @FXML
    private Button Val6;
    @FXML
    private Button Val7;
    private  scene2Controller s = new scene2Controller();
    private HelloApplication h = new HelloApplication();


    public void val5() throws IOException {
        s.setWordlght(5);
        h.changescene("scene 2.fxml");
    }

    public void val6() throws IOException {
        s.setWordlght(5);
        h.changescene("scene 2.fxml");
    }

    public void val7() throws IOException {
        s.setWordlght(5);
        h.changescene("scene 2.fxml");
    }

    public void openScene2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/grupp2/hardly/scene2Controller.fxml"));
        Parent root = loader.load();
        scene2Controller crmController = loader.getController();
        crmController.setWordlght(5);
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setUserData(5);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

}