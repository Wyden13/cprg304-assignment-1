package utilities;
import java.util.Comparator;
import shapes.*;
public class CompareBaseArea implements Comparator<Shape> {
	public int compare(Shape a,Shape b)  {
		if(a.calcBaseArea() > b.calcBaseArea()) {
			return 1;
		}else if(a.calcBaseArea() < b.calcBaseArea()) {
			return -1;
		}else {
			return 0;
		}
	}
}
