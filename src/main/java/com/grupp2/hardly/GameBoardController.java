
public class GameBoardController implements Initializable {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
    private string theWord;


    public void getRandomWord(){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;
        customerTableView.getItems().clear();
        try {
            transaction = em.getTransaction();
            transaction.begin();

            Random random = new Random();
            int randomNumber = random.nextInt(4);
            List<Customer> customerList = em.createNativeQuery("SELECT id FROM fiveletter", FiveLetter.class).getResultList();

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
