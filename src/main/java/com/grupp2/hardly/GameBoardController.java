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


    public void getRandomWord(){

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
        getRandomWord();
    }
}
