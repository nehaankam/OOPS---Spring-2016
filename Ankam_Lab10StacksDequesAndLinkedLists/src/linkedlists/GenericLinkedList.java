/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Neha Ankam
 */
public class GenericLinkedList <E> {
    private Node<E> listStart;
   private int listLength;
   
    /**
	 * Constructor
	 * Creates an empty linked list with the head of the list
     * pointing to null.
	 * Initializes the length of the list to 0.
	 */
public GenericLinkedList()
   {
       listStart = null;
       listLength = 0;
   }
   
    /**
	 * Returns true if the list is empty; false otherwise.
	 * @return true if the list is empty; false otherwise.
	 */
   public boolean isEmpty()
   {
       if(listStart == null)
      return true;
       else
           return false;
   }
    /**
	 * Adds an object to the beginning of the list.
	 * @param myObject The object to be added to the beginning
	 * of the list.
	 */
   public void addFirst(E myObject)
   {
    Node<E> newNode = new Node(myObject);
      newNode.nextNode = listStart;
      listStart = newNode;
      listLength++;
    
   }
    /**
	 * Removes the first object from the list.
	 * @return the node that was removed from the list.
	 * @throws NoSuchElementException if the list is empty
	 */
   public Node<E> removeFirst()
   {
	 if(this.isEmpty())
      {
         throw new NoSuchElementException("The list is empty.");
      }
      Node<E> temp = listStart;
      listStart = listStart.nextNode;
      listLength--;
      return temp;

   }
    /**
	 * Returns the number of nodes in the list.
	 * @return the number of nodes in the list.
	 */
   public int size()
   {
      return listLength;
   }
    /**
	 * Returns a string representation of the linked list.
	 * The string representation consists of each node in the
	 * list, printed using the toString method of the Node
	 * class, with each node printed on a new line.
	 * @return a string representation of the linked list.
	 */
   @Override
   public String toString()
   {
      String str = "";
      
      Node<E> currentNode = listStart;
      while(currentNode != null)
      {
         str+= currentNode.toString() + "\n";
         currentNode = currentNode.nextNode;
      }
      
      return str;

   }

}
