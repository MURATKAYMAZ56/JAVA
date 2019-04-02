package nl.hva.ict.postkantoor.models;

public abstract class Post implements Comparable<Post> {
	private NAW naw;
	private int gewicht;
	private boolean aangetekend;

	public Post(NAW naw, int gewicht, boolean aangetekend) {
		super();
		this.naw = naw;
		this.gewicht = gewicht;
		this.aangetekend = aangetekend;
	}
	

	public int getGewicht() {
		return gewicht;
	}

	public NAW getNaw() {
		return naw;
	}
	public boolean isAangetekend() {
		return aangetekend;
	}


	public abstract double berekenPrijs();

	public int compareTo(Post other) {
		int result =naw.getPostcode().compareTo(other.naw.getPostcode());
		if (result==0) {
			result=naw.getHuisnummer()-other.naw.getHuisnummer();
		}
		return result;
	}

	@Override
	public String toString() {
		
		String  st = "";
		if(aangetekend) {
			st="The text 'AANGETEKEND'" ;
		}
		StringBuilder sb=new StringBuilder();
		if(isAangetekend()) {
			sb.append("AANGETEKEND\n");
			
		}
		sb.append(getNaw());
		sb.append("EUR").append(String.format("%.2f ",berekenPrijs()));
		sb.append("\n");
		
		return sb.toString() ;
	}
	

}
