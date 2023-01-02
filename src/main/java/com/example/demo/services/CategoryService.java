package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public Category findyById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	
}
