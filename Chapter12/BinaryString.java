/*  BinaryString.java: class that turns numbers into binary 
    Author Noah Parker
    07/15/2021
*/
import java.util.*;
public class BinaryString {
// BinaryString: BinaryString  class
ArrayList<Integer> NumberList;
    public BinaryString(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        NumberList = new ArrayList<Integer>();
}
    public static void main(String[] args){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        BinaryString oBinaryString = new BinaryString();
        oBinaryString.getNumbers();  
        oBinaryString.printBinary();
    }
    public void getNumbers(){
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
    public void printBinary(){
        // What It Does: Outputs the binary of numbers
        // How It Works: Runs for Loop to output the binary
        NumberList.remove(NumberList.size() - 1);
        for(int i = 0; i < NumberList.size(); i++)
        {
        System.out.println("Binary of: " + NumberList.get(i) + " is " + toBinary(NumberList.get(i)));
        }
    }
    private static String toBinary(int n) {
        // What It Does: Recursive method to conver number to binary
        // How It Works: Calls on int n to return toBinary(n / 2) + "" + a
        int a;
        if (n > 0) 
        {
            a = n % 2;
            return (toBinary(n / 2) + "" + a);
        }
        return "";
    }
}
