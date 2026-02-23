package shapes;

public class TriangularPrism extends Prism
{
	public TriangularPrism() {
		super();
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.height;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.side,2)*Math.sqrt(3)/4;
	}
	

}
