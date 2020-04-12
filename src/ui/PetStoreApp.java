package ui;

import java.util.*;

import business.Pet;
import util.Console;

public class PetStoreApp {
	private static java.util.List<Pet> pets = new ArrayList<Pet>();

	public void List() {
		pets = new ArrayList<Pet>();
	}

	public static void main(String[] args) {
		Pet p1 = new Pet(1, "Dog", "Vizsla", "Yogi", 2);
		Pet p2 = new Pet(2, "Dog", "American Bulldog", "Rollie", 3);
		Pet p3 = new Pet(3, "Lizard", "Leopard Gecko", "Louis", 4);

		pets.add(p1);
		pets.add(p2);
		pets.add(p3);
		
		// welcome
		System.out.println("Welcome to the Pet Store App!");
	
		String command = "";
		// - start loop
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			// get user input
			command = Console.getString("Command: ", true);
			System.out.println();
			
			switch (command) {
			case "list":
				listAllPets();
				break;
				
			case "add":
				addPet();
				break;
				
			case "adopt":
				removePet();
				break;
				
			case "exit":
				// exit app
				break;
				
			case "default":
				System.out.println("Invalid entry, please try again.");
				break;
			}
			// - end loop
		}
		// bye 
		System.out.println("Bye!");
	}
		
	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("========================\n");
		System.out.println();
		menu.append("list   - List all pets\n");
		menu.append("add    - Add a pet to your list\n");
		menu.append("adopt  - Adopt a pet\n");
		menu.append("exit   - Exit the store\n");
		System.out.println(menu);
		}	
	
	public static void addPet() {
		// prompt user for pet data
		System.out.println("Add a Pet");
		System.out.println("------------------");
		System.out.println();
		int id = Console.getInt("Pet ID: ", 0, (int) Double.POSITIVE_INFINITY);
		String type = Console.getString("Type? ", true);
		String species = Console.getString("Species? ", true);
		String name = Console.getString("Name? ", true);
		int age = Console.getInt("Age? ", 0, (int) Double.POSITIVE_INFINITY);
		// add movie
		Pet p = new Pet(id, type, species, name, age);
		pets.add(p);
		// display confirmation message
		System.out.println("Your pet, " +name+ " was successfully added!");
	}
	
	public static void listAllPets() {
		System.out.println("Pet Inventory");
		System.out.println("---------------");
		System.out.println();
		// get list of all pets

		// display to screen
		for (Pet p : pets) {
			System.out.println(p);
		}
	}
	
	public static void removePet() {
		System.out.println("Pet Adoption");
		System.out.println("---------------___");
		int id = Console.getInt("Enter the ID you wish to adopt:  ");
		Pet petToRemove = null;
		for (Pet p: pets) {
			if (p.getId()== id) {
				petToRemove =p;
				break;
			}
		}
		System.out.println();
		if (petToRemove != null) {
			pets.remove(petToRemove);
			System.out.println(petToRemove.getName() + " has been Adopted!.\n");
		
		} else {
			System.out.println("No pet matches that ID.\n");
		}
		

	}
}