package com.singtel.codingexam.singtelcodingexamrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singtel.codingexam.domain.Animal;
import com.singtel.codingexam.singtelcodingexamrestapi.dao.AnimalDao;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalDao animalDao;

	public List<Animal> getAllAnimals() {
		return animalDao.getAllAnimals();
	}

	public List<String> getAnimalList() {
		return animalDao.getAnimalList();
	}

	public Animal getAnimal(String type) {
		return animalDao.getAnimal(type);
	}
	
	

	

	

}
