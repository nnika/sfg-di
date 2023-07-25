package com.springframework.pets;

/**
 * @Author nicknikandish on 7/23/23
 */
public class PetServiceFactory {

	public PetService getPetService(String petType) {
		switch (petType) {
			case "dog":
				return new DogPetService();
			case "cat":
				return new CatPetService();
			default:
				return new DogPetService();
		}
	}
}
