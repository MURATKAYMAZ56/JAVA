package nl.hva.miw.datastructures.opdracht14;

public class Stopwatch {
	long starttime = 0;
	long stoptime = 0;
	
	/**
	 * Starts the stopwatch
	 */
	public void start() {
		starttime = System.currentTimeMillis();
	}
	
	/**
	 * Stops the stopwatch and returns the time differencr;
	 * @return
	 */
	public long stop() {
		stoptime = System.currentTimeMillis();
		return stoptime - starttime;
	}
	
	public long getTime() {
		return stoptime - starttime;
	}

}
