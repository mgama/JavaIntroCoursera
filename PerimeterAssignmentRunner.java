import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int numberOfPoints = 0;
        for (Point currPt : s.getPoints()) {
            numberOfPoints++;
        }
        return numberOfPoints;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double averageLength = 0.0;
        Point prevPt = s.getLastPoint();
        System.out.println("From the getAverageLength function");
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            System.out.println("the currDist is " + currDist);
            // Update averageLength by currDist
            averageLength = averageLength + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        };
        int numberOfPoints = getNumPoints(s);
        averageLength = averageLength / numberOfPoints;
        return averageLength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double largestSide = 0.0;
        Point prevPt = s.getLastPoint();
        int currSide = 0;
        double[] arrayOfSides;
        int numberOfPoints = getNumPoints(s);
        arrayOfSides = new double[numberOfPoints];
        System.out.println("from the getLargestSide function");
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            System.out.println("the currDist is " + currDist);
            arrayOfSides[currSide] = currDist;
            currSide++;
            // Update prevPt to be currPt
            prevPt = currPt;
        };
        System.out.println("The array of sides is");
        double largestNumber = 0.0;
        for(int i = 0; i <= numberOfPoints; i++) {
            System.out.println(arrayOfSides[i]);
            System.out.println("the largest number is " + largestNumber);
            if (i == (numberOfPoints - 1)) {
                System.out.println("Breaking out of the loop");
                break;
            }
            else {
                System.out.println("the current value of array of side is " + arrayOfSides[i]);
                int j = i + 1;
                System.out.println("the next value on the array is " + arrayOfSides[j]);
                if (arrayOfSides[i] >= arrayOfSides[j]){
                    largestNumber = arrayOfSides[i];
                    System.out.println("the current value is greater than the next one ");
                }
                else{
                    System.out.println("the current value was not greater");
                }
            }
        }
        return largestNumber;
    }

    public double getLargestX(Shape s) {
        // Put code here
        int numPoints = getNumPoints(s);
        double[] arrayOfXvalues = new double[numPoints];
        int i =0;
        double largestX = 0.0;
        for (Point currPt : s.getPoints()) {
            double currX = currPt.getX();
            System.out.println("The current x of the point is " + currX);
            arrayOfXvalues[i] = currX;
            i++;
        };
        for(int j = 0; j < numPoints; j++){
            if (j == (numPoints - 1)) {
                System.out.println("Breaking out of the getLargestX loop");
                break;
            }
            else{
                System.out.println("the current value of array of x is " + arrayOfXvalues[j]);
                int k = j + 1;
                System.out.println("the next value on the array is " + arrayOfXvalues[k]);
                if (arrayOfXvalues[j] >= arrayOfXvalues[k]){
                    largestX = arrayOfXvalues[j];
                    System.out.println("the current value of x is greater than the next one ");
                }
                else{
                    System.out.println("the current value of x was not greater");
                }
            };
        };
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        int points = getNumPoints(s);
        double length = getPerimeter(s);
        double averageLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        System.out.println("perimeter = " + length);
        System.out.println("points = " + points);
        System.out.println("averageLength = " + averageLength);
        System.out.println("largestSide = " + largestSide);
        System.out.println("largestX = " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
