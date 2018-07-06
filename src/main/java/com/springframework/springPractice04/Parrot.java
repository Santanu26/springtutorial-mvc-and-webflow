package com.springframework.springPractice04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import lombok.ToString;

@ToString
//@Component
public class Parrot {
	private String id;

	private String speech;

	public Parrot() {
	}

	public Parrot(String id, String speak) {
		this.id = id;
		this.speech = speak;
	}

	public String getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("${jdbc.user}")String id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}
	@Autowired
	public void setSpeech(@Value("${jdbc.password}")String speech) {
		this.speech = speech;
	}

}
