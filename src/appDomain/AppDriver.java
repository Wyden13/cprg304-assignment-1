package appDomain;

import java.io.FileNotFoundException;
import shapes.*;
import sortingAlgorithms.SortSwitch;

/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304 W2026
 * class at SAIT. The implementors of this applications will be required to add
 * all the correct functionality.
 * </p>
 */
public class AppDriver {
	/**
	 * The main method is the entry point of the application.
	 * 
	 * @param args The input to control the execution of the application.
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String fileName = null;
		Character compareType = null;
		Character sortType = null;

		for (String arg : args) {
			arg = arg.trim();
			arg = arg.replace('–', '-').replace('—', '-');
			String lowerArg = arg.toLowerCase();

			if (lowerArg.startsWith("-f")) {
				String value = arg.substring(2).trim();

				value = stripOuterQuotes(value);

				value = value.replace("\"", "");
				value = value.replace("\\","/");

				if (value.isEmpty())
					exitWithError("Missing filename after -f");
				fileName = value;
				System.out.println("File: " + fileName);

			} else if (lowerArg.startsWith("-t")) {
				if (arg.length() < 3)
					exitWithError("Missing compare type after -t (example: -tH)");
				compareType = Character.toLowerCase(arg.charAt(2));
				System.out.println("Compare by: " + compareType);
			} else if (lowerArg.startsWith("-s")) {
				if (arg.length() < 3)					
					exitWithError("Missing sort type after -s (example: -sQ)");
				sortType = Character.toLowerCase(arg.charAt(2));
				;
				System.out.println("Sort type: " + sortType);

			}
			;
		}
		
		// Validation
		if (fileName == null)
			exitWithError("Missing required option: -f <filename>");
		if (compareType == null)
			exitWithError("Missing required option: -t <compareType>");
		if (sortType == null)
			exitWithError("Missing required option: -s <sortType>");

		// Load shapes from file
		Shape[] shapes = FileHandler.readShapesFromFile(fileName);
		Shape[] sortedShapes = shapes.clone();

		// Calculate duration of the sort algorithm
		long startTime = System.nanoTime();
		SortSwitch.someSort(sortedShapes, compareType, sortType);
		long endTime = System.nanoTime();

		// check if the array is sorted
		System.out.printf("is the array sorted? : %b%n", SortSwitch.isSorted(sortedShapes, compareType));

		// Display sorted array based on comparator
		switch (compareType) {
		case 'h':
			for (int i = 0; i < sortedShapes.length; i++) {
				System.out.printf("%d -th element: %4s %32s %4s Height: %.3f %n", i + 1, " ",
						sortedShapes[i].getClass(), " ", sortedShapes[i].getHeight());
			}
			break;
		case 'v':
			for (int i = 0; i < sortedShapes.length; i++) {
				System.out.printf("%d -th element: %4s %32s %4s Volume: %.3f%n", i + 1, " ", sortedShapes[i].getClass(),
						" ", sortedShapes[i].calcVolume());
			}
			;
			break;
		case 'a':
			for (int i = 0; i < sortedShapes.length; i++) {
				System.out.printf("%d -th element: %4s %32s %4s Area: %.3f%n", i + 1, " ", sortedShapes[i].getClass(),
						" ", sortedShapes[i].calcBaseArea());
			}
			;
			break;
		default:
			System.exit(1);
		}

		// Print out the sort duration
		double durationSort = (endTime - startTime) / 1_000_000.0;

		System.out.println("\nSorting Duration: " + durationSort + " ms");
	}

	public static void exitWithError(String message) {
		System.out.print(message);
		System.exit(1);
	}

	public static String compareTypeName(char compareType) {
		switch (compareType) {
		case 'h':
			return "Height";
		case 'v':
			return "Volume";
		case 'a':
			return "Base Area";
		default:
			return "Unknown Compare";
		}
	}

	public static String sortTypeName(char sortType) {
		switch (sortType) {
		case 'b':
			return "Bubble Sort";
		case 'i':
			return "Insertion Sort";
		case 's':
			return "Selection Sort";
		case 'h':
			return "Heap Sort";
		case 'm':
			return "Merge Sort";
		case 'q':
			return "Quick Sort";
		default:
			return "Unknown Sort";
		}
	}

	private static String stripOuterQuotes(String s) {
		if (s == null)
			return null;
		s = s.trim();
		if (s.length() >= 2) {
			char first = s.charAt(0);
			char last = s.charAt(s.length() - 1);
			if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
				return s.substring(1, s.length() - 1);
			}
		}
		return s;
	}

}
