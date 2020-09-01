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
		System.out.println("Christian's Animal Kingdom!!!");

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

    	System.out.println("\n*** MVP ***\n");
    	
    	// animal arrayList
    	List<Animal> animalList = new ArrayList<>();
    	animalList.add(panda);
    	animalList.add(zebra);
    	animalList.add(koala);
    	animalList.add(sloth);
    	animalList.add(armadillo);
    	animalList.add(raccoon);
    	animalList.add(bigfoot);
    	animalList.add(pigeon);
    	animalList.add(peacock);
    	animalList.add(toucan);
    	animalList.add(parrot);
    	animalList.add(swan);
    	animalList.add(salmon);
    	animalList.add(catfish);
    	animalList.add(perch);

    	// List all the animals in descending order by year named
    	System.out.println("\n*** List all the animals in descending order by year named ***");
    	animalList.sort((a1,a2) -> a2.getYear() - (a1.getYear()));
    	animalList.forEach((a) -> System.out.println(a));

    	// List all the animals alphabetically
    	System.out.println("\n*** List all the animals alphabetically ***");
    	animalList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    	animalList.forEach((a) -> System.out.println(a));

    	// List all the animals order by how they move
    	System.out.println("\n*** List all the animals order by how they move ***");
    	animalList.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
    	animalList.forEach((a) -> System.out.println(a));

    	// List only those animals the breath with lungs
    	System.out.println("\n*** List only those animals the breath with lungs ***");
    	List<Animal> animalLungsList = filterAnimals(animalList, a -> a.breath().equals("Lungs"));
    	animalLungsList.forEach((a) -> System.out.println(a));

    	// List only those animals that breath with lungs and were named in 1758
    	System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
    	List<Animal> animalLungs1758List = filterAnimals(animalList, a -> (a.breath().equals("Lungs")) && (a.getYear() == 1758));
    	animalLungs1758List.forEach((a) -> System.out.println(a));

    	// List only those animals that lay eggs and breath with lungs
    	System.out.println("\n*** List only those animals the breath with lungs ***");
    	List<Animal> animalEggLungsList = filterAnimals(animalList, a -> (a.breath().equals("Lungs")) && (a.reproduce().equals("eggs")));
    	animalEggLungsList.forEach((a) -> System.out.println(a));

    	// List alphabetically only those animals that were named in 1758
    	System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
    	List<Animal> animal1758List = filterAnimals(animalList, a -> (a.getYear() == 1758));
    	animal1758List.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
    	animal1758List.forEach((a) -> System.out.println(a));
    	
	}
}