package shapes;

public class PentagonalPrism extends Prism
{
	public PentagonalPrism(double height,double side) {
		// TODO Auto-generated constructor stub
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
		return (5*Math.pow(this.getSide(), 2)* Math.tan(54))/4;
	}
	
	
}
