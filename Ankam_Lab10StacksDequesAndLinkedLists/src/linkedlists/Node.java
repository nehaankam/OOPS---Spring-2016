package linkedlists;


/**
 * @author Neha Ankam
 * @param <E>
 */
public class Node<E>
{
   E data;
   Node<E> nextNode;
   
   public Node(E data)
   {
      this.data = data;
      nextNode=null;
   }
   
   @Override
   public String toString()
   {
      return data.toString();
   }
}
