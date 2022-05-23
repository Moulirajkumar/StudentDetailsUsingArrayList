package programsOnArrayList;

import java.util.ArrayList;

public class Program3AddTwoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al1=new ArrayList<Integer>();
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.addAll(al1);
		System.out.println(al2);
		
	}
}
