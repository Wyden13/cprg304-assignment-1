package shapes;

public class OctagonalPrism extends Prism
{

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea() * this.height;
	}

	public OctagonalPrism() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2*(1+Math.sqrt(2))*Math.pow(this.side, 2);
	}
	
}
