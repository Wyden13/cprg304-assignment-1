package utilities;

import java.util.Comparator;
import shapes.Shape;

public final class VolumeComparator implements Comparator<Shape> {
	
	public static VolumeComparator volComparator = new VolumeComparator();
	
	@Override
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
