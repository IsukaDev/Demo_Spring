package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	private String name;

	@Id
	private Long id;

	public Item(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	public Item() {

	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
