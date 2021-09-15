/*  BarChart.java: class that implements a Bar Chart
    Author Noah Parker
    07/13/2021
*/
import java.util.*;
public class BarChart {
    // BarChart: Bar Chart class
    ArrayList<Integer> NumberList;
    public BarChart(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        NumberList = new ArrayList<Integer>();
    }
    public static void main(String args[]){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        BarChart oBarChart = new BarChart();
        oBarChart.getNumbers();
        oBarChart.printAsterisks();
    }
    
    private int Max(){   
        // What It Does: Returns usermax
        // How It Works: Iterates NumberList
        // NOTE: Uses Enhanced For Loop
        int usermax = NumberList.get(0);
        for( int usernumber : NumberList)
        {
            if (usernumber > usermax )
            {
                usermax = usernumber;
            }
        }   
        return usermax;
    }
    public void printAsterisks(){
        // What It Does: Prints Asterisks 
        // How It Works: Runs for Loop to output a Bar Chart
        // NOTE: Uses Enhanced for Loop
        int usermax = this.Max();
        System.out.println("Your bar chart is below:");
        for (int i: NumberList)
        {
            int asterisks = (int)( 40.0 * i / usermax );
            for(int j=0; j<asterisks;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
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
}
