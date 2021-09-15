/*  BubbleSort.java: Class that implements Bubble Sort algorithm
    Author Noah Parker
    07/23/2021
*/
import java.util.*;
public class BubbleSort{
	// BubbleSort: BubbleSort class
	ArrayList<String> StringList;
	public BubbleSort(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        StringList = new ArrayList<String>();
	}
	public static void main(String[] args){
		// What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
		BubbleSort oBubbleSort = new BubbleSort();
        oBubbleSort.getStrings();
		oBubbleSort.BubbleSorting();
		oBubbleSort.printBubbleSort();
	}
    public void BubbleSorting(){
		// What It Does: Sorts based on the bubble sort algorithim
    	// How It Works: Compares Strings side by side
		String temp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < StringList.size()-1; i++) {
				if (StringList.get(i).compareTo(StringList.get(i + 1)) > 0){
					temp = StringList.get(i);
					StringList.set(i, StringList.get(i + 1));
					StringList.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}
	public void printBubbleSort(){
		// What It Does: Prints strings in lexicographic order
        // How It Works: Runs a for loop to print
		System.out.println("Your strings sorted in lexicographic order:");
		for(int i = 0; i < StringList.size(); i++)
		{
			System.out.println(StringList.get(i));
		}
		System.out.println();
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

