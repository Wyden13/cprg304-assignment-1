package appDomain;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;
import java.util.Comparator;
/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304 
 * W2026 class at SAIT. The implementors of this applications will be required
 * to add all the correct functionality.
 * </p>
 */
public class AppDriver
{
	/**
	 *  The main method is the entry point of the application.
	 *  
	 *  @param args The input to control the execution of the application.
	 */
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo00 BasicFileIO.java for a simple example on how to
		// read data from a text file
		File inputFile = new File("res/shapes1.txt");
		Scanner input = null;
		try {
			input = new Scanner(inputFile);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 if (input.hasNextLine()) {
             input.nextLine();
         }

		while(input.hasNext()) {
			String type = input.next();
			Double token_1 = Double.parseDouble(input.next());
			Double token_2 = Double.parseDouble(input.next());
			Shape a = createShape(type,token_1,token_2);
			System.out.println(a);
			
		}
		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations
		
		

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

	}
	
	public static Shape createShape(String type, double a,double b ) {
	    switch (type.toLowerCase()) {

        case "cone":
            return new Cone(a,b);

        case "cylinder":
            return new Cylinder(a,b);

        case "octagonalprism":
            return new OctagonalPrism(a,b);

        case "pentagonalprism":
            return new PentagonalPrism(a,b);

        case "pyramid":
            return new Pyramid(a,b);

        case "squareprism":
            return new SquarePrism(a,b);

        case "triangularprism":
            return new TriangularPrism(a,b);
        default:
            throw new IllegalArgumentException("Invalid shape type: " + type);
	    }
	}
	
	@SuppressWarnings("unchecked")
	public static<T> boolean isSorted(Comparable<T>[] array,Comparator<? super T> comp) {
		for(int i = 0;i<array.length-1;i++) {
			if(comp == null) {
				if(((Comparable<T>)array[i]).compareTo((T)array[i+1])>0) {
					return false;
				}
			}else {
				if(comp.compare((T) array[i],(T) array[i+1])>0) {
					return false;
				}
			}
		}
		return true;
	}

}
