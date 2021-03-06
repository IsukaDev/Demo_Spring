package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class BasicController {

	private final ItemsService itemsService;

	public BasicController(ItemsService itemsService) {
		this.itemsService = itemsService;
	}

	@GetMapping(value = "/{id}")
	public Item getOne(@PathVariable("id") Long id) {
		return this.itemsService.getItem(id);
	}

	@GetMapping
	public List<Item> getAll(@RequestParam(name = "name", required = false) String name) {
		if (name == null || name.isEmpty()){
			return this.itemsService.listAll();
		}
		else {
			return  this.itemsService.listByName(name);
		}
	}

	@PostMapping
	public  List<Item> persistItems(@RequestBody List<String> names){
		return this.itemsService.saveItemsNames(names);
	}

}
