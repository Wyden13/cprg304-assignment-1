package shapes;

public class Cylinder extends Shape
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

	public Cylinder(double height,double radius ) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.getHeight();
		
	}
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getRadius(),2);
	}
}
