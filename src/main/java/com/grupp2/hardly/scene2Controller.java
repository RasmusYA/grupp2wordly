package com.grupp2.hardly;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class scene2Controller {

    @FXML
    private TextField anvandarNamn;
    @FXML
    private Button gaTilbaka;
    @FXML
    private Button acceptera;
    private int wordlght;

    public int getWordlght() {
        return wordlght;
    }

    public void setWordlght(int wordlght) {
        this.wordlght = wordlght;
    }
}
