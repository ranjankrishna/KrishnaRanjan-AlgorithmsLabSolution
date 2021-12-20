package com.greatlearning.service;

public class NotesCount {
	public void notesCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];

		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				notesCounter[i] = (int) amount / notes[i];
				amount = amount - (notes[i] * notesCounter[i]);
			}
		}
		if (amount > 0) {
			System.out.println("Exact Amout Can't be paid using given denomination");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < notes.length; i++) {
				if (notesCounter[i] != 0) {
					System.out.println(notes[i] + ":" + notesCounter[i]);
				}
			}
		}
	}
}
	