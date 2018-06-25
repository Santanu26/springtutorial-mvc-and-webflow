package com.springframework.springPractice04;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
public class Patient {
	private int id;
	private String name;
	private int nationalId;
	private Address address;

	public Patient(int id , String name) {
		this.id = id;
		this.name = name;
	}
	public void speak() {
		System.out.println("Help me...");
	}

}
