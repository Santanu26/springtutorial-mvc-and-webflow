package com.springframework.springPractice04;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Patient {
	private int id;
	private String name;

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void onCreate() {
		System.out.println("Inside onCreate : " + this);
	}

	public void onDestroy() {
		System.out.println("onDestroy method...");
	}

	public void speak() {
		System.out.println("Help me...");
	}

}
