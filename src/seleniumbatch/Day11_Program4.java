/*4. Write a program to add 5 string objects into Set reference and then print the objects in ascending order using 
'cursors' & 'for each loop'.*/
package seleniumbatch;


import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Day11_Program4 
{
public static void main(String[] args) 
{
	  Set<String> order = new HashSet<>();
	  order.add("AAA");
      order.add("CCC");
      order.add("FFF");
      order.add("BBB");
      order.add("RRR");
      order.add("KKK");
      order.add("DDD");
     
      System.out.println("Before Sorting : Random order\n");
      Iterator<String> strIterator = order.iterator();
      while(strIterator.hasNext()) {
          System.out.println(strIterator.next());
      }
// Iterating using Iterator
      // convert to TreeSet
      TreeSet<String> ts = new TreeSet<String>(order);

      System.out.println("After Sorting using iterator:\n");

     
      Iterator<String> ascSorting = ts.iterator();
      while(ascSorting.hasNext()) 
      {
          System.out.println(ascSorting.next());
      }
//for each loop
      System.out.println("After Sorting using for each loop:\n");
      for(String hs1: order) {
          System.out.println(hs1);
          }
  }
}

