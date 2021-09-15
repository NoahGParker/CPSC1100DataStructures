/* Sphere.java: class that calcualtes volume and surface of a sphere
   Author Noah Parker
   07/2/2021
*/
import java.util.*;
public class Sphere {
   // Sphere: Sphere class
   double r;
   public Sphere(double h){
      // What It Does: instantiate object variables
      // How It Works: Calls to constructor
      this.r = r;
   }
   public double Volume(double r){
      // What It Does: Returns volume for sphere
      // How It Works: Using the formula calculates it
      r = ((4.00 / 3.00) * Math.PI * (Math.pow(r, 3)));
      int temp = (int)(r * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2); 
   }
   public double Surface(double r){
      // What It Does: Returns surface for sphere
      // How It Works: Using the formula calculates it
      r = 4.0 * Math.PI * Math.pow(r, 2);
      int temp = (int)(r * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static void main(String[] args){
      // What It Does: Demostrates correctness of object methods
      // How It Works: Instantiate a object and call its methods
      Scanner in = new Scanner(System.in);
      double r;
      System.out.println("Please enter the radius: ");
      r = in.nextDouble();
      Sphere oSphere = new Sphere(r);
      System.out.println("The volume of the sphere is: "+ oSphere.Volume(r));
      System.out.println("The surface area of the sphere is: "+ oSphere.Surface(r));
   }
}
