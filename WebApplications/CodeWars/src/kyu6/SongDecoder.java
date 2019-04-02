package kyu6;

import java.util.Arrays;

public class SongDecoder {
	static String[] tempSong;
	static String songString = "";

	public static void main(String[] args) {

//		String song = "WUBIWUBAMWUBROBOT";
//		tempSong = song.split("WUB");
//		for(String i :tempSong) {
//			System.out.println(i);
//			songString=songString.concat(i);
//			
//		}
//		String s = Arrays.toString(tempSong);
//		System.out.println(songString);
//
//		// for (String a : tempSong)
//		// System.out.print(a);

		System.out.println(decoder("WUBWUBABCWUB"));
		System.out.println(decoder("RWUBWUBWUBLWUB"));

	}

	public static String mydecoder(String song) {

		String[] temp = song.split("WUB");
		String songString = "";
		for (String i : temp) {
			songString = songString.concat(" ");
			songString = songString.concat(i);

		}
		return songString;

	}
////////////////////solution

	public static String decoder(String song) {
		return song.replaceAll("(WUB)+", " ").trim();
		/*
		 * song = song.replaceAll("WUB"," "); return song.trim().replaceAll(" +", " ");
		 */

	}

}
