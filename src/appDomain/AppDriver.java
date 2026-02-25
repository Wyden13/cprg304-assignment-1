package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;
import sortingAlgorithms.SortSwitch;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;


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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = null;
		Character compareType = null;
		Character sortType = null;

		for (String arg : args) {
			arg = arg.trim();

			// Remove surrounding quotes if exist
//			if (arg.contains("\"")) {
//				arg = arg.replace("\"", "");
//			}
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
		System.out.println("Compare by: " + compareType);
		System.out.println("Sort type: " + sortType);

		
		Shape[] shapes = FileHandler.readShapesFromFile(fileName);
		
		SortSwitch.someSort(shapes, compareType, sortType);
		
		System.out.println(SortSwitch.isSorted(shapes, compareType));
		for (Shape s : shapes) {
		    System.out.println(s);
		}
	}
	public static void exitWithError(String message) {
		System.out.print(message);
		System.exit(1);
	}
}
