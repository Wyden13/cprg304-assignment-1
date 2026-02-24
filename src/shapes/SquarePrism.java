package shapes;

public class SquarePrism extends Prism
{
	public SquarePrism(double height,double side) {
//		this.height = height;
//		this.side=  side;
		super(height,side);
	};

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.getHeight();
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.getSide(), 2);
	}
	
}
