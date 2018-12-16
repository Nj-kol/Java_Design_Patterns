package com.njkol.designpatterrns.behavioural.memento;

/**
 * This is the Originator class
 * 
 * @author Nilanjan Sarkar
 *
 */
public class FileWriterOriginator implements Originator<String> {

	private String fileName;
	private StringBuilder content;

	public FileWriterOriginator(String file) {
		this.fileName = file;
		this.content = new StringBuilder();
	}

	@Override
	public void setState(String str) {
		content.append(str);
	}

	@Override
	public Memento persistState() {
		return new FileWriterMemento(this.fileName, this.content);
	}

	@Override
	public void undoState(Memento memento) {
		FileWriterMemento mem = (FileWriterMemento) memento;
		this.fileName = mem.fileName;
		this.content = mem.content;
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	private class FileWriterMemento implements Memento {

		// Make the state fields immutable
		private final String fileName;
		private final StringBuilder content;

		public FileWriterMemento(String file, StringBuilder content) {
			this.fileName = file;
			// notice the deep copy so that Memento and FileWriterUtil content
			// variables don't refer to same object
			this.content = new StringBuilder(content);
		}

		public Memento getState() {
			return this;
		}
	}
}