package programsOnArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program2Compaire_Swap 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al2.add(1);
		al2.add(2);
		al2.add(3);
		//al2.add(4);
		//Comparing
		System.out.println(al1.equals(al2));
		//Swapping
		System.out.println("Swaping Before Elements");
		System.out.println(al1);
		System.out.println("After Swaping Elements");
		Collections.swap(al1, 1, 2);
		System.out.println(al1);
		//Iteration 
		Iterator<Integer> list=al1.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		//Trimming
		System.out.println(al2.size());
		al2.trimToSize();
		System.out.println(al2.size());
		//Shuffling ArrayList
		Collections.shuffle(al1);
		System.out.println(al1);
		//Reversing an ArrayList
		Collections.reverse(al2);
		System.out.println(al2);
		//Sorting In Revese
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
	}
}
