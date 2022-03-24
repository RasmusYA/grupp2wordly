package com.grupp2.hardly;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class GameBoardController implements Initializable {

    @FXML
    public TextField testTextfield;
    @FXML
    public Label testLabel;
    @FXML
    private Button test;
    @FXML
    private Rectangle R1S1,R1S2,R1S3,R1S4,R1S5,R2S1,R2S2,R2S3,R2S4,R2S5,R3S1,R3S2,R3S3,R3S4,R3S5,R4S1,R4S2,R4S3,R4S4,R4S5,R5S1,R5S2,R5S3,R5S4,R5S5;

    Rectangle[] rad1 = {R1S1,R1S2,R1S3,R1S4,R1S5};
    Rectangle[] rad2 = {R2S1,R2S2,R2S3,R2S4,R2S5};
    Rectangle[] rad3 = {R3S1,R3S2,R3S3,R3S4,R3S5};
    Rectangle[] rad4 = {R4S1,R4S2,R4S3,R4S4,R4S5};
    Rectangle[] rad5 = {R5S1,R5S2,R5S3,R5S4,R5S5};


    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
    private String theWord;


    public void getRandomWord(){
/*
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

            try {
            transaction = em.getTransaction();
            transaction.begin();

            Random random = new Random();
            int randomNumber = random.nextInt(4);
            Query query = (Query) em.createNativeQuery("SELECT word FROM fiveletter where id = ?", FiveLetters.class).getResultList();
            query.setParameter(1, randomNumber);
            theWord = (String) query.getSingleResult();
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null)
                transaction.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        getRandomWord();
    }

 */
    public void testText(){

    testText.get

    }
}
