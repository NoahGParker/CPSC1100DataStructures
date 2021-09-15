/*  Cube.java: class that calcualtes volume and surface of a Cube
    Author Noah Parker
    07/2/2021
*/
import java.util.*;
public class Cube{
  // Cube: Cube class
  double h;
  public Cube(double h){
     // What It Does: instantiate object variables
     // How It Works: Calls to constructor
  this.h = h;
  }
  public double Volume(double h){
    // What It Does: Returns volume for cube
    // How It Works: Using the formula calculates it
    h = Math.pow(h, 3);
    int temp = (int)(h* Math.pow(10 , 2));  
    return ((double)temp)/Math.pow(10 , 2); 
  }
   public double Surface(double h){
    // What It Does: Returns surface for cube
    // How It Works: Using the formula calculates it
    h = 6*(Math.pow(h, 2));
    int temp = (int)(h * Math.pow(10 , 2));  
    return ((double)temp)/Math.pow(10 , 2); 
   } 
  public static void main(String[] args){
    // What It Does: Demostrates correctness of object methods
    // How It Works: Instantiate a object and call its methods
    Scanner in = new Scanner(System.in);
    double  h;
    System.out.println("Please enter the height: ");
    h = in.nextDouble();
    Cube oCube = new Cube(h);
    System.out.println("The volume of the cube is: "+ oCube.Volume(h));
    System.out.println("The surface of the cube is: "+ oCube.Surface(h));
 }
}
