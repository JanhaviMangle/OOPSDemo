import java.util.Scanner;

class Trainee
{
	int tId;
	String tName;
	String technology;
	float salary;
	float stipend;
	void input()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Id, Name, technology & salary of a trainee :");
		tId=s.nextInt();
		technology=s.next();
		salary=s.nextFloat();
		}
	float calculate()
	{
		stipend= salary-200;
		return stipend;
	}
	void display()
	{
		System.out.println("Trainee details");
		System.out.println("Trainee Id  :"+tId);
		System.out.println("Traine Name :"+tName);
		System.out.println("Technology  :"+technology);
		//System.out.println("Stipend     :"+salary);
	}
	
}

public class TestTraine {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee(); //Creating objects of Trainee class
		Trainee t2=new Trainee();
	
    t1.input();  //Method call
	t2.input();
	
	
	
	
	float s1=t1.calculate();
	float s2=t2.calculate();
	
	t1.display();
	System.out.println("stipend  :"+s1);
	t2.display();
	
	System.out.println("stipend  :"+s2);
	

	}

}
