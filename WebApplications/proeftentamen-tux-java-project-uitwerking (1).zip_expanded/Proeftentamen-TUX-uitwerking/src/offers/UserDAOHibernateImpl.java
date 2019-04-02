package offers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOHibernateImpl {

	private EntityManagerFactory emf;
	private EntityManager em;

	public UserDAOHibernateImpl() {
		super();
		emf = Persistence.createEntityManagerFactory("voorbeeld");
		em = emf.createEntityManager();
	}

	public void save(User user) {
		em.getTransaction().begin();
		em.persist(user);
		// ook eerst het adres object apart persisteren, anders exception dat deze
		// Transient is
		// em.persist(user.getAddress());
		em.getTransaction().commit();

	}

	/**
	 * Sla User samen met Offer op, Offer moet ook apart worden gepersisteerd
	 * 
	 * @param user
	 * @param offer
	 */
	public void saveUserAndOffer(User user, Offer offer) {
		em.getTransaction().begin();
		// ook eerst het offer object apart persisteren, anders exception dat deze
		// Transient is
		em.persist(offer);
		em.merge(user);
		em.getTransaction().commit();

	}

	public void saveOffer(Offer offer) {
		em.getTransaction().begin();
		// ook eerst het offer object apart persisteren, anders exception dat deze
		// Transient is
		em.persist(offer);

		em.getTransaction().commit();
	}

	public User getByName(String name) {
		return (User) em.createQuery("from User where username = :username").setParameter("username", name)
				.getSingleResult();
	}

}
