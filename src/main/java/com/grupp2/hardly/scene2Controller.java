package com.grupp2.hardly;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class scene2Controller implements Initializable {

    @FXML
    private TextField anvandarNamn;
    @FXML
    private Button gaTilbaka;
    @FXML
    private Button acceptera;
    private int wordlght;
    private String användernamnet;
    private HelloApplication h = new HelloApplication();
    public void hoppaYillbaka() throws IOException {
        h.changescene("HuvudMenyTest.fxml");
    }
    public void hoppavidare() throws IOException {
        h.changescene("gameBoard_5.fxml");
    }
    public void test(){
        System.out.println(wordlght);
    }
    public int getWordlght() {
        return wordlght;
    }

    public void setWordlght(int wordlght) {
        this.wordlght = wordlght;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                test();
            }
        });
        test();
    }
}
