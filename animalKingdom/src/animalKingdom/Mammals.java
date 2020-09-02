package animalKingdom;

public class Mammals extends Animal
{
	public Mammals(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}

	//[Animals{id=6, name='Bigfoot', yearNamed=2021}
	@Override
	public String toString()
	{
		return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
	}
}