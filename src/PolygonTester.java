public class PolygonTester {
    public static void main(String[] args) {

        System.out.println("This is the output of a default polygon \n");
        Polygon defaultPolygon = new Polygon();
        System.out.println(defaultPolygon);

        System.out.println("\nThis is a polygon output with 8 sides, side length 9.832, and name octagon.\n");
        Polygon polygon1 = new Polygon(8, 9.832, "octagon");
        System.out.println(polygon1);

        System.out.println("\nThis is a polygon with 4 sides, side length 5.3, and name square\n");
        Polygon square = new Polygon(4, 5.3, "square");
        System.out.println(square);

        System.out.println("\nThis is an invalid polygon\n");
        Polygon invalidPoly = new Polygon(2, 1.0, "angle");
        System.out.println(invalidPoly);

        System.out.println("\nThis is an invalid polygon mutated to become valid\n");
        Polygon polygonChanged = new Polygon(1, 3.893, "line");
        polygonChanged.setNumSides(5);
        polygonChanged.setName("pentagon");
        System.out.println(polygonChanged);

        System.out.println("\nThis is a basic test of the getter methods.\n");
        Polygon newPoly = new Polygon(6, 3.567, "Hexagon");
        System.out.println(newPoly.getShapeType());
        System.out.println(newPoly.getNumSides());
        System.out.println(newPoly.getSideLength());
            }
        }

