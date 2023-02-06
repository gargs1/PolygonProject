public class PolygonTester {
    public static void main(String[] args) {

        System.out.println("This is the output of a default polygon");
        Polygon defaultPolygon = new Polygon();
        System.out.println(defaultPolygon);

        System.out.println("This is a polygon output with 8 sides, side length 9.832, and name octagon.");
        Polygon polygon1 = new Polygon(8, 9.832, "octagon");
        System.out.println(polygon1);

        System.out.println("This is an invalid polygon");
        Polygon invalidPoly = new Polygon(2, 1.0, "angle");
        System.out.println(invalidPoly);

        System.out.println("This is an invalid polygon mutated to become valid");
        Polygon polygonChanged = new Polygon(1, 3.893, "line");
        polygonChanged.setNumSides(5);
        polygonChanged.setName("pentagon");
            }
        }

