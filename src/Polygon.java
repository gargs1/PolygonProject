import java.text.DecimalFormat;
import java.lang.Math;

/**
 * @author Suhaani Garg
 * @file Polygon
 * @date 2/6/23
 *
 * Creates a polygon with equal side lengths.
 * The user can also determine the perimeter of the polygon and
 * print certain information about the polygon.
 */

    public class Polygon {
      private int numSides;
      private double sideLength;
      private String typeShape;
      private double Perimeter;
      private double Area;

        // default constructor

        /**
         * Makes a default polygon, specifically a pentagon with 5 sides and side lengths of 8.3.
         *
         */
        public Polygon() {
          numSides = 3;
          sideLength = 1.365;
          typeShape = "triangle";
        }

        // overloaded constructor

        /**
         * Makes a Polygon object with a specified sides of equal length and number of sides.
         * If the sides are not greater than 2 and the length is not greater than 0, the polygon is considered invalid.
         * @param sides number of sides in the polygon
         * @param length side length of the polygon
         * @param shape name of the shape of polygon
         */
        public Polygon(int sides, double length, String shape)
        {
          numSides = sides;
          sideLength = length;
          typeShape = shape;
          if (sides <= 2 && length <= 0.0)
          {
              System.out.println("Not a valid polygon");
          }
        }

        // accessors

        /**
         *
         * @return the number of sides of the polygon
         */
        public int getNumSides() {
          return numSides;
        }
        /**
         *
         * @return the length of each side of the polygon
         */
        public double getSideLength() {
          return sideLength;
        }
        /**
         *
         * @return the type of shape the polygon is
         */
        public String getShapeType() {
          return typeShape;
        }

        // mutators

        /**
         *Lets the user change the side length of the polygon.
         *
         * @param length
         */

        public void setSideLength(double length) {
          this.sideLength = length;
        }

        /**
         * Lets the user change the number of sides the polygon has.
         *
         * @param sides
         */

        public void setNumSides(int sides) {
          this.numSides = sides;
        }

        /**
         * Lets the user change the polygon name based on a change in its shape
         *
         * @param shape
         */
        public void setName(String shape)
        {
          this.typeShape = shape;
        }

        public double calculatePerimeter()
        {
          Perimeter = numSides * sideLength;
          return Perimeter;
        }

        public double calculateArea() {
          double apothem = sideLength/(2 * Math.tan(180/numSides));
          Area = .5 * apothem * Perimeter;
          return Area;
        }

        public String toString() {
          String retMessage = "";
          if (numSides > 2 && sideLength > 0.0) {
            DecimalFormat threeDec = new DecimalFormat("#.###");
            retMessage = "The shape you made is a " + typeShape + " which has " + numSides + " sides." + "\n" +
              "The length of each side is " + threeDec.format(sideLength) + "." + "\n" + "The total perimeter of " +
              " your " + typeShape + " is " + threeDec.format(calculatePerimeter()) + " units. \n" + " The total area of " +
              " your " + typeShape + " is " + threeDec.format(calculateArea()) + " units squared.";
          }
          return retMessage;
        }

    }
