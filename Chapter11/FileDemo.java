/*  FileDemo.java: class that reads files and ouputs the number of characters, words, and lines in that file.
    Author Noah Parker
    07/13/2021
*/
import java.io.*;
import java.util.*;
class FileCounter{
    // FileCounter: FileCounter class
   Scanner sc;
   int lineCounter;
   int wordCounter;
   int charcterCounter;
   public FileCounter(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
   }
   public void read(Scanner in){
        // What It Does: Reads the file
        // How It Works: Populates the line counter
       sc = in;
       int count = 0;
       String str;
       while (sc.hasNext())
       {
           str = sc.nextLine();
           wordCounter = wordCounter + str.split(" ").length;
           charcterCounter = charcterCounter + str.length();
           lineCounter++;
       }
   }
   public int getWordCount(){
        // What It Does: Returns wordCounter
        // How It Works: Returns the counted words
       return wordCounter;
   }
   public int getLineCount(){
        // What It Does: Returns lineCounter
        // How It Works: Returns the counted lines
       return lineCounter;
   }
   public int getCharacterCount(){
        // What It Does: Returns charcterCounter
        // How It Works: Returns the counted characters
       return charcterCounter;
   }
}
public class FileDemo{
    // FileDemo: FileDemo class
   public static void main(String[] args) throws FileNotFoundException{
         // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
       System.out.print("Filename: ");
       Scanner in = new Scanner(System.in);
       String name = in.nextLine();
       FileCounter counter = new FileCounter();
       try (Scanner fileIn = new Scanner(new File(name))) {
           counter.read(fileIn);
           System.out.println("Characters: " + counter.getCharacterCount());
           System.out.println("Words: " + counter.getWordCount());
           System.out.println("Lines: " + counter.getLineCount());
       } catch (FileNotFoundException e) {
           System.out.println("File " + name + " not found");
       }
   }
}