/*  BarChartNegative.java: class that implements a Bar Chart that has captions connected
    Author Noah Parker
    06/30/2021
*/
import java.util.*;
public class BarChartCaptions{
 // BarChartCaptions: Bar Chart Captions class
 ArrayList<ArrayList<String>> NumberListAndCaption;
    public BarChartCaptions(){
        // What It Does: Instantiate object variables
        // How It Works: Calls to constructor
        NumberListAndCaption= new ArrayList<ArrayList<String>>();
    }
    public static void main(String args[]){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        BarChartCaptions oBarChartCaptions= new BarChartCaptions();
        oBarChartCaptions.getNumbersAndCaptions();
        oBarChartCaptions.printAsterisks();
    }
   public void printAsterisks(){ 
        // What It Does: Prints Asterisks 
        // How It Works: Runs for Loop to output a Bar Chart with captions
        String s = NumberListAndCaption.get(2).get(0);
        int k =Integer.parseInt(s); 
        ArrayList<String> Userinput3 = new ArrayList<String>();
        for(int i=0; i<k; i++)
        {
            String boo = NumberListAndCaption.get(0).get(i);
            Userinput3.add(boo);
        }
        ArrayList<Integer> UserInput6 = new ArrayList<>(NumberListAndCaption.size());
        for (int i = 0; i < k; i++) 
        {
            UserInput6.add(Integer.parseInt(Userinput3.get(i)));
        }
        int usermax = Collections.max(UserInput6);
        System.out.println("You Bar Chart is:");
        for (int i=0; i<k;i++)
        {
            int arraynumber = UserInput6.get(i);
            int asterisks = (int)(40.0*arraynumber/usermax);
            System.out.print(NumberListAndCaption.get(1).get(i) + ":");
            for(int j=0; j<asterisks;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
    }
    public void getNumbersAndCaptions(){
            // What It Does: Prompts for numbers and populates NumberListAndCaption
            // How It Works: Iterates on Scanner.nextLine
            // NOTE: Uses Try Catch
        ArrayList<String> UserInputNumber = new ArrayList<String>();
        ArrayList<String> UserInputCapiton = new ArrayList<String>();
        ArrayList<String> NumberOfCapitons = new ArrayList<String>();
        ArrayList<Integer> UserInputNum = new ArrayList<Integer>();
        System.out.println("Enter a Positive number");
        Scanner in = new Scanner(System.in);
        int arraynumber =0;
        String arraycaption = "";
        do
        {
            try {
                arraynumber =in.nextInt();
                UserInputNum.add(arraynumber);
                System.out.println("Enter Caption:");
            }
            catch (InputMismatchException e) 
            {
                arraycaption = in.nextLine();
                UserInputCapiton.add(arraycaption);
                    if(!arraycaption.equals("Q"))
                    {
                        System.out.println("Enter next number or Q to quit");
                    }  
            }    
        }
        while (!arraycaption.equals("Q")); 
        UserInputNumber = new ArrayList<>(UserInputNum.size());
        for (Integer myInt : UserInputNum) 
        { 
            UserInputNumber.add(String.valueOf(myInt));  
        } 
        int x = UserInputNumber.size();
        String s= String.valueOf(x);
        NumberOfCapitons.add(s);
        NumberListAndCaption.add(UserInputNumber);
        NumberListAndCaption.add(UserInputCapiton);
        NumberListAndCaption.add(NumberOfCapitons);
    }
}
