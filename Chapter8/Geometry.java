/* Geometry.java: class that calcualtes volume and surface of multiple shapes
   Author Noah Parker
   07/2/2021
*/
import java.util.*;
public  class Geometry{
   // Geometry: Geometry class
   public static double cubeVolume(double h){
      // What It Does: Returns volume for cube
      // How It Works: Using the formula calculates it
      h = Math.pow(h, 3);
      int temp = (int)(h* Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2); 
   }
   public static double cubeSurface(double h){
      // What It Does: Returns surface for cube
      // How It Works: Using the formula calculates it
      h = 6*(Math.pow(h, 2));
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static double sphereVolume(double r){
      // What It Does: Returns volume for sphere
      // How It Works: Using the formula calculates it
      r = ((4.00 / 3.00) * Math.PI * (Math.pow(r, 3)));
      int temp = (int)(r * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2); 

   }
   public static double sphereSurface(double r){
      // What It Does: Returns surface for sphere
      // How It Works: Using the formula calculates it
      r = 4.0 * Math.PI * Math.pow(r, 2);
      int temp = (int)(r * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static double cylinderVolume(double r, double h){
      // What It Does: Returns volume for cylinder
      // How It Works: Using the formula calculates it
      h= h * Math.PI * Math.pow(r,2);
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static double cylinderSurface(double r, double h){
      // What It Does: Returns surface for cylinder
      // How It Works: Using the formula calculates it
      h = (2.0 * r * Math.PI * h) + (2.0 * Math.PI * Math.pow(r,2));
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
   public static double coneVolume(double r, double h){
      // What It Does: Returns volume for cone
      // How It Works: Using the formula calculates it
      h = (1.0 / 3.0) * Math.PI * Math.pow(r,2) * h;
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
     
   }   
   public static double coneSurface(double r, double h){
      // What It Does: Returns surface for cone
      // How It Works: Using the formula calculates it
      h = Math.PI * r * (h + r);
      int temp = (int)(h * Math.pow(10 , 2));  
      return ((double)temp)/Math.pow(10 , 2);
   }
      public static void main(String[] args){
      // What It Does: Proves that the assignment is complete and correct
      // How It Works: Calls the relates classes
      Scanner in = new Scanner(System.in);
      double r, h;
      System.out.println("Please enter the radius: ");
      r = in.nextDouble();
      System.out.println("Please enter the height: ");
      h = in.nextDouble();
      System.out.println("The volume of the cube is: "+  Geometry.cubeVolume(h));
      System.out.println("The surface of the cube is: "+ Geometry.cubeSurface(h));
      System.out.println("The volume of the sphere is: "+ Geometry.sphereVolume(r));
      System.out.println("The surface area of the sphere is: "+ Geometry.sphereSurface(r));
      System.out.println("The volume of the cylinder is: "+ Geometry.cylinderVolume(r,h));
      System.out.println("The surface area of the cylinder is: "+Geometry.cylinderSurface(r,h));
      System.out.println("The volume of the cone is: "+Geometry.coneVolume(r,h));
      System.out.println("The surface area of the cone is: "+Geometry.coneSurface(r,h));
   }




}
