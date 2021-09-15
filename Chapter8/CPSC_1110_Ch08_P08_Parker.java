/*  CPSC_1110_Ch08_P08_Parker.java: contains class that demonstrates assignment completed
    Author Noah Parker
    06/30/2021
*/
import java.util.*;
class CPSC_1110_Ch08_P08_Parker{
    // CPSC_1110_Ch08_P08_Parker: CPSC_1110_Ch08_P07_Parker Class for demostrating class completion
    public static void main(String[] args){
        // What It Does: Proves that the assignment is complete and correct
        // How It Works: Calls the relates classes
        Scanner in = new Scanner(System.in);
        double r, h;
        System.out.println("Please enter the radius: ");
        r = in.nextDouble();
        System.out.println("Please enter the height: ");
        h = in.nextDouble();
        Sphere oSphere = new Sphere(r);
        Cone oCone = new Cone(h,r);
        Cube oCube = new Cube(h);
        Cylinder oCylinder = new Cylinder(h,r);
        System.out.println("The volume of the cube is: "+  oCube.Volume(h));
        System.out.println("The surface of the cube is: "+ oCube.Surface(h));
        System.out.println("The volume of the sphere is: "+ oSphere.Volume(r));
        System.out.println("The surface area of the sphere is: "+ oSphere.Surface(r));
        System.out.println("The volume of the cylinder is: "+ oCylinder.Volume(r,h));
        System.out.println("The surface area of the cylinder is: "+oCylinder.Surface(r,h));
        System.out.println("The volume of the cone is: "+oCone.Volume(r,h));
        System.out.println("The surface area of the cone is: "+oCone.Surface(r,h));
    }
}