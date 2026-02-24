package shapes;

public abstract class Prism extends Shape{
	private double side;

	public Prism(double height, double side) {
		// TODO Auto-generated constructor stub
		super(height);
		this.side = side;
	}

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
}
