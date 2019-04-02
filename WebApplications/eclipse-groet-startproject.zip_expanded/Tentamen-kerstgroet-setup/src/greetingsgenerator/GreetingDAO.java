package greetingsgenerator;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Verantwoordelijk voor CRUD handelingen voor de Greeting klasse
 */
public class GreetingDAO {

	private EntityManagerFactory emf;
	private EntityManager em;

	public GreetingDAO() {
		super();
		emf = Persistence.createEntityManagerFactory("voorbeeld");
		em = emf.createEntityManager();
	}

	/**
	 * Persisteert een Greeting object
	 * @param greeting
	 */
	public void save(Greeting greeting) {
		em.getTransaction().begin();
		em.persist(greeting);
		em.getTransaction().commit();
	}
	
	/**
	 * Selecteert alle Greeting objecten als List uit de Database
	 * @return List van Greeting objecten
	 */
	@SuppressWarnings("unchecked")
	public List<Greeting> list(){
		return em.createQuery("FROM Greeting").getResultList();
	}
	
	/**
	 * Selecteert een Gift met gegeven Id uit de database
	 * @param id
	 * @return Gift object met gegeven Id
	 */
	public Greeting findById(long id) {
		return em.find(Greeting.class, id);
	}
	
}
