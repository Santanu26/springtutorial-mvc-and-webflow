package com.springframework.springPractice04;

public class PatientFactory {
	public Patient getInstance(int id, String name) {
		return new Patient(id, name);
	}

}
