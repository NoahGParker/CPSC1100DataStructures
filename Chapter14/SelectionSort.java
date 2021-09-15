/*  SelectionSort.java: Class that implements Selection Sort algorithm
    Author Noah Parker
    07/23/2021
*/
import java.util.*;
public class SelectionSort{
    // SelectionSort: SelectionSort class
    ArrayList<Integer> NumberList;
    public SelectionSort(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        NumberList = new ArrayList<Integer>();
    }
    public static void main(String args[]){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        SelectionSort oSelectionSort = new SelectionSort();
        oSelectionSort.getNumbers();
        oSelectionSort.sort();
        oSelectionSort.printSelectionSort();
    }
    public void printSelectionSort() {
        // What It Does: Prints integers in decending order
        // How It Works: Runs a for loop to print
        System.out.println("Selection sort array:");
        for (int i = 0; i < NumberList.size(); ++i) {
            System.out.print(NumberList.get(i) + " ");
        }
        System.out.println("");
    }
    public void getNumbers(){
        // What It Does: promts for numbers and populates NumberList
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        System.out.println("Enter positive numbers to sort. "+" Enter a Negative Number to quit: ");
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
    public void sort(){
        // What It Does: Sorts based on the selection sort algorithim
    	// How It Works: Uses Collections Swap after seeing what the max is
        int indexLargest;
        NumberList.remove(NumberList.size() - 1);
        for (int i = 0; i < NumberList.size() - 1; ++i){
            indexLargest = i;
            for (int j = i + 1; j < NumberList.size(); ++j) {
                if (NumberList.get(j) > NumberList.get(indexLargest)) {
                    indexLargest = j;
                }
            }
            Collections.swap(NumberList, i, indexLargest);
        }
    }
}





