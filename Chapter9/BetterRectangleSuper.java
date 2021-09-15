/*  public class BetterRectangleSuper.java: class that gets Perimeter and Area using super keyword
    Author NoahParker
    07/6/2021
*/
import java.util.*;
import java.awt.Rectangle;

public class BetterRectangleSuper extends Rectangle{
    // BetterRectangleSuper: BetterRectangleSuper Class extends Rectangle
   public BetterRectangleSuper(int x, int y, int width, int height){
        // What It Does: Sends the values to the super
        // How It Works: Populates the super
       super(x,y,width,height);
   }
   public double getArea(){
        // What It Does: Returns Area
        // How It Works: Calls .getWidth() and .getHeight() from super
        double Area = this.getWidth() * this.getHeight();
        return Area;
   }
   public double getPerimeter(){
        // What It Does: Returns Perimeter
        // How It Works: Calls .getWidth() and .getHeight() from super
       double Perimeter = 2 * (this.getWidth() + this.getHeight());
       return Perimeter;
   }
   public static void main(String args[]){
        // What It Does: Demonstrates correctness of object methods
        // How It Works: UserInput to call public class  BetterRectangleSuper methods
       int x, y, width, height;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter x coordinate: ");
       x = in.nextInt();
       System.out.print("Enter y coordinate: ");
       y = in.nextInt();
       System.out.print("Enter width: ");
       width = in.nextInt();
       System.out.print("Enter height: ");
       height = in.nextInt();
       BetterRectangle betterRectangle = new BetterRectangle(x, y, width, height);
       System.out.println("The location of your rectangle is x=" + betterRectangle.getX() + " y=" +betterRectangle.getY());
        System.out.println( "The dimension of your rectangle is width=" +betterRectangle.getWidth()+ " height=" +betterRectangle.getHeight());
       System.out.println("The perimeter of the rectangle is: " + betterRectangle.getPerimeter());
       System.out.println("The area of the rectangle is: " + betterRectangle.getArea());
   }
}


