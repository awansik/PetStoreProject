package business;

import util.Console;

public class Pet {
	int id;
	static int idCounter = 1;
	String type;
	String species;
	String name;
	int age;
	
	public Pet(int id, String type, String species, String name, int age) {
		super();
		this.id = id;
		this.type = type;
		this.species = species;
		this.name = name;
		this.age = age;
	}

	public Pet() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", species=" + species + ", name=" + name + ", age=" + age + "]";
	}
	
	
	}


