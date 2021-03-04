import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		
		s.push("java");
		s.push("C++");
		s.push("C#");
		s.push("Python");

		System.out.println(s);
		
		s.pop();
		
	   
}
}
