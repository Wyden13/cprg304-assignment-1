package utilities;
import java.util.Comparator;

import shapes.*;
public final class BaseAreaComparator implements Comparator<Shape> {
	
	public static BaseAreaComparator bsComparator = new BaseAreaComparator();
	
	@Override
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
