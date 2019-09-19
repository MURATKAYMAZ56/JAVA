package calorieenteller.model;

import java.util.Calendar;

/**
 *
 * @author 
 */
public abstract class EtenswaarUitwerking implements Comparable<EtenswaarUitwerking> {
    
    protected Integer calorieen;
    protected StringBuilder naam;
    protected Calendar houdbaarheidsDatum;
    protected StringBuilder beschrijving;

    public EtenswaarUitwerking(String naam, Integer calorieen, 
            Calendar houdbaarheidsDatum) {
        this.calorieen = calorieen;
        this.naam = new StringBuilder(naam);
        this.houdbaarheidsDatum = houdbaarheidsDatum;
    }
    
    public String getNaam() {
        return naam.toString();
    }

    public Integer getCalorieen() {
        return calorieen;
    }
    
    public String getBeschrijving() {
        return beschrijving.toString();
    }

    public Calendar getHoudbaarheidsDatum() {
        return houdbaarheidsDatum;
    }
        
    public abstract int geefTotaleCalorieen();

    @Override
    public String toString() {
        return getBeschrijving();
    }
    
    @Override
    public int compareTo(EtenswaarUitwerking o) {
        int returnValue = calorieen.compareTo(o.getCalorieen());
        return (returnValue != 0) ? returnValue : naam.toString().
                compareTo(o.getNaam());
    }
}
