/*  Reverse.java: class that turns reveres string
    Author Noah Parker
    07/15/2021
*/
import java.util.*;
public class Reverse {
// Reverse: Reverse class
ArrayList<String> StringList;
    public Reverse(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        StringList = new ArrayList<String>();
}
    public static void main(String[] args){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        Reverse oReverse = new Reverse();
        oReverse.getStrings();  
        oReverse.printReverseString();
    }
    public void getStrings(){
        // What It Does: promts for numbers and populates StringList
        // How It Works: Iterates on Scanner.nextLine
        System.out.println("Enter the strings you want reversed. "+" Enter Q when your ready to quit: ");
        Scanner in = new Scanner(System.in);
        String arraysString =" ";
        do
        {
            
               arraysString= in.nextLine();
                StringList.add(arraysString);
       
    }
    while (!arraysString.equals("Q"));
    }
    public void printReverseString(){
        // What It Does: Outputs the reverse of strings
        // How It Works: Runs for Loop to output the reverse string
        StringList.remove(StringList.size() - 1);
        for(int i = 0; i < StringList.size(); i++)
        {
        System.out.println("The Reverse of: " + StringList.get(i) + " is: " + reverse(StringList.get(i)));
        }
    }
    public static String reverse(String s) {
        if (s.isEmpty())
                return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
