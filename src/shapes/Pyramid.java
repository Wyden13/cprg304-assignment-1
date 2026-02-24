package shapes;

public class Pyramid extends Shape
{
	private double side;
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	public Pyramid() {};
	public Pyramid(double height,double side) {
		super(height);
		this.setSide(side);
	}
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight() *1/3;
	}
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.side,2);
	}
	
}
