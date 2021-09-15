/*  BreakNumber.java: Class that implements splitting an integer into its individual digits.
    Author Noah Parker
    07/24/2021
*/
import java.util.*;
public class BreakNumber{
    // BreakNumber: BreakNumber class
     ArrayList<Integer> NumberList;
     public BreakNumber(){
         // What It Does: instantiate object variables
         // How It Works: Calls to constructor
         NumberList = new ArrayList<Integer>();
     }
     public static void main(String args[]){
         // What It Does: Demostrates correctness of object methods
         // How It Works: Instantiate a object and call its methods
         BreakNumber oBreakNumber = new BreakNumber();
         oBreakNumber.getNumbers();
         oBreakNumber.printBreak();
     }
    public void printBreak(){
        // What It Does: Prints splited integers
        // How It Works: Runs a for loop to print
        System.out.println("Your digits broken up are:");
        NumberList.remove(NumberList.size() - 1);
        List<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < NumberList.size(); ++i){
            int num = NumberList.get(i);
            String number = String.valueOf(num);
            for(int j = 0; j < number.length(); j++) {
                int x = Character.digit(number.charAt(j), 10);
                digits.add(x);
            }
            System.out.println(digits);
            digits.clear();
         }
    }
    public void getNumbers(){
        // What It Does: promts for numbers and populates NumberList
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        System.out.println("Enter positive numbers to break up. "+" Enter a Negative Number to quit: ");
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
}