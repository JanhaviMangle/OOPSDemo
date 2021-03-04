
public class ConstructorDemo {
	
	int id;
	ConstructorDemo()
	{
		System.out.println("In Constructor");
		id=10;
	}
		
		void display()
		{
			System.out.println(id);
			
		}
	

	public static void main(String[] args) {
		
		ConstructorDemo obj1=new ConstructorDemo();//define objects and invokes constructor
		
		ConstructorDemo obj2=new ConstructorDemo();
		obj1.display();
	}

}
