package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsService {

	public List<Item> listAll() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("book"));
		items.add(new Item("library"));
		return items;
	}

}