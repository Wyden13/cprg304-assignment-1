package utilities;

import java.util.Comparator;
import shapes.Shape;

public class CompareVolume implements Comparator<Shape> {
	public int compare(Shape a,Shape b) {
		if(a.calcVolume() > b.calcVolume()) {
			return 1;
		}else if(a.calcVolume() < b.calcVolume()) {
			return -1;
		}else {
			return 0;
		}
	}
}
