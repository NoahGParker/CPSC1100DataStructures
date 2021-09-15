// This imports what we need for the scanner and ArrayList
import java.util.*;
public class TestingTable {
 // What it Does: Demonstrates Correctness of non-static class methods
// How it Works: Instantiate object, call methods
    public static void main(String args[]){
       
       ArrayList<String>  UserInput = ReadUserInput();
       ArrayList<String> UserInput4 = ReadUserCaption();
     
if(UserInput.isEmpty() && UserInput4.isEmpty()){
    printAsterisks(UserInput);}
else{
    ReadUserCaption();

}



    }
      // What It Does: Return array list largest element 
      // How It Works: Iterate on Greater-Than Test
    public static int Max(ArrayList<String> UserInput) {
        ArrayList<Integer> UserInput2 = new ArrayList<>(UserInput.size());
        for (int i = 0; i < UserInput.size(); i++) {
            UserInput2.add(Integer.parseInt(UserInput.get(i)));
        
        }
        int usermax = UserInput2.get(0);
        for( int usernumber : UserInput2 )
        {
            if (usernumber > usermax ){
                usermax=usernumber;
            }
        }
        return usermax;
        }
        public static void printAsterisks(ArrayList<String> UserInput){
            ArrayList<Integer> UserInput2 = new ArrayList<>(UserInput.size());
            for (int i = 0; i < UserInput.size(); i++) {
                UserInput2.add(Integer.parseInt(UserInput.get(i)));
            
            }
            int usermax = Max(UserInput);
            // What It Does: Output the asterisks Porpotionally
            // How It Works: runs a enhanced for loop to Output the asterisk proportionally
            PrintCaption();
            for (int i=0; i<UserInput2.size();i++)
            {
                int arraynumber = UserInput2.get(i);
                int asterisks = (int)(40.0*arraynumber/usermax);
                
                for(int j=0; j<asterisks;j++){
                System.out.print("*");
                }
                System.out.println();
            }
        }
        // What It Does: Returns an ArrayList of Positive Prompted Values
      // How It Works: Iterate on Scanner.nextInt()
       public static ArrayList<String>  ReadUserInput(){
      
        
            ArrayList<Integer> UserInput3 = new ArrayList<Integer>();
          
            System.out.println("Enter positive numbers. "+"Enter a negative number to quit: ");
            Scanner in = new Scanner(System.in);
            int arraynumber =0;
            
            
    // FLAIR? 
    // What It Does: Catches a expection enters a character instead of a integar
    //How It Work: when the user inputs a char it will catch the expection and try the user input again
            do{
                try {
                     arraynumber= in.nextInt();
                     UserInput3.add(arraynumber);
                     in.nextLine();
                }
                catch (InputMismatchException e) {
                    System.out.println("Please use a positive or negative number:");
                    in.nextLine();
                } 
            }
            // What It Does: while the arraynumber is 0 or a postive number  
            // How It Works: When the user enters a postive number it keeps going a negative stops the while loop
            while (arraynumber >=0);
             ReadUserCaption();
            
            ArrayList<String> UserInput = new ArrayList<>(UserInput3.size());
            for (Integer myInt : UserInput3) { 
              UserInput.add(String.valueOf(myInt)); 
              
        } 
        
        return UserInput;
      
            }
            public static ArrayList<String> ReadUserCaption(){
           

                Scanner in = new Scanner(System.in);
                String arraycaption;
                ArrayList<String> UserInputCaption = new ArrayList<String>();
                System.out.println("Enter Your Caption");
                
                do{
                    System.out.println("Enter Your Caption");
                      arraycaption = in.next();
                       UserInputCaption.add(arraycaption);
                    
                       
                    }
                    while(!arraycaption.equals("quit"));
                       return UserInputCaption;
                       
            }
                       
                      
            
            public static void PrintCaption(){
                ArrayList<String> UserInputCaption = ReadUserCaption();
                for(int i = 0; i < UserInputCaption.size(); i++) {   
                    System.out.print(UserInputCaption.get(i));
                }  
            }
         


}
