/*  MyLinkedList.java: Class that returns current size of a LinkedList
    Author Noah Parker
    07/28/2021
*/
import java.util.*;
public class MyLinkedList{
	//  MyLinkedList:  MyLinkedList class
	public interface MyListIterator{
		// What It Does: Passes the next element
        // How It Works: Retunrs the passed element
		Object next();
		boolean hasNext();
		void add(Object element);
		void remove();
		void set(Object element);
	}
	private Node first;
	private int currentSize;
	public MyLinkedList(){
		// What It Does: instantiate object variables
        // How It Works: Calls to constructor
		this.currentSize = 0;
		this.first = null;
	}
	public Object getFirst(){
		// What It Does: Gets first LinkedList
        // How It Works: If not null gets first
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		return this.first.data;
	}
	public Object removeFirst(){
		// What It Does: Removes First
        // How It Works: If not null removes first element
		if(this.first == null){
			throw new NoSuchElementException();
		}
		Object element = this.first.data;
		this.first = first.next;
		this.currentSize--;
		return element;
	}
	public void addFirst(Object element){
		// What It Does: Adds first element
        // How It Works: Iterates NumberList
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;
		this.first = newNode;
		this.currentSize++;
	}
	public MyListIterator listIterator(){
		// What It Does: Returns MyLinkedListIterator
        // How It Works: Calls to constructor
		return new MyLinkedListIterator();
	}
	public String toString(){
		// What It Does: Makes the Location print out location friendly
        // How It Works: Overrides the toString() method
        // NOTE: Overrides the toString() methodt	
		String s = "";
		MyListIterator iter = this.listIterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			s = s + "[" + obj + "]";
		}
		return this.getClass().getName() + ": " + s;
	}
	public int size(){
		// What It Does: Returns Size
        // How It Works: Gets current size
		return this.currentSize;
	}
	class Node{
		//  Node: Node class
		public Object data;
		public Node next;
	}
	class MyLinkedListIterator implements MyListIterator{
		//  MyLinkedListIterator: MyLinkedListIterator class implements MyListIterator
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		public MyLinkedListIterator(){
			// What It Does: Instantiate object variables
        	// How It Works: Calls to constructor
			this.position = null;
			this.previous = null;
			this.isAfterNext = false;
		}
		public Object next(){
			// What It Does: Moves Object over
        	// How It Works: If it is null moves it to first
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			this.previous = this.position;
			this.isAfterNext = true;
			
			if(this.position == null){
				this.position = first;
			}
			else{
				this.position = this.position.next;
			}
			return this.position.data;
		}
		public boolean hasNext(){
			// What It Does: Moves Object over
        	// How It Works: If it is null moves it to first
			if(this.position == null){
				return first != null;
			}
			else{
				return this.position.next != null;
			}
		}
		public void add(Object element){
			// What It Does: Adds object
        	// How It Works: Populates postions
			if(this.position == null){
				addFirst(element);
				position = first;
			}
			else{
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = this.position.next;
				this.position.next = newNode;
				this.position = newNode;
			}
			currentSize++;
			this.isAfterNext = false;
		}
		public void remove(){
			// What It Does: Removes object
        	// How It Works: Depopulates postion
			if(!this.isAfterNext){
				throw new NoSuchElementException();
			}
			if(this.position == first){
				removeFirst();
			}
			else{
				this.previous.next = this.position.next;
			}
			this.position = this.previous;
			this.isAfterNext = false;
			currentSize--;
		}
		public void set(Object element){
			// What It Does: Sets oject
        	// How It Works: Populates postions
			if(!this.isAfterNext){
				throw new NoSuchElementException();
			}
			this.position.data = element;
		}
	}
	public static void main(String args[]){
	    // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
		MyLinkedList names = new MyLinkedList();
		names.addFirst("Tom");   
		names.addFirst("Romeo");   
		names.addFirst("Harry");   
		names.addFirst("Dick");   
		MyListIterator iterator = names.listIterator();   
		iterator.next();   
		iterator.next();   
		iterator.remove();   
		iterator.next();   
		iterator.remove();   
		iterator.add("Juliet");   
		iterator.next();   
		iterator.set("Emily");
		names.removeFirst();   
		iterator = names.listIterator();   
		while (iterator.hasNext())      
		System.out.print(iterator.next() + " ");   
		System.out.println();   
		System.out.println("Expected: Juliet Emily");   
		System.out.println(names.size());   
		System.out.println("Expected: 2");   
	}
}
