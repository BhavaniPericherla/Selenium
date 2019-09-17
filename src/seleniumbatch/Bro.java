
package seleniumbatch;

import java.util.ArrayList;
import java.util.ListIterator;

public class Bro {



	public static void main(String[] args) {
		
		//a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
		ArrayList<String> al=new ArrayList<String>();
		al.add("element1");al.add("element10");al.add("element3");
		al.add("element4");
		
		System.out.println("Updated:"+al);
		//b. Add one more string object(ex: element5) in above ArrayList using ListIterator
		
		ListIterator<String> itr= al.listIterator();
	    while(itr.hasNext()){
		String s=itr.next();
		if(s.equals("element4")){
			itr.add("element5");
		}
		
	}
	System.out.println("Updated1:"+al);
	
		//c. Update the value "element10" with "element2" using ListIterator
		ListIterator<String> itr2= al.listIterator();
		while(itr2.hasNext()){
			String s=itr2.next();
		if(s.equals("element10")){
				itr2.set("element2");
				
			}
			
		}
		System.out.println("Updated2:"+al);
		//d. Delete the value at last position using ListIterator
		/*while(itr.hasPrevious()){
			String s=itr.previous();
			if(s.equals("element5")){
				itr.remove();
			}					
				
		}
		System.out.println("Updated3:"+al);*/
		int k=al.size()-1;
		while(itr.hasPrevious()){
			itr.previous();
			if(itr.previousIndex()+1==k){
				itr.remove();
			}					
			
		}
		
		System.out.println("Updated3:"+al);	
		
	}

}
