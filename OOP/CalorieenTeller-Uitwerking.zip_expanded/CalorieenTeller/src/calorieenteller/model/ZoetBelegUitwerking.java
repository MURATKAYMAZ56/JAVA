/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calorieenteller.model;

import java.util.Calendar;

/**
 *
 * @author martijnthorig
 */
public class ZoetBelegUitwerking extends EtenswaarUitwerking {

    protected EtenswaarUitwerking extraEtenswaar;

    public ZoetBelegUitwerking(String naam, Integer calorieen, Calendar houdbaarheidsDatum,
            EtenswaarUitwerking extraEtenswaar) {
        this(naam, calorieen, houdbaarheidsDatum);
        this.extraEtenswaar = extraEtenswaar;
    }

    public ZoetBelegUitwerking(String naam, Integer calorieen, Calendar houdbaarheidsDatum) {
        super(naam, calorieen, houdbaarheidsDatum);

        beschrijving = new StringBuilder("Zoet beleg ");
        beschrijving = beschrijving.append(naam);
        beschrijving = beschrijving.append(" houdbaar tot ");
        beschrijving = beschrijving.append(houdbaarheidsDatum.getTime());
        beschrijving = beschrijving.append(" bevat ");
        beschrijving = beschrijving.append(calorieen);
        beschrijving = beschrijving.append(" calorieen\n");
    }

    @Override
    public String getBeschrijving() {
        String returnValue = beschrijving.toString();
        if (extraEtenswaar != null) {
            returnValue = extraEtenswaar.getBeschrijving() + returnValue;
        }
        return returnValue;
    }

    @Override
    public int geefTotaleCalorieen() {
        if (extraEtenswaar != null) {
            return extraEtenswaar.geefTotaleCalorieen() + calorieen;
        } else {
            return calorieen;
        }

    }

    public void setExtraEtenswaar(EtenswaarUitwerking extraEtenswaar) {
        this.extraEtenswaar = extraEtenswaar;
    }
}
