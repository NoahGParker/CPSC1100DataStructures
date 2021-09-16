/*  Find.java: class that reads files and finds keywords
    Author Noah Parker
    07/13/2021
	NOTE: Program to be used with command line arugments "java Find ring report.txt address.txt keyword.txt"
*/
import java.io.*;
import java.util.*;
public class Find{
     // Find: Find class
    ArrayList<File> fileList;
        public Find(){
        // What It Does: instantiate object variables
        // How It Works: Calls to constructor
        fileList = new ArrayList<File>();
    }
    public static void main(String[] args)throws FileNotFoundException{
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        Find oFind = new Find();
       oFind.getFile(args);   
    }
    public void getFile(String[] args) throws FileNotFoundException{
        // What It Does: takes input from command line as java Find ring report.txt
        // How It Works: Iterates on command line arguments
        String patternToLookFor = "";
        for(int i = 0; i < args.length; i++)
		{
			// If its the first argument, then it must be the pattern to look for
			if(i == 0)
			{
				patternToLookFor = args[i];
            }
            else
			{
				String fileName = "".concat(args[i]);
				fileList.add(new File(fileName));
			}
		}
		for(int i = 0; i < fileList.size(); i++)
		{
			String fileName = fileList.get(i).getName();
			System.out.print(fileName + ": ");
			Scanner in = new Scanner(fileList.get(i));
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				if(line.contains(patternToLookFor))
				{
					System.out.println(line);
				}
			}
			System.out.println();
			in.close();
		}
	}
}




