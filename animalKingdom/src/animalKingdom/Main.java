package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{

	private static List<Animal> filterAnimals(List<Animal> animals, CheckAnimals tester)
  	{
	    List<Animal> templist = new ArrayList<>();
	    for (Animal a : animals)
	    {
	      	if (tester.test(a))
	      	{
	        templist.add(a);
	      	}
	    }
	    return templist;
  	}

	public static void main(String[] args)
	{
		System.out.println("\nChristian's Animal Kingdom!!!\n");

		//mammals
		Mammals panda = new Mammals("Panda", 1869);
	    Mammals zebra = new Mammals("Zebra", 1778);
	    Mammals koala = new Mammals("Koala", 1816);
	    Mammals sloth = new Mammals("Sloth", 1804);
	    Mammals armadillo = new Mammals("Armadillo", 1758);
	    Mammals raccoon = new Mammals("Raccoon", 1758);
	    Mammals bigfoot = new Mammals("Bigfoot", 2021);

	    //birds
	    Birds pigeon = new Birds("Pigeon", 1837);
	    Birds peacock = new Birds("Peacock", 1821);
	    Birds toucan = new Birds("Toucan", 1758);
	    Birds parrot = new Birds("Parrot", 1824);
	    Birds swan = new Birds("Swan", 1758);

	    //fish
	    Fish salmon = new Fish("Salmon", 1758);
    	Fish catfish = new Fish("Catfish", 1817);
    	Fish perch = new Fish("Perch", 1758);

    	System.out.println("\n*** MVP ***");
    	
    	// animal arrayList
    	List<Animal> animalsList = new ArrayList<>();
    	animalsList.add(panda);
    	animalsList.add(zebra);
    	animalsList.add(koala);
    	animalsList.add(sloth);
    	animalsList.add(armadillo);
    	animalsList.add(raccoon);
    	animalsList.add(bigfoot);
    	animalsList.add(pigeon);
    	animalsList.add(peacock);
    	animalsList.add(toucan);
    	animalsList.add(parrot);
    	animalsList.add(swan);
    	animalsList.add(salmon);
    	animalsList.add(catfish);
    	animalsList.add(perch);


    	// List all the animals in descending order by year named
    	System.out.println("\n*** List all the animals in descending order by year named ***");
    	animalsList.sort((a1,a2) -> a2.getYearDiscovered() - (a1.getYearDiscovered()));
    	System.out.println(animalsList);

    	// List all the animals alphabetically
    	System.out.println("\n*** List all the animals alphabetically ***");
    	animalsList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    	System.out.println(animalsList);

    	// List all the animals order by how they move
    	System.out.println("\n*** List all the animals order by how they move ***");
    	animalsList.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
    	System.out.println(animalsList);

    	// List only those animals the breath with lungs
    	// Parrot eggs fly lungs 1824
    	System.out.println("\n*** List only those animals the breath with lungs ***");
    	List<Animal> animalLungsList = filterAnimals(animalsList, a -> a.breath().equals("lungs"));
    	animalLungsList.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()));

    	// List only those animals that breath with lungs and were named in 1758
    	// Swan eggs fly lungs 1758
    	System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
    	List<Animal> animalLungs1758List = filterAnimals(animalsList, a -> (a.breath().equals("lungs")) && (a.getYearDiscovered() == 1758));
    	animalLungs1758List.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()));

    	// List only those animals that lay eggs and breath with lungs
    	// Parrot eggs fly lungs 1824
    	System.out.println("\n*** List only those animals the breath with lungs ***");
    	List<Animal> animalEggLungsList = filterAnimals(animalsList, a -> (a.breath().equals("lungs")) && (a.reproduce().equals("eggs")));
    	animalEggLungsList.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()));

    	// List alphabetically only those animals that were named in 1758
    	// Armadillo live births walk lungs 1758
    	System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
    	List<Animal> animal1758List = filterAnimals(animalsList, a -> (a.getYearDiscovered() == 1758));
    	animal1758List.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    	animal1758List.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()));

    	// Stretch
    	System.out.println("\n*** Stretch Goal ***\n");

    	// For the list of animals, list alphabetically those animals that are mammals.
        // Armadillo live births walk lungs 1758 
    	System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
    	List<Animal> mammalsList = filterAnimals(animalsList, (a) -> (a instanceof Mammals));
    	mammalsList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    	mammalsList.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()));
	}
}