package shapes;

public abstract class Shape implements Comparable<Shape> {
	protected double height;
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double calcVolume(); 
	
	public abstract double calcBaseArea();
	
	@Override
	public int compareTo(Shape that) {
		return this.getHeight() > that.getHeight() ? 1: -1;
	}

}
