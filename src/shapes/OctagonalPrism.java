package shapes;

public class OctagonalPrism extends Prism
{
	public OctagonalPrism(double height, double side) {
		super(height,side);
	}
	
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.getHeight();
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2*(1+Math.sqrt(2))*Math.pow(this.getSide(), 2);
	}
	
}
