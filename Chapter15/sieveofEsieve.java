/*  sieveofEsieve.java: Class that implements sieve of Eratosthenes
    Author Noah Parker
    07/23/2021
*/
import java.util.*;
public class sieveofEsieve{
    // sieveofEsieve: sieveofEsieve class
    int maxNumber =0;
    public static void main(String[] args){
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
      sieveofEsieve osieveofEsieve = new sieveofEsieve();
      osieveofEsieve.getNumber();
      osieveofEsieve.printPrime();
    }
    public void getNumber(){
        // What It Does: promts for numbers and populates maxNumber
        // How It Works: Iterates on Scanner.nextLine
        // NOTE: Uses Try Catch
        Scanner in=new Scanner(System.in); 
        maxNumber = 1;
        do{
            try{
                System.out.println("Up to what number do you want to check for primes? ");
                maxNumber= in.nextInt();}
            catch (InputMismatchException e) {
                    System.out.println("Please use a positive  number:");
                    in.nextLine();
            } 
        }
    while(maxNumber == 1);
    }
    public void printPrime(){
        // What It Does: Prints all primes based on maxNumber
        // How It Works: Runs a for loop and boolean to print
        int i,j;
        while(maxNumber != 0){
            boolean sieve[]=new boolean[maxNumber];{
                for(i=0;i<maxNumber;i++)
                sieve[i]=true;
                for(i=2;i<=maxNumber/2;i++)
                if(sieve[i])
                for(j=i;j<maxNumber;j+=i)
                if(sieve[j]&&j!=i)
                sieve[j]=false;
                System.out.println("The prime numbers between 2 and "+maxNumber+" are:");
                j=0;
                for(i=2;i<maxNumber;i++){
                    if(sieve[i]){ 
                    System.out.print(i+" ");
                    j++;
                    if(j%15==0)
                    System.out.println(" ");
                    }
                }
            }
        break;
        }
    }
}