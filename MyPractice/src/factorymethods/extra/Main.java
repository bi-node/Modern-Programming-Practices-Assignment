package factorymethods.extra;

import factorymethods.*;


public class Main {
	public static void main(String[] args) {
		ShapeFactory circlefactory=new CircleFactory();
		Shape circle=circlefactory.getShape();
		circle.draw();
		
		ShapeFactory rectangleFactory=new RectangleFactory();
		Shape rectangle=rectangleFactory.getShape();
		rectangle.draw();
		
	}

}
