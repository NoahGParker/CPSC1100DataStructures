/* Cone.java: class that calcualtes volume and surface of a cone
   Author Noah Parker
   07/2/2021
*/
import java.util.*;
public class Cone {
   // Cone: Cone class
   double h;
   double r;
   public Cone(double h , double r){
      // What It Does: instantiate object variables
      // How It Works: Calls to constructor
   this.h = h;
   this.r = r;
   }
   public double Volume(double r, double h){
      // What It Does: Returns volume for cone
      // How It Works: Using the formula calculates it
      h = (1.0 / 3.0) * Math.PI * Math.pow(r,2) * h;
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   
   public double Surface(double r, double h){
      // What It Does: Returns surface for cone
      // How It Works: Using the formula calculates it
      h = Math.PI * r * (h + r);
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp) / Math.pow(10 , 2);
   }
   public static void main(String[] args){
      // What It Does: Demostrates correctness of object methods
      // How It Works: Instantiate a object and call its methods
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter the radius: ");
      double r = in.nextDouble();
      System.out.println("Please enter the height: ");
      double h = in.nextDouble();
      Cone oCone = new Cone(h,r);
      System.out.println("The volume of the cone is: "+oCone.Volume(r,h));
      System.out.println("The surface area of the cone is: "+oCone.Surface(r,h));
   } 
}
