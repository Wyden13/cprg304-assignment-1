package shapes;

public class Cone extends Shape
{

	private double radius;
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Cone() {	};
	
	public Cone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.height *1/3;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius,2);
	}
	
}
