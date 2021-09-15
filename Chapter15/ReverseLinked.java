/*  ReverseLinked.java: Class that implements Reversing a LinkedList
    Author Noah Parker
    07/24/2021
*/
import java.util.*;
public class ReverseLinked{
     // ReverseLinked: ReverseLinked class
    LinkedList<String> StringList;
    public ReverseLinked(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        StringList = new LinkedList<String>();
    }
    public static void main(String[] args){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        ReverseLinked oReverseLinked = new ReverseLinked();
        oReverseLinked.getStrings();
		oReverseLinked.reverse();
        oReverseLinked.printReversedLinked();
    }
    public  void reverse(){
        // What It Does: Reverses StringList
    	// How It Works: Runs for loop to reverse
        StringList.remove(StringList.size() - 1);
	    int listLength = StringList.size();
		LinkedList<String> temp = new LinkedList<String>();
		for(int i = 0; i < listLength; i++)
		{
			temp.addFirst(StringList.removeFirst());
		}
		StringList.addAll(temp);
	}
    public void printReversedLinked(){
        // What It Does: Prints the Linked Lists Reversed
        // How It Works: Runs a for loop to print
        System.out.println("Your strings in reverse order of input:");
        for(int i = 0; i < StringList.size(); i++)
        {
            System.out.println(StringList.get(i));
        }
            System.out.println();
        }
        public void getStrings()
        {
            // What It Does: promts for numbers and populates StringList
            // How It Works: Iterates on Scanner.nextLine
            System.out.println("Enter the strings you want:");
            Scanner in = new Scanner(System.in);
            String arraycaption = " ";
            do
            {
                arraycaption = in.nextLine();
                StringList.add(arraycaption);
                System.out.println("Enter Next String or Q to quit:");
            }
            while (!arraycaption.equals("Q")); 
        }
}
