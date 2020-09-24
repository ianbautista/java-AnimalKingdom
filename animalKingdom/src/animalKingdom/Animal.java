package animalKingdom;

abstract class Animal
{
	protected static int maxId = 0;
	protected int id;
	protected int food;
	protected String name;
	protected int yearDiscovered;

	//default constructor
	public Animal(String name, int yearDiscovered)
	{
		id = maxId;
		maxId++;
		this.food = 1;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	// consumes food setter
	void consumeFood(int food)
	{
		this.food =+ food;
	}

	// name getter
	String getName()
	{
		return name;
	}

	// yearDiscovered getter
	int getYearDiscovered()
	{
		return yearDiscovered;
	}
}