package appDomain;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    private FileHandler() {}

    public static Shape[] readShapesFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("First value in file must be an integer shape count.");
            }

            int n = scanner.nextInt();
            scanner.nextLine();

            Shape[] shapes = new Shape[n];
            int count = 0;

            while (scanner.hasNextLine() && count < n) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 3) {
                    throw new IllegalArgumentException("Bad line (expected 3 tokens): " + line);
                }

                String type = parts[0];
                double h = Double.parseDouble(parts[1]);
                double r = Double.parseDouble(parts[2]);

                shapes[count] = createShape(type, h, r);
                count++;
            }

            if (count < n) {
                throw new IllegalArgumentException(
                    "File declared " + n + " shapes but only found " + count + " valid lines."
                );
            }

            return shapes;

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found " + fileName, e);
        }
    }

    public static Shape createShape(String type, double a, double b) {
        switch (type.toLowerCase()) {
            case "cone":
                return new Cone(a, b);
            case "cylinder":
                return new Cylinder(a, b);
            case "octagonalprism":
                return new OctagonalPrism(a, b);
            case "pentagonalprism":
                return new PentagonalPrism(a, b);
            case "pyramid":
                return new Pyramid(a, b);
            case "squareprism":
                return new SquarePrism(a, b);
            case "triangularprism":
                return new TriangularPrism(a, b);
            default:
                throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}
