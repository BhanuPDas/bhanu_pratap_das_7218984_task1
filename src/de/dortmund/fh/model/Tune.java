package de.dortmund.fh.model;

public class Tune {

	private String name;
	private String author;
	private Note[] note;

	public Tune() {

	}

	public Tune(String name, String author, Note[] note) {
		this.name = name;
		this.author = author;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Note[] getNote() {
		return note;
	}

	public void setNote(Note[] note) {
		this.note = note;
	}

}
