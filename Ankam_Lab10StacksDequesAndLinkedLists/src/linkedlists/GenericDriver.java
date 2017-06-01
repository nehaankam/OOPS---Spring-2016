package linkedlists;



/**
 * @author Neha Ankam
 */
public class GenericDriver
{

   public static void main(String[] args)   
   {
      GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
      
      intList.addFirst(10);
      intList.addFirst(20);
      intList.addFirst(40);
      intList.removeFirst();
      intList.addFirst(32);
      
      System.out.println("Contents of linked list\n" + 
         (intList.isEmpty()? "list is empty" : intList));
      
      while(!intList.isEmpty())
      {
         System.out.println("Deleting " + intList.removeFirst());
      }
      System.out.println();
      System.out.println("Contents of linked list\n" + 
         (intList.isEmpty()? "list is empty" : intList));
   }
}
