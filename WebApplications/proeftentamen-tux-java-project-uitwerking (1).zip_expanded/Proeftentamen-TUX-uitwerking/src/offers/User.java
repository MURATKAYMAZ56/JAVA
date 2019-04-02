package offers;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="gebruiker")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="gebruikersnaam")
	private String username;
	
	private String email;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private List<Offer> offerList;

	public User() {

	}

	/**
	 * Voegt een koopje toe
	 * @param koopje
	 */
	public void addOffer(Offer koopje) {
		this.offerList.add(koopje);
	}
	
}
