package com.singtel.codingexam.singtelcodingexamrestapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.codingexam.domain.Animal;
import com.singtel.codingexam.singtelcodingexamrestapi.ResponseMessage;
import com.singtel.codingexam.singtelcodingexamrestapi.service.AnimalService;

@RestController
@RequestMapping("/api")
public class AnimalController {

	public static final Logger LOGGER = LoggerFactory
			.getLogger(AnimalController.class);

	@Autowired
	AnimalService animalService;

	
	@RequestMapping(value = "/animals/", method = RequestMethod.GET)
	public ResponseEntity<List<Animal>> getAllAnimals() {
		LOGGER.info("Request type: GET");
		List<Animal> animals = animalService.getAllAnimals();

		if (animals.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Animal>>(animals, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/listanimals/", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getAnimalList() {
		LOGGER.info("Request type: GET");
		List<String> listOfAnimals = animalService.getAnimalList();

		if (listOfAnimals.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(listOfAnimals, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/animal/{type}", method = RequestMethod.GET)
	public ResponseEntity<?> getAnimal(@PathVariable("type") String type) {
		LOGGER.info("Request type: GET for type {}", type);
		Animal animal = animalService.getAnimal(type);

		if (animal == null) {
			return new ResponseEntity(new ResponseMessage("Animal not fourd"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Animal>(animal, HttpStatus.OK);
	}

}
