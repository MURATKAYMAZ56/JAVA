package greetingsgenerator;

import javax.persistence.*;

@Table(name="greeting")  
@Entity 
public class Greeting {

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String text;

	@Column
	private String recipient;
	
	@Column
	private String sender;
	
	public Greeting() {

	}

	public Greeting(String text, String recipient ,String sender) {
		this.text = text;
		this.recipient = recipient;
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", text=" + text + ", recipient=" + recipient + ", sender=" + sender
				+ "]";
	}


}
