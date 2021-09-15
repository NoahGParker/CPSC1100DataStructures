/*  MergeSorter.java: Class that implements Merge Sort algorithm
    Author Noah Parker
    07/23/2021
*/
import java.util.*;
public class MergeSorter
{
	// MergeSorter: MergeSorter class
	ArrayList<String> StringList;
	public MergeSorter(){
		// What It Does: instantiate object variables
        // How It Works: Calls to constructor
    StringList = new ArrayList<String>();
	}
	public static void main(String[] args){
		// What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
		MergeSorter oMergeSorter = new MergeSorter();
        oMergeSorter.getStrings();
		oMergeSorter.sort();
		oMergeSorter.printMergeSort();
	}
	public void printMergeSort(){
		// What It Does: Prints strings in lexicographic order
        // How It Works: Runs a for loop to print
		System.out.println("Your strings sorted in lexicographic order:");
		for(int i = 0; i < StringList.size(); i++)
		{
			System.out.println(StringList.get(i));
		}
		System.out.println();
	}
	public void sort(){
		// What It Does: Sorts based on the merge sort algorithim
    	// How It Works: Collections.sort uses merge sort
		// NOTE: Using this saves time coding versus hand typing merge sort method
		StringList.remove(StringList.size() - 1);
		Collections.sort(StringList);
	}
	public void getStrings(){
        // What It Does: promts for numbers and populates StringList
        // How It Works: Iterates on Scanner.nextLine
        System.out.println("Enter the strings you want to sort:");
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
