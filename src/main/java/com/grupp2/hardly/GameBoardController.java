package com.grupp2.hardly;

import javafx.fxml.Initializable;

import javax.persistence.*;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class GameBoardController implements Initializable {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
    private String theWord;
    List<FiveLetter> fiveLetterList = null;
    public String getTheWord() {
        return theWord;
    }
    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }

    public void getRandomWord(){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

            try {
            transaction = em.getTransaction();
            transaction.begin();

            Query query = em.createNativeQuery("SELECT word FROM fiveletter where id = ?", FiveLetter.class);
            fiveLetterList = em.createNativeQuery("SELECT * FROM fiveletter", FiveLetter.class).getResultList();

            fiveLetterList = (List) query.getResultList();


            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null)
                transaction.rollback();
        } finally {
            em.close();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(5) +1;


        System.out.println(fiveLetterList.get(randomNumber));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getRandomWord();
    }
}
