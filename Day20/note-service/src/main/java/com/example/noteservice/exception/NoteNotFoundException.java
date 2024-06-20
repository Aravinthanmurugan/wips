package com.example.noteservice.exception;

public class NoteNotFoundException extends RuntimeException {
	
	public NoteNotFoundException() {
		super("Note data is not found for given note id");
	}

}