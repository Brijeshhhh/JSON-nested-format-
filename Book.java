package com.demo.artifact;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private int idbn;
	private String title;
	private List<String> catogery = new ArrayList<>();
	private Author author;
	private Editor editor;
	public int getIdbn() {
		return idbn;
	}
	public void setIdbn(int idbn) {
		this.idbn = idbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getCatogery() {
		return catogery;
	}
	public void setCatogery(List<String> catogery) {
		this.catogery = catogery;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}

}
