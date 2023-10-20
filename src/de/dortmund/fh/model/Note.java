package de.dortmund.fh.model;

public class Note {

	private String id;
	private String nameOfNote;
	private String nameOfOctave;
	private int playingTime;

	public Note() {

	}

	public Note(String id, String nameOfNote, String nameOfOctave, int playingTime) {
		this.id = id;
		this.nameOfNote = nameOfNote;
		this.nameOfOctave = nameOfOctave;
		this.playingTime = playingTime;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameOfNote() {
		return nameOfNote;
	}

	public void setNameOfNote(String nameOfNote) {
		this.nameOfNote = nameOfNote;
	}

	public String getNameOfOctave() {
		return nameOfOctave;
	}

	public void setNameOfOctave(String nameOfOctave) {
		this.nameOfOctave = nameOfOctave;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

}
