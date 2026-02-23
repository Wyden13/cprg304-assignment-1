package shapes;

public class SquarePrism extends Prism
{
	public SquarePrism() {};
	public SquarePrism(double height,double side) {
		this.height = height;
		this.side=  side;
	};

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.side, 2);
	}
	
}
