package staticfactorymethod;

public class AnimalFactory {
	private AnimalFactory()
	{
		
	}
	public static Animal createAnimal(String type)
	{
		if (type==null) return null;
		else if(type.equalsIgnoreCase("lion")) return new Lion();
		else if(type.equalsIgnoreCase("dog")) return new Dog();
		else return null;
	}

}
