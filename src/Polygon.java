import java.text.DecimalFormat;
import java.lang.Math;

/**
 * @author Suhaani Garg
 * @file Polygon
 * @date 2/12/23
 *
 * Creates a polygon with equal side lengths.
 * The user can also determine the perimeter of the polygon and
 * print certain information about the polygon.
 */

    public class Polygon {
      private int numSides;
      private double sideLength;
      private String typeShape;
      private double perimeter;
      private double area;

        // default constructor

        /**
         * Makes a default polygon, specifically a triangle with 3 sides and side lengths of 1.0.
         *
         */

        public Polygon() {
          numSides = 3;
          sideLength = 1.0;
          typeShape = "triangle";
        }

        // overloaded constructor

        /**
         * Makes a Polygon object with a specified sides of equal length and number of sides.
         * If the sides are not greater than 2 or the length is not greater than 0, the polygon is invalid.
         * If the polygon is invalid, the parameters are set to a default triangle with side length 1.0.
         *
         * @param sides number of sides in the polygon
         * @param length side length of the polygon
         * @param shape name of the shape of polygon
         */

        public Polygon(int sides, double length, String shape)
        {
          numSides = 3;
          sideLength = 1.0;
          typeShape = "Triangle";
          if (sides <= 2 || length < 0.0) {
            System.out.print("Not a valid polygon.");
            System.out.println(" Your input was set to a default triangle with a side length of 1.0 unit");
          }
          else {
            numSides = sides;
            sideLength = length;
            typeShape = shape;
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

        /**
         *
         * @return the perimeter of the polygon
         */

        public double getPerimeter() {
          return perimeter;
        }

        /**
         *
         * @return the area of the polygon
         */

        public double getArea() {
          getSideLength();
          getNumSides();
          calculateArea();
          return area;
        }

        // mutators

        /**
         *Lets the user change the side length of the polygon if new side length is greater than 0
         *
         * @param length
         */

        public void setSideLength(double length) {
          if(length > 0) {
            this.sideLength = length;
          }
        }


        /**
         * Lets the user change the number of sides the polygon has if new number of sides is greater than 2.
         *
         * @param sides
         */

        public void setNumSides(int sides) {
           if(sides > 2) {
             this.numSides = sides;
           }
        }

        /**
         * Lets the user change the polygon name based on a change in its shape
         *
         * @param shape
         */

        public void setShapeName(String shape)
        {
          this.typeShape = shape;
        }

        /**
         *
         * @return the calculated perimeter of the polygon
         */

        public double calculatePerimeter()
        {
          perimeter = Math.round((numSides * sideLength) * Math.pow(10, 3))/(Math.pow(10,3));
          return perimeter;
        }

        /**
         *
         * @return the calculated area of a polygon
         */
        public double calculateArea()
        {
          calculatePerimeter();
          getPerimeter();
          double rad = Math.toRadians(180/numSides);
          double apothem = sideLength /(2 * (Math.tan(rad)));
          double round = Math.pow(10,3);
          area = Math.round((.5 * apothem * perimeter) * round)/round;
          return area;
        }

        /**
         *
         * @description Prints the shape, number of sides, length of each side,
         * and both the area and perimeter to three decimal places
         */

          public String toString() {
          String retMessage = "";
          if (numSides > 2 && sideLength > 0.0) {
            DecimalFormat threeDec = new DecimalFormat("#.###");
            retMessage = "Your shape is a " + typeShape + " which has " + numSides + " sides." + "\n" +
            "The length of each side is " + threeDec.format(sideLength) + "." + "\n" + "The total" +
            " perimeter of your" + typeShape + " is " + threeDec.format(calculatePerimeter())
            + " units. \n" + "The total area of " + " your " + typeShape + " is "
            + threeDec.format(calculateArea()) + " units squared.";
          }
          return retMessage;
        }

    }
