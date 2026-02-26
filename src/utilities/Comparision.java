package utilities;

import java.util.Comparator;

import shapes.*;
public final class Comparision {
	public static Comparator<Shape> getComparator(char t){
		switch(t) {
		case 'h':
			return null;
		case 'v':
			return VolumeComparator.volComparator;
		case 'a':
			return BaseAreaComparator.bsComparator;
		default:
			 throw new IllegalArgumentException("Invalid shape type: " + t);
		}
	}
	public static int compare(Shape a,Shape b,char t) {
		Comparator<Shape> comp = getComparator(t);
		return (comp==null? a.compareTo(b) : comp.compare(a, b));
	}
}
