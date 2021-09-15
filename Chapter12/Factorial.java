/*  Factorial.java: class that factors numbers
    Author Noah Parker
    07/15/2021
*/
import java.util.*;
public class Factorial{
    // Factorial: Factorial class
    ArrayList<Integer> NumberList;
    public Factorial(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        NumberList = new ArrayList<Integer>();

    }
    public static void main(String[] args){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        Factorial oFactorial = new Factorial();
       oFactorial.getNumbers();  
       oFactorial.printFactors();
    }
    public void getNumbers()
    {
        // What It Does: promts for numbers and populates NumberList
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        System.out.println("Enter positive numbers. "+" Enter a Negative Number to quit: ");
        Scanner in = new Scanner(System.in);
        int arraynumber =0;
        do
        {
            try 
            {
                arraynumber= in.nextInt();
                NumberList.add(arraynumber);
            }
            catch (InputMismatchException e) 
            {
                System.out.println("Please use a positive or negative number:");
                in.nextLine();
            } 
        }
        while (arraynumber >=0);
    }
    public void printFactors(){
        // What It Does: Outputs the factors
        // How It Works: Runs for Loop to output the factors
        NumberList.remove(NumberList.size() - 1);
        for(int i = 0; i < NumberList.size(); i++)
        {
            System.out.println("Factors of: " + NumberList.get(i) + " " + factors(NumberList.get(i)));
        }
    }
    public ArrayList<Integer> factors(int f) {
        // What It Does: Returns list
        // How It Works: To be called on itself to return list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < f; i++) 
        {
            if (f % i == 0) 
            {
                list.add(i);
                factors(f / i, list);
                return list;
            }
        }
        list.add(f);
        return list;
    }   
    public void factors(int f, ArrayList<Integer> l){
        // What It Does: Recursion
        // How It Works: Returns itself when called on
        for (int i = 2; i < f; i++) 
        {
            if (f % i == 0) 
            {
                l.add(i);
                factors(f / i, l);
                return;
            }
        }
        l.add(f);
    }   
}
