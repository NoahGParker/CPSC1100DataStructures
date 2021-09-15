/*  BarChartVertical.java: class that implements a Bar Chart vertically
    Author Noah Parker
    06/30/2021
*/
import java.util.*;
public class BarChartVertical{
    // BarChartVertical: Bar Chart Vertical class
    ArrayList<Integer> NumberList;
    public BarChartVertical(){
        // What It Does: Instantiate object variables
        // How It Works: Calls to constructor
        NumberList = new ArrayList<Integer>();
    }
    public static void main(String args[]){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        BarChartVertical oBarChartVertical = new BarChartVertical();
        oBarChartVertical.getNumbers();
        oBarChartVertical.printAsterisks();
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
        final int Max_Height = 20;
        int usermax = this.Max();
        int asterisks = (int)( Max_Height / usermax );
        System.out.println("Your vertical bar chart is below:");
        for (int row = 0 ; row < Max_Height ; row ++)
        {
            for(int col = 0 ; col < NumberList.size() ; col ++)
            {
                int n = NumberList.get(col);
                n = (int) (n * asterisks);
                if (row >= Max_Height - n) 
                {
                    System.out.print("*");
                } 
                else 
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void getNumbers(){
        // What It Does: Prompts for numbers and populates NumberList
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        System.out.println("Enter positive numbers. "+"Enter a negative number to quit: ");
        var in = new Scanner(System.in);
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



