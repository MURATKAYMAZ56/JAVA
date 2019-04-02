package linkedList;
import java.util.*;
public class LinkedListLauncher {

	public static void main(String[] args) {
		// Creating object of class linked list 
        LinkedList<String> names = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        names.add("Ali"); 
        names.add("Baba"); 
        names.addLast("Cenk"); 
        names.addFirst("Deli"); 
        names.add(2, "Ercus"); 
        names.add("Faik"); 
        names.add("Guli"); 
        System.out.println("Linked list : " + names); 
        ///////////////// creating Node and examine how to create list and next property/////////////////
        Node head= new Node(4);
        Node nodeB= new Node(5);
        Node nodeC= new Node(2);
        
        head.next=nodeB;
        nodeB.next=nodeC;
        
        //data.next= new Node(6);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        
        
        
	}

}
