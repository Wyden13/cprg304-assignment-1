package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;
import sortingAlgorithms.SortSwitch;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;


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
			
			String lowerArg = arg.toLowerCase();

			if (lowerArg.startsWith("-f")) {
				fileName = arg.substring(2);
			} else if (lowerArg.startsWith("-t")) {
				compareType = lowerArg.charAt(2);
			} else if (lowerArg.startsWith("-s")) {
				sortType = lowerArg.charAt(2);
			}
		}
		// Validation
		if (fileName == null) exitWithError ("Missing required option: -f <filename>");
		if (compareType == null) exitWithError("Missing required option: -f <filename>");
		if (sortType == null) exitWithError("Missing required option: -f <filename>");
		
		System.out.println("File: " + fileName);
		System.out.println("Compare by: " + compareTypeName(compareType));
		System.out.println("Sort type: " + sortTypeName(sortType) + "\n");
		
		// Read Shapes from file
		Shape[] shapes = FileHandler.readShapesFromFile(fileName);
		
		Shape[] sortedShapes = shapes.clone();
		for(Shape s: shapes) {
			System.out.println(s);
		}
		
		long startTime = System.nanoTime();
		
		SortSwitch.someSort(sortedShapes, compareType, sortType);
		
		System.out.println("\nSorted Shapes (by " + compareTypeName(compareType) + ")\n");
		for (Shape s : sortedShapes) {
		    System.out.println(s);
		}
			
		long endTime = System.nanoTime();
		
		double durationSort = (endTime - startTime)/ 1_000_000.0;
		
		System.out.println("\nSorting Duration: " + durationSort + " ms");
	}
	public static void exitWithError(String message) {
		System.out.print(message);
		System.exit(1);
	}
	
	public static String sortTypeName(char sortType) {
		switch (sortType) {
		case 'b': return "Bubble Sort";
		case 'i': return "Insertion Sort";
		case 's': return "Selection Sort";
		case 'h': return "Heap Sort";
		case 'm': return "Merge Sort";
		case 'q': return "Quick Sort";
		default: return "Unknown Sort";
		}
	}
	
	public static String compareTypeName(char compareType) {
		switch (compareType) {
		case 'h' : return "Height";
		case 'v' : return "Volume";
		case 'b' : return "Base Area";
		default: return "Unknown Compare";
		}
	}
}
