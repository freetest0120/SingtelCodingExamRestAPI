package com.singtel.codingexam.singtelcodingexamrestapi.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.singtel.codingexam.action.SoundAction;
import com.singtel.codingexam.domain.Animal;
import com.singtel.codingexam.domain.AnimalBuilder;
import com.singtel.codingexam.domain.Bird;
import com.singtel.codingexam.domain.Butterfly;
import com.singtel.codingexam.domain.Caterpillar;
import com.singtel.codingexam.domain.Chicken;
import com.singtel.codingexam.domain.ClownFish;
import com.singtel.codingexam.domain.Dolphin;
import com.singtel.codingexam.domain.Duck;
import com.singtel.codingexam.domain.Fish;
import com.singtel.codingexam.domain.Parrot;
import com.singtel.codingexam.domain.Rooster;
import com.singtel.codingexam.domain.Shark;

@Repository
public class AnimalDao {

	private ArrayList<Animal> animalList;

	public AnimalDao() {

		AnimalBuilder animalBuilder = new AnimalBuilder();
		Animal chickenRooster = animalBuilder.buildRooster(new Rooster(
				new SoundAction("Cock-a-doodle-doo")));

		animalList = new ArrayList<Animal>();
		animalList.add(new Bird());
		animalList.add(new Duck());
		animalList.add(new Chicken());
		animalList.add(chickenRooster);
		animalList.add(new Parrot(new SoundAction("Woof, woof")));
		animalList.add(new Fish());
		animalList.add(new ClownFish());
		animalList.add(new Shark());
		animalList.add(new Dolphin());
		animalList.add(new Caterpillar());
		animalList.add(new Butterfly());
	}

	public ArrayList<Animal> getAllAnimals() {
		return animalList;
	}

	public ArrayList<String> getAnimalList() {
		ArrayList<String> animals = new ArrayList<String>();
		for (Animal animal : animalList) {
			animals.add(animal.getType());
		}
		return animals;
	}

	public Animal getAnimal(String type) {
		for (Animal animal : animalList) {
			if (type.equalsIgnoreCase(animal.getType()))
				return animal;
		}
		return null;
	}

}