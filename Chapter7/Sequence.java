/*  Sequence.java: class that implements two sequences that combine
    Author Noah Parker
    07/2/2021
*/
import java.util.*;
public class Sequence{
// Sequence: Sequence class
private ArrayList<Integer> values;
    public Sequence(){  
        // What It Does: Instantiate object variables
        // How It Works: Calls to constructor    
        values = new ArrayList<Integer>(); 
    }
    public void add(int n){
        // What It Does: Adds int n to array list
        // How It Works: Populates array element
        values.add(n);    
    }
     public String toString(){ 
        // What It Does: Returns values as String
        // How It Works: Uses the toString() method convert to string
        return values.toString();
    }

    public Sequence append(Sequence other){
        // What It Does: Returns all the strings together as this.
        // How It Works: Calls the addAll() method
        values.addAll(other.values);
        return this;
    }
    public static void main(String[] args) {
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        // NOTE: Detailed Testing
        Scanner in = new Scanner(System.in);
        Sequence s1 = new Sequence();
        System.out.println(" For first Sequence List Enter positive or negative numbers. "+"Enter Q quit:");
        int userinput1 = 0;
        String arraycaption = "";
        do
        {
            try 
            {   
                userinput1 =in.nextInt();
                s1.add(userinput1);
            }
            catch (InputMismatchException e) 
            {
                arraycaption = in.nextLine();
                    if(!arraycaption.equals("Q"))
                    {
                        System.out.println("Enter postive or negative numbers. "+"Enter Q quit: ");
                    } 
            } 
         }
        while (!arraycaption.equals("Q"));
        System.out.println(" For Second Sequence List Enter positive or negative numbers. "+"Enter Q quit: ");
        Sequence s2 = new Sequence();
        int userinput2 = 0;
        String arraycaption2 = "";
        do
        {
            try 
            {
                userinput2 =in.nextInt();
                s2.add(userinput2);
            }
            catch (InputMismatchException e) 
            {
                arraycaption2 = in.nextLine();
                    if(!arraycaption2.equals("Q"))
                    {
                    System.out.println("Enter postive or negative numbers. "+"Enter Q quit: ");
                    } 
            } 
        }
        while (!arraycaption2.equals("Q"));
        System.out.println("Your First Sequence is:" +s1);
        System.out.println("Your Second Sequence is:"+s2);
        s1.append(s2);
        System.out.println( "Your first and second sequence combined:" + s1);
    }
}


