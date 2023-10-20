package de.dortmund.fh.main;

import de.dortmund.fh.model.Note;
import de.dortmund.fh.model.Tune;

public class ShowTune {

	public static void main(String[] args) {

		// Display Notes
		Note note1 = new Note();
		note1.setId("1");
		note1.setNameOfNote("Note1");
		note1.setNameOfOctave("Octave1");
		note1.setPlayingTime(2);
		Note note2 = new Note("2", "Note2", "Octave2", 3);
		Note note3 = new Note("3", "Note3", "Octave3", 4);
		Note note4 = new Note("4", "Note4", "Octave4", 5);
		Note note5 = new Note("5", "Note5", "Octave5", 6);
		Note note6 = new Note("6", "Note6", "Octave6", 7);
		Note note7 = new Note("7", "Note7", "Octave7", 8);
		Note[] noteArray = new Note[7];
		noteArray[0] = note1;
		noteArray[1] = note2;
		noteArray[2] = note3;
		noteArray[3] = note4;
		noteArray[4] = note5;
		noteArray[5] = note6;
		noteArray[6] = note7;
		Tune tune = new Tune("Test1", "Author1", noteArray);

		for (Note n : tune.getNote()) {
			System.out.println("ID:" + n.getId());
			System.out.println("Name of Note:" + n.getNameOfNote());
			System.out.println("Name of Octave:" + n.getNameOfOctave());
			System.out.println("Playing Time:" + n.getPlayingTime());
			System.out.println("\n");
		}

	}

}
