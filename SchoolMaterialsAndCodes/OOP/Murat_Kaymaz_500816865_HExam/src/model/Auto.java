package model;

import java.util.Collection;

/**
 *
 * @author Karel Pieterson
 */
public class Auto implements Comparable<Auto> {
	private String merk;
	private  String kenteken ;
	private int bouwjaar;
	private int gewicht;
	private Eigenaar eigenaar;

	
	
    public Auto(String merk, String kenteken, int bouwjaar, int gewicht, Eigenaar eigenaar) {
		super();
		this.merk = merk;
		this.kenteken = kenteken;
		this.bouwjaar = bouwjaar;
		this.gewicht = gewicht;
		this.eigenaar = eigenaar;
	}
    

    
	public Eigenaar getEigenaar() {
		return eigenaar;
	}



	public int getBouwjaar() {
		return bouwjaar;
	}
	


	public int getGewicht() {
		return gewicht;
	}


	public boolean isSchoon() {
        return false;
    }
    
    @Override
    public String toString() {
    	
    	StringBuilder sb= new StringBuilder();
    	//sb=sb.append("-----stap1----\n");
    	sb=sb.append("Merk : "+merk+"\n");
    	sb=sb.append("Kenteken : "+kenteken+"\n");
    	sb=sb.append("Bouwjaar : "+bouwjaar+"\n");
    	sb=sb.append("Gewicht : "+gewicht+"\n");
    	sb=sb.append("Eigenaar : "+eigenaar+"\n");
    	
    	
        return sb.toString();
    }



	@Override
	public int compareTo(Auto other) {
		// TODO Auto-generated method stub
		int result = eigenaar.getNaam().compareTo(other.eigenaar.getNaam());
		if(eigenaar.getNaam()==null) {
			/// here I want to make decision over what if eigenaar name is null and then 
			// we need to rewrite result again with different idea
			//but I could not find:(
			result=eigenaar.getNaam().compareTo(other.eigenaar.getNaam());
		}
		
		 
		return result;
	}
}
