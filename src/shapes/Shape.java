package shapes;

public abstract class Shape implements Comparable<Shape> {
	private double height;
	
	public Shape() {};
	public Shape(double height) {
		this.height= height;
	}
	
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
		if(this.height > that.height) {
			return 1;
		}
		else if(this.height < that.height) {
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s | h:%.3f | vol: %.3f ", this.getClass(),this.getHeight(),this.calcVolume());
	}	
}
