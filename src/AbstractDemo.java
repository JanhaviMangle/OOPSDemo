abstract class animal1
{
abstract void makeSound();

public void eat()
{
	System.out.println("i can eat");
}
}
class Dog1 extends animal1
{
	public void makesound()
	{
		System.out .println("bark bark");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Dog1 d1=new Dog1();
		d1.makesound();
		d1.eat();
	}

}
