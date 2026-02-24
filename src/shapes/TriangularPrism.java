package shapes;

public class TriangularPrism extends Prism
{
	public TriangularPrism(double height, double side) {
		super(height,side);
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.getSide(),2)*Math.sqrt(3)/4;
	}
	

}
