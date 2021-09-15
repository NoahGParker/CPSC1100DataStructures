/* @param Solution to E10.12 @see public class CPSC_1110_Ch10_E12_Parker for details
@Author Parker
@since 06/30/2021
@see public class CPSC_1110_Ch10_E12_Parker 
*/
import java.util.ArrayList;
public interface BagInterface {
    int count(String itemName);
    void addItem(String itemName);
    
    
public class Bag implements BagInterface{

public class Item{

String itemName;

int quantity;

}

Item item;

ArrayList<Item> items = new ArrayList<Item>();

public void addItem(String itemName){

item = new Item();

item.itemName = itemName;

items.add(item);

}

public int count(String itemName){

int count=0;

for(Item item: items){

if(itemName.equalsIgnoreCase(item.itemName))

count++;

}

return count;

}

public static void main(String[] args){

BagInterface bag = new Bag();

bag.addItem("ball");

bag.addItem("ball");

bag.addItem("ball");

bag.addItem("ball");

bag.addItem("apple");

bag.addItem("apple");

bag.addItem("orange");

bag.addItem("orange");

bag.addItem("orange");

System.out.println("Count of ball::"+bag.count("ball"));

System.out.println("Count of apple::"+bag.count("apple"));

System.out.println("Count of orange::"+bag.count("orange"));

}



}

}   
