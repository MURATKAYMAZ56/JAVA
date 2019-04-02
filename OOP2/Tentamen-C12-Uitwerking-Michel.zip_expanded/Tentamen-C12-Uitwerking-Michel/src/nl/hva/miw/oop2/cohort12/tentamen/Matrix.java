package nl.hva.miw.oop2.cohort12.tentamen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

/**
 * Een matrix heeft rijen en kolommen. Deze matrix wordt geimplmenteerd als een lijst van lijsten.
 * Elke rij is een lijst. De matrix is dan een lijst van deze rijen (dus een lijst van lijsten).
 * 
 * Elk veld in de matrix kan aangeduid worden met een rij, kolom combinatie. Bijvoorbeeld:
 * element (0,0) bevindt zich het in eerste element van de eerste lijst van de matrix.
 * 
 * @author michel
 */

/** Generics: Matrices waar elementen van type T in gaan. Wel met een
 * restrictie! Deze elementen T moeten vergelijkbaar zijn met zichzelf, dus
 * extends Comparable<T>.
 */
public class Matrix<T extends Comparable<T>> implements Comparable<Matrix<T>> {
	
	private List<List< T >> matrix;
	private int size;
	
	
	/**
	 * Maak een matrix van size X size aan. Elementen worden op null geinitialiseerd.
	 * 
	 * @param size
	 */
	public Matrix(int size) {
		super();
		initializeMatrix(size);
	}


	/* 
	 * Creeert de matrix op de juiste grootte en initialiseert ze met null waarden.
	 * Kan ook gebruikt worden om de grootte van een bestaande matrix te veranderen.
	 * Nuttig voor bij het inlezen van een matrix van een file.
	 */
	private void initializeMatrix(int size) {
		this.size = size;
		
		// Maak de rijen aan (elke rij is een list)
		matrix = new ArrayList<>(size);
		
		for (int i=0; i<size; i++ ) {
			
			// Maak een rij aan (een lijst met nulls)
			List<T> rij = new ArrayList<>(size);

			for ( int j=0;j<size; j++ ) {
				rij.add(null);
			}
			
			// Voeg de rij aan de matrix toe.
			matrix.add(rij);
		}
	}
	
	
	public T getElement( int rij, int kolom ) throws OngeldigeMatrixPositieException {
		// Implementeer deze methode
		if ( rij < 0 || kolom < 0 || rij >= size || kolom >= size ) {
			throw new OngeldigeMatrixPositieException(rij, kolom);
		}
		
		List<T> r = matrix.get( rij );
		return r.get(kolom);
	}
	
	public void addElement( int rij, int kolom, T value ) throws OngeldigeMatrixPositieException {
		// Implementeer deze methode
		if ( rij < 0 || kolom < 0 || rij >= size || kolom >= size ) {
			throw new OngeldigeMatrixPositieException(rij, kolom);
		}

		List<T> r = matrix.get(rij);
		r.set( kolom,  value);
	}


	@Override
	public String toString() {
		String result = "";
		for ( List<T> rij : matrix ) {
			result += rij + "\n";
		}
		return result;
	}
	
	/**
	 * Schrijft de matrix naar een file als binary I/O.
	 * Het formaat is als volgt:
	 *   - Eerst wordt een integer geschreven: de size van de matrix.
	 *   - Daarna volgen size * size elementen van de matrix, elk los geschreven.
	 *   - De elementen kopen "per rij", dus eerst alle elementen van rij 0, daarna rij 1, etc.
	 *   
	 * @param filenaam
	 */
	public void saveToFile( String filenaam ) {
		// Implementeer deze methode.
		
		File f = new File(filenaam);
		
		try ( ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream( f ))) {
			
			oos.writeInt( size );
			
			for ( int rij=0; rij < size; rij++ ) {
				for (int kol=0; kol<size; kol++ ) {
					oos.writeObject( matrix.get(rij).get(kol));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Leest de matrix van een file als binary I/O.
	 * Het formaat is als volgt:
	 *   - Eerst wordt een integer gelezen: de size van de matrix.
	 *   - Daarna worden size * size elementen van de matrix gelezen, elk los gelezen.
	 *   - De elementen kopen "per rij", dus eerst alle elementen van rij 0, daarna rij 1, etc.
	 *   
	 *   NB: niet vergeten de matrix opnieuw te initialiseren.
	 *   
	 * @param filenaam
	 */
	public void loadFromFile( String filenaam ) {
		// Implementeer deze methode.
		
		try ( ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream( filenaam ))) {
			
			int size = ois.readInt();
			initializeMatrix(size);
			
			for ( int rij=0; rij < size; rij++ ) {
				for (int kol=0; kol<size; kol++ ) {
					T t = (T)ois.readObject();
					this.addElement(rij, kol, t);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OngeldigeMatrixPositieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public int compareTo(Matrix<T> o) {
		// Eerst op size vergelijken
		if ( this.size < o.size ) {
			return -1;
		} else if ( this.size > o.size ) {
			return 1;
		}
		
		/** Alternatief voor size
		if (this.size != o.size ) {
			return this.size - o.size;
		}
		*/
		
		for ( int rij=0; rij < size; rij++ ) {
			for (int kol=0; kol < size; kol++ ) {
				int result;
				try {
					result = this.getElement(rij, kol).compareTo( o.getElement(rij, kol));

					if (result != 0 ) {
						return result;
					}
				} catch (OngeldigeMatrixPositieException e) {
					System.err.println("Error: " + e);
				}
				
			}
		}
		return 0;
	}
}