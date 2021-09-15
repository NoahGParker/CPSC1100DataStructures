/* Cylinder.java: class that calcualtes volume and surface of cylinder
   Author Noah Parker
   07/2/2021
*/
import java.util.*;
public class Cylinder{
   // Cylinder: Cylinder class
   double h;
   double r;
   public Cylinder(double h , double r){
      // What It Does: instantiate object variables
      // How It Works: Calls to constructor
   this.h = h;
   this.r = r;
   }
   public double Volume(double r, double h){
      // What It Does: Returns volume for cylinder
      // How It Works: Using the formula calculates it
      h= h * Math.PI * Math.pow(r,2);
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public double Surface(double r, double h){
      // What It Does: Returns surface for cylinder
      // How It Works: Using the formula calculates it
      h = (2.0 * r * Math.PI * h) + (2.0 * Math.PI * Math.pow(r,2));
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static void main(String[] args){
      // What It Does: Demostrates correctness of object methods
      // How It Works: Instantiate a object and call its methods
    Scanner in = new Scanner(System.in);
      double r, h;
      System.out.println("Please enter the radius: ");
      r = in.nextDouble();
      System.out.println("Please enter the height: ");
      h = in.nextDouble();
      Cylinder oCylinder = new Cylinder(h,r);
      System.out.println("The volume of the cylinder is: "+ oCylinder.Volume(r,h));
      System.out.println("The surface area of the cylinder is: "+oCylinder.Surface(r,h));
   }
}
