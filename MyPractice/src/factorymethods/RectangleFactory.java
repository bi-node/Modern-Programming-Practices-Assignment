package factorymethods;

public class RectangleFactory implements ShapeFactory{

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}
