package com.springframework.springPractice04;

import lombok.NoArgsConstructor;
@NoArgsConstructor
public class Patient {
	private int id;
	private String name;
	private Address address;
	

	public static Patient getInstance(int id, String name) {
		System.out.println("Create a Patient using factory method");
		return new Patient(id, name);
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
