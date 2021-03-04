import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	private String constituency;
	Scanner s;
	
	Person()
	{
		System.out.println("voter eligibility app");
		age=0;
		name="";
		constituency="Benguluru";
		s= new Scanner(System.in);
	}
	
	Person(String n, int a)
	{
		name=n;
		age=a;
	}
		Person(String n, int a, String d)
		{
			name=n;
			age=a;
			constituency=d;
	}
	public void input()
	{
		System.out.println("enter your name");
		name=s.next();
		System.out.println("enter your age");
		age=s.nextInt();
	}
	
	public void print()
	{
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		System.out.println("constituency is:"+ constituency);
	}
}
