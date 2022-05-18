package com.example.demo.model;

public class Item {

	private String name;
	private Long id;

	public Item(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
