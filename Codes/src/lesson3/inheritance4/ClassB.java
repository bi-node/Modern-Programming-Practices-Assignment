package lesson3.inheritance4;

public class ClassB {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	// Unknown to subclasses 
	public void newMethod(String suffix) {
		name += suffix;
	}

	public String getName() {
		return name;
	}
	
	 
}
