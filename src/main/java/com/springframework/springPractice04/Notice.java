package com.springframework.springPractice04;

public class Notice {
	private int id;
	private String name;
	private String text;
	private String email;

	public Notice() {
	}

	public Notice(String name, String text, String email) {
		this.name = name;
		this.text = text;
		this.email = email;
	}

	public Notice(int id, String name, String text, String email) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", name=" + name + ", text=" + text + ", email=" + email + "]";
	}

}
