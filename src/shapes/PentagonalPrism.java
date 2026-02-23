package shapes;

public class PentagonalPrism extends Prism
{
	public PentagonalPrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return (5*Math.pow(this.side, 2)* Math.tan(54))/4;
	}
	
	
}
