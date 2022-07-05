package com.mavenSpringCore3;

import java.util.List;
import java.util.Map;

public class Animal {
	private Map<String,Integer> animalId;
	
	private List<String> animalname;
	

	public Map<String, Integer> getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Map<String, Integer> animalId) {
		this.animalId = animalId;
	}

	public List<String> getAnimalname() {
		return animalname;
	}

	public void setAnimalname(List<String> animalname) {
		this.animalname = animalname;
	}

	/**
	 * @param animalId
	 * @param animalname
	 */
	public Animal(Map<String, Integer> animalId, List<String> animalname) {
		super();
		this.animalId = animalId;
		this.animalname = animalname;
	}

	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", animalname=" + animalname + "]";
	}/**
	 * 
	 */
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
