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

	public Cylinder(double Height,double Radius ) {
		this.height = Height;
		this.radius = Radius;
	}
	
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return calcBaseArea() * this.height;
		
	}
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius,2);
	}
}
