
public class PersonTest {

	public static void main(String[] args) {
		
		Person objPerson = new Person();//invoke default constructor
		Person objPerson1 = new Person("janhavi", 22);//parameterised constructor
		Person objPerson2 = new Person("janhavi", 22, "Delhi");
		
		objPerson.input();
		objPerson.print();
		
		objPerson1.print();
		objPerson2.print();
	}

}
