package animalKingdom;

public class Birds extends Animal
{
	public Birds(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
	{
		return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
	}
}