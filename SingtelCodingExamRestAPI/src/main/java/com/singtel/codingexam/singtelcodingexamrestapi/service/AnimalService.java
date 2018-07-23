package com.singtel.codingexam.singtelcodingexamrestapi.service;

import java.util.List;

import com.singtel.codingexam.domain.Animal;

public interface AnimalService {

	List<Animal> getAllAnimals();

	List<String> getAnimalList();

	Animal getAnimal(String type);

}
