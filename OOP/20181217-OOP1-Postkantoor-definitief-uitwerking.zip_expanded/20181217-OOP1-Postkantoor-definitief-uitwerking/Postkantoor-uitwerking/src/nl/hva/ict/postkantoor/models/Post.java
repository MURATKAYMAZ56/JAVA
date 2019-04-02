/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.models;

/**
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public abstract class Post implements Comparable<Post> {

    private int gewicht;
    private boolean aangetekend;
    private NAW naw;

    public Post(int gewicht, boolean aangetekend, NAW naw) {
        this.gewicht = gewicht;
        this.aangetekend = aangetekend;
        this.naw = naw;
    }

    public boolean isAangetekend() {
        return aangetekend;
    }

    public int getGewicht() {
        return gewicht;
    }

    public NAW getNaw() {
        return naw;
    }

    public abstract double berekenPrijs();

    @Override
    public int compareTo(Post other) {
        // sorteer op postcode, laag naar hoog
        int result = naw.getPostcode().compareTo(other.naw.getPostcode());
        
        // bij gelijke postcode, sorteer op huisnummer, laag naar hoog
        if (result == 0) {
            result = naw.getHuisnummer() - other.naw.getHuisnummer();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (isAangetekend()) {
            s.append("AANGETEKEND\n");
        }
        s.append(getNaw());
        s.append("EUR ").append(String.format("%.2f", berekenPrijs()));
        s.append("\n");
        return s.toString();
    }

}
