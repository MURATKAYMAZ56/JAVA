package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Schud waardes van een array door elkaar.
 * 
 * @author Nico Tromp
 *
 */
public class Shuffler {

    /**
     * Schud de waardes van een array willekeurig door elkaar.
     * 
     * @param waardes
     *            het array dat geschud moet worden.
     */
    public static <T> void shuffleArray(T[] waardes) {
        List<T> waardesAlsLijst = Arrays.asList(waardes);
        Collections.shuffle(waardesAlsLijst);
        waardesAlsLijst.toArray(waardes);
    }
}
