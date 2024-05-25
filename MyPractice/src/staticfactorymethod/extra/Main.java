package staticfactorymethod.extra;

import staticfactorymethod.*;

public class Main {
	public static void main(String[] args) {
		Animal dog = AnimalFactory.createAnimal("dog");
		dog.soundname();

	}

}
