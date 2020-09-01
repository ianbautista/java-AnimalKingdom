package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
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
    	System.out.println("\n*** List all the animals in descending order by year named ***\n");
    	animalList.sort((v1,v2) -> v2.getYear() - (v1.getYear()));
    	animalList.forEach((v) -> System.out.println(v));

    	// List all the animals alphabetically
    	System.out.println("\n*** List all the animals alphabetically ***\n");
    	animalList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    	animalList.forEach((v) -> System.out.println(v));
	}
}