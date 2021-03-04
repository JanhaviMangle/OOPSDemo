
public class Employee1 {

	String name, Address;
	int salary;
	int year;
	
	public Employee1(String name, String Address, int salary, int year)
	{
		this.name=name;
		this.Address=Address;
		this.salary=salary;
		this.year=year;
	}
	void display()
	{
		System.out .println(this.name+"\t"+this.Address+"\t"+this.salary+"\t"+this.year);
	}
	
	public static void main(String[] args) {
	     Employee1 e1 = new Employee1("janhavi", "Banglore", 45000, 2018);	
		
        e1.display();
	}

}
