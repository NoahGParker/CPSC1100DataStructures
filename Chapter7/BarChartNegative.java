/*  BarChartNegative.java: class that implements a Bar Chart that contains both negative and postive integers
    Author Noah Parker
    06/30/2021
*/
import java.util.*;
public class BarChartNegative{
// BarChartNegative: Bar Chart Negative class
  ArrayList<Integer> NumberList;
  public BarChartNegative(){
      // What It Does: instantiate object variables
      // How It Works: calls to constructor
      NumberList = new ArrayList<Integer>();
  }
    public static void main(String args[]){
        // What It Does: demostrates correctness of object methods
        // How It Works: instantiate a object and call its methods
         BarChartNegative oBarChartNegative = new BarChartNegative();
        oBarChartNegative.getNumbers();
        oBarChartNegative.printAsterisks();
  }
    private int Max(){   
        // What It Does: Returns usermax
        // How It Works: Iterates NumberList
        // NOTE: Uses Enhanced For Loop
        int usermax = NumberList.get(0);
        for( int usernumber : NumberList)
        {
            if (Math.abs(usernumber) > usermax )
            {
                usermax = usernumber;
            }
        }   
        return usermax;
    }
    
    public void printAsterisks(){
        // What It Does: Prints Asterisks 
        // How It Works: Runs for Loop to output a Bar Chart with postive and negtives
        // NOTE: Uses Enhanced for Loop
        int usermax = this.Max();
        System.out.println("Your bar chart with negative and postive values is below:");
            System.out.println();
            for (int a : NumberList) 
            {
                int asterisks = ( a * 40 ) / usermax ;
                if(asterisks > 0 )
                {
                System.out.printf("%40c",' ');
                }
                else
                {
                asterisks = Math.abs(asterisks);
                if (asterisks != 40)
                {
                System.out.printf("%"+(40-asterisks)+"c",' '); 
                }
                }
                for (int i = 0 ; i < asterisks; i++) {
                System.out.print("*");
                }
                System.out.println();
                }
    }
    public void getNumbers(){
        // What It Does: Prompts for numbers and populates NumberList
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        System.out.println("Enter negative numbers or postive numbers. "+"Enter Q quit: ");
        var in = new Scanner(System.in);
        int arraynumber =0;
        String arraycaption = "";
        do
        {
            try 
            {
                arraynumber=in.nextInt();
                NumberList.add(arraynumber);
            }
            catch (InputMismatchException e) 
            {
            arraycaption = in.nextLine();
                if(!arraycaption.equals("Q"))
                {
                    System.out.println("Enter negative numbers or postive numbers. "+"Enter Q quit: ");
                } 
            } 
        }
        while (!arraycaption.equals("Q"));
    }
}
