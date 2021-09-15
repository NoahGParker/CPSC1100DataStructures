/*  Grid.java: class that implements a Grid to store locations and descriptions in specified locations
    Author NoahParker
    07/7/2021
*/
import java.util.*;
public class Grid{
    // Grid: Grid Class
	private String[][] holdadd;
	ArrayList<Location> holdaddLocations = new ArrayList<Location>();
	public Grid(int numberofRows, int numberofColumns){
        // What It Does: Initializes array
        // How It Works: Instaniants array elements
		holdadd = new String[numberofRows][numberofColumns];
	}
  
	public void add(int row, int column, String description){
        // What It Does: Populates array element
        // How It Works: Instaniants location and calls add
		holdadd[row][column] = description;
		Location newLocation = new Location(row, column);
		holdaddLocations.add(newLocation);
	}
    public String getDescription(int row, int column){
        // What It Does: Returns description of certain locations
        // How It Works: Iterates on array table and element length
		return holdadd[row][column];
	}
	public ArrayList<Location> getDescribedLocations(){
        // What It Does: Returns list of locations that has descriptions
        // How It Works: Iterates on array table and element length
		ArrayList<Location> describedLocations = new ArrayList<Location>();
		for(int i = 0; i < holdadd.length; i++)
		{
			for(int j = 0; j < holdadd[0].length; j++)
			{
				if(holdadd[i][j] != null)
				{
					Location descriptionLoc = new Location(i, j);
					describedLocations.add(descriptionLoc);
				}
			}
		}
		return describedLocations;
	}
    class Location{
        // Location: Location Class
		// NOTE: Nested Class
        private int row;
		private int column;
		public Location(int row, int column){
            // What It Does: Initializes row and column
            // How It Works: Gets the row and column location 
			this.row = row;
			this.column = column;
		}
		public int getRow(){
            // What It Does: Returns row
            // How It Works: Gets row and returns row
			return this.row;
		}
		public int getColumn(){
            // What It Does: Returns column
            // How It Works: Gets column and returns column
			return this.column;
		}
        public String toString(){
            // What It Does: Makes the Location print out location friendly
            // How It Works: Overrides the toString() method
            // NOTE: Overrides the toString() method
            return "Location row: " + row + " Location colum: " + column;
        }
	}
    public static void main(String[] args){
        // What It Does: Demonstrates correctness of object methods
        // How It Works: UserInput to call public class Grids methods
        // NOTE: Uses a try catch
        // NOTE: Very detailed testing
        // NOTE: Uses the toString() override
        String input = " ";
        int userinputrow;
        int userinputcolumn;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the row lentgh of your grid:");
        userinputrow = in.nextInt(); 
        System.out.println("Please enter the row lentgh of your grid:");
        userinputcolumn = in.nextInt();
		Grid grid = new Grid(userinputrow, userinputcolumn);
        do
        {
            try
            {
                System.out.println("Please enter the row number you want to add a description to or Q to quit");
                userinputrow=in.nextInt();
                System.out.println("Please enter the column number in the row you want to add a description to");
                userinputcolumn = in.nextInt();
                in.nextLine();
                System.out.println("Enter your Description:");
                input = in.nextLine();
                grid.add(userinputrow, userinputcolumn, input);
            }
            catch (InputMismatchException e) 
            {
                break;
            }    
        }
        while (!input.equals("Q"));
        String input2 = " ";
        System.out.println("\nHere is a list of your grids with descriptions. Follow the prompt to pull up the description or Q to quit. " + "\n"+ grid.getDescribedLocations().toString());
        in.nextLine();
        do
        {
            try
            {
                System.out.println("Please enter the row for your description:");
                userinputrow = in.nextInt();
                System.out.println("Please enter the column for your description:");
                userinputcolumn = in.nextInt();
                System.out.println("\nYour Description is: " + grid.getDescription(userinputrow,userinputcolumn).toString());
                System.out.println("\nHere is a list of your grids with descriptions. Follow the prompt to pull up the description or Q to quit. " + "\n"+ grid.getDescribedLocations().toString());
            }
            catch (InputMismatchException e) 
            {
                break;
            } 
        }
        while (!input2.equals("Q"));
	}
}