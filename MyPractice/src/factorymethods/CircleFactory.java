package factorymethods;

public class CircleFactory implements ShapeFactory {

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return new Circle();
	}

}
