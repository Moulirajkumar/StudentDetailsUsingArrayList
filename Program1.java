package programsOnArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Program1 
{
	static Scanner sc=new Scanner(System.in);
	public static int id;
	public static String name;
	public static String mail;
	public static long phno;
	public static String studies;
	static ArrayList<Student_Details_Using_ArrayList> al=new ArrayList<Student_Details_Using_ArrayList>();
	
	public static void main(String[] args)
	{
		boolean istrue=true;
		while(istrue)
		{
			System.out.println("\nEnter 1 for Insert");
			System.out.println("Enter 2 for Show the Data");
			System.out.println("Enter 3 for Search");
			System.out.println("Enter 4 for Remove the Data");
			System.out.println("Enter 5 for Remove All the Data");
			System.out.println("Enter 6 for Update the data");
			System.out.println("Enter 7 for Exit");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
				{
					Program1.data();
					al.add(new Student_Details_Using_ArrayList(id,name,mail,phno,studies));
					break;
				}
				case 7:
				{
					System.out.println("Thanks!!!!");
					istrue=false;
					break;
				}
				case 2:
				{
					System.out.println("The Student Details which are presented !!!");
					Program1.print();
					break;
				}
				case 3:
				{
					if(al.isEmpty())
					{
						System.err.println("There is No Details Available in the DataBase");
						System.out.println("Please add Deatils ");
					}
					else
					{
						Program1.findId();
					}
					break;
				}
				case 4:
				{
					if(al.isEmpty())
					{
						System.err.println("There is No Details Available in the DataBase");
						System.out.println("Please add the Deatils ");
					}
					else
					{
						Program1.delete();
					}
					break;
				}
				case 5:
				{
					if(al.isEmpty())
					{
						System.err.println("There is No Details Present in the Data Base");
						System.out.println("Please add the details");
					}
					else
					{
						al.clear();
						System.out.println("The Data is Cleared from the Data Base");
					}
					break;
				}
				case 6:
				{
					Program1.update();
					break;
				}
				default:
				{
					System.out.println("Enter the given Choice");
				}
					
			}
		}
	}
	public static void data()
	{
		System.out.println("Enter the id of an Student: ");
		 id=sc.nextInt();
		System.out.println("Enter the name of the student: ");
		 name=sc.next();
		System.out.println("Enter the mail id: ");
		 mail=sc.next();
		System.out.println("Enter the phone Number: ");
		 phno=sc.nextLong();
		System.out.println("Enter the cource of an student");
		 studies=sc.next();
	}
	public static void print()
	{
		System.out.printf("%10s %20s %30s %20s %10s","ID","NAME","EMAIL-ID","PHONE NUMBER","COURSE");
		for(int i=0;i<al.size();i++)
		{
			System.out.println();
			System.out.format("%10s %20s %30s %20s %10s",al.get(i).getId(),al.get(i).getName(),al.get(i).getMail_id(),al.get(i).getPhone_no(),al.get(i).getStudies());
		}
		
	}
	public static void findId()
	{
		System.out.println("Enter the Student Id to Search");
		int n=sc.nextInt();
		boolean isTrue=false;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getId()==n)
			{
				isTrue=true;
			}
		}
		if(isTrue)
		{
			
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).getId()==n)
				{
					System.out.printf("%10s %20s %30s %20s %10s","ID","NAME","EMAIL-ID","PHONE NUMBER","COURSE");
					System.out.println();
					System.out.format("%10s %20s %30s %20s %10s",al.get(i).getId(),al.get(i).getName(),al.get(i).getMail_id(),al.get(i).getPhone_no(),al.get(i).getStudies());
				}
			}
		}
		else
		{
			System.err.println("There is no Student with Id : "+n);
		}
	}
	public static void delete()
	{
		System.out.println("Enter Student Id to remove form the DataBase: ");
		int n=sc.nextInt();
		boolean isTrue=false;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getId()==n)
			{
				isTrue=true;
			}
		}
		if(isTrue)
		{
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).getId()==n)
				{
					al.remove(i);
					System.out.println("Removed Student Details Successfully");
				}
			}
		}
		else
		{
			System.err.println("There is no Student with Id : "+n);
		}
	}
	public static void update()
	{
		System.out.println("Enter Student ID");
		int n=sc.nextInt();
		boolean isTrue=false;
		int objectPos=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getId()==n)
			{
				objectPos=i;
				isTrue=true;
			}
		}
		if(isTrue)
		{
			System.out.println("How many changes you want: ");
			int changes=sc.nextInt();
			for(int i=0;i<changes;i++)
			{
				System.out.println("Enter 1 to change Student ID");
				System.out.println("Enter 2 to change Student Name");
				System.out.println("Enter 3 to change Student Mail-ID");
				System.out.println("Enter 4 to change Student Phone Number");
				System.out.println("ENter 5 to change Student Course");
				int num=sc.nextInt();
				switch(num)
				{
					case 1:
					{
						System.out.println("Enter the New Student Id");
						int newId=sc.nextInt();
						if(newId==al.get(objectPos).getId())
						{
							System.out.println("You Entered Same Id Which is Already Present in Data Base");
							System.out.println("----------------------------------------------------------");
							System.out.println("Enter new Id");
							newId=sc.nextInt();
							al.get(objectPos).setId(newId);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						else
						{
							al.get(objectPos).setId(newId);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						break;
					}
					case 2:
					{
						System.out.println("Enter the New Student Name");
						String newName=sc.next();
						if(newName.equals(al.get(objectPos).getName()))
						{
							System.out.println("You Entered Same Name Which is Already Present in Data Base");
							System.out.println("----------------------------------------------------------");
							System.out.println("Enter new Name");
							newName=sc.next();
							al.get(objectPos).setName(newName);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						else
						{
							al.get(objectPos).setName(newName);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						break;
					}
					case 3:
					{
						System.out.println("Enter the New Student Mail-ID");
						String newMail=sc.next();
						if(newMail.equals(al.get(objectPos).getMail_id()))
						{
							System.out.println("You Entered Same Mail-ID Which is Already Present in Data Base");
							System.out.println("----------------------------------------------------------");
							System.out.println("Enter new Mail-ID");
							newMail=sc.next();
							al.get(objectPos).setName(newMail);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						else
						{
							al.get(objectPos).setMail_id(newMail);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						
						break;
					}
					case 4:
					{
						System.out.println("Enter the New Student Phone Number");
						long newPhno=sc.nextLong();
						if(newPhno==al.get(objectPos).getPhone_no())
						{
							System.out.println("You Entered Same Name Which is Already Present in Data Base");
							System.out.println("----------------------------------------------------------");
							System.out.println("Enter new Name");
							newPhno=sc.nextLong();
							al.get(objectPos).setPhone_no(newPhno);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						else
						{
							al.get(objectPos).setPhone_no(newPhno);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						break;
					}
					case 5:
					{
						System.out.println("Enter the New Student Course Name");
						String newCourse=sc.next();
						if(newCourse.equals(al.get(objectPos).getStudies()))
						{
							System.out.println("You Entered Same Course Name Which is Already Present in Data Base");
							System.out.println("----------------------------------------------------------");
							System.out.println("Enter new Course Name");
							newCourse=sc.next();
							al.get(objectPos).setStudies(newCourse);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						else
						{
							al.get(objectPos).setStudies(newCourse);
							System.out.println("Updated Successfully!!!!");
							System.out.println("Yahooooo!!");
						}
						break;
					}
					default:
					{
						System.out.println("Please Enter the given Option Only ");
						break;
					}
				}
			}
		}
	}
}
