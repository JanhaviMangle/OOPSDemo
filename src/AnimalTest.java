class Animal{
	String name;
	public void eat() {
		
		System.out .println("i can eat");
	
	}
}

class Dog extends Animal{
	
	public void display()
	{
		System.out .println("my name id"+ name);
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog labrador = new Dog();
		
		labrador.name ="Rohu";
		labrador.display();
		labrador.eat();
	}

}
