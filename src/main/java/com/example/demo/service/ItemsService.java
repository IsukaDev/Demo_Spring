package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsService {

	private final ItemRepository itemRepository;

	public ItemsService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public List<Item> listAll() {
		return this.itemRepository.findAll();
	}

	public Item getItem(Long id) {
		return this.itemRepository.findById(id).orElse(null);
	}

	}

}
