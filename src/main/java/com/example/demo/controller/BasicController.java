package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class BasicController {

	private final ItemsService itemsService;

	public BasicController(ItemsService itemsService) {
		this.itemsService = itemsService;
	}

	@GetMapping
	public List<Item> getAll() {
		return this.itemsService.listAll();
	}

}
