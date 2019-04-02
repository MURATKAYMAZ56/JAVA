package offers;

import javax.persistence.*;

@Entity
@Table(name="koopje")
public class Offer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="titel")
	private String title;
	
	@Column(name="beschrijving")
	private String description;
	
	@Column(name="prijs")
	private double price; // liever een long trouwens, of een BigDecimal
	
//	@Transient
//	private User user; // bidirectioneel

	public Offer() {}
	
	public Offer(String title, String description, double price) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
	}

	
}
