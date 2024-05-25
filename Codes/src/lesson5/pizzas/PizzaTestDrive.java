package lesson5.pizzas;

/**
 * @author rMohanraj
 *
 */
public class PizzaTestDrive {
 	public static void main(String[] args) {
		Pizza cheese = SimplePizzaFactory.createPizza("cheese");
	    cheese.orderPizza();
	    
	    System.out.println(cheese.getClass());
	}
}
