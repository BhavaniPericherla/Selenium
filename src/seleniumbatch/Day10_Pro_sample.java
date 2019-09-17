package seleniumbatch;

import java.util.ArrayList;
public class Day10_Pro_sample {

public static void main(String[] args) 
	{
	Vendor v1=new Vendor(101,"MovieAd");
	Vendor v2=new Vendor(102,"Cinemark");
	Vendor v3=new Vendor(103,"Massergy");
	Vendor v4=new Vendor(104,"Harte-hanks");
	ArrayList<Vendor> al1 = new ArrayList<Vendor>();
	al1.add(v1);
	al1.add(v2);
	al1.add(v3);
	al1.add(v4);
	ArrayList<Vendor> al2 = new ArrayList<Vendor>();
	al2.addAll(al1);
	al2.add(v3);
	al2.add(v4);
	
	System.out.println(al2.contains(v1));  //true
	System.out.println(al2.containsAll(al1));//true
	System.out.println("Size is: "+al2.size());
	/*//removing v1 object from al2
	//al2.remove(v1);
	/*System.out.println(al2.contains(v1)); //false
	System.out.println(al2.containsAll(al1));//false
	System.out.println(al2.removeAll(al1));
	//System.out.println(al2.retainAll(al1));
*/		
	//to retrieve the data from al2
	for(Vendor v:al1)

		System.out.println(v.vendorID+"---"+v.vendorName);	
	}
}
class Vendor{

	int vendorID;

	String vendorName;

	Vendor(int vendorID, String vendorName){

		this.vendorID=vendorID;

		this.vendorName=vendorName;

	}

}