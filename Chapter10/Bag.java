/*  public class Bag.java: class that implements a Bag to store items
    Author NoahParker
    07/7/2021
*/
import java.util.*;
interface BagInterface{
    // BagInterface: Bag Interface   
    // What It Does: Instantiate object variables
    // How It Works: 
    public int count(String itemName);
    public void addItem(String itemName);
}  
public class Bag implements BagInterface{
    // Bag: Bag Class implements BagIterface
    public class Item{
        // What It Does: Instantiate object variables
        // How It Works: Calls to constructor
        String itemName;
        int quantity;
    }
    Item oitem;
    ArrayList<Item> items = new ArrayList<Item>();
    public void addItem(String itemName){
        // What It Does: Add items to array
        // How It Works: Populates array element
        oitem = new Item();
        oitem.itemName = itemName;
        items.add(oitem);
    }
    public int count(String itemName){
        // What It Does: Returns count
        // How It Works: Runs enhanced loop to count items
        // Note: Uses enhanced for Loop
        int count=0;
        for(Item item: items)
        {
            if(itemName.equalsIgnoreCase(item.itemName))
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        // What It Does: Demonstrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        // NOTE: Uses a HashSet
        Scanner in = new Scanner(System.in);
        ArrayList<String> userinput = new ArrayList<String>();
        String input = " ";
        System.out.println("Enter the items that you want to add");
        BagInterface bag = new Bag();
        do
        {
            input=in.nextLine();
            userinput.add(input);
            System.out.println("Enter next item or Q to quit");    
        }
        while (!input.equals("Q"));
        userinput.remove(userinput.size() - 1);
        for (int i=0; i<userinput.size();i++)
        {
            bag.addItem(userinput.get(i));
        }
        System.out.println("Your list of items with their counts are:");
        Set<String> unique = new HashSet<String>(userinput);
        for (String key : unique) 
        {
        System.out.println("Count of: " +key + ": " + bag.count(key));
        }
    }
}


