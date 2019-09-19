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
public class BroodUitwerking extends EtenswaarUitwerking {

    public BroodUitwerking(String naam, Integer calorieen, Calendar houdbaarheidsDatum) {
        super(naam, calorieen, houdbaarheidsDatum);
        
        beschrijving = new StringBuilder(naam);
        beschrijving = beschrijving.append(" houdbaar tot ");
        beschrijving = beschrijving.append(houdbaarheidsDatum.getTime());
        beschrijving = beschrijving.append(" bevat ");
        beschrijving = beschrijving.append(calorieen);
        beschrijving = beschrijving.append(" calorieen\n");
    }

    @Override
    public int geefTotaleCalorieen() {
        return calorieen;
    }
}
