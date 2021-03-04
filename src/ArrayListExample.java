
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Book1> list=new ArrayList<Book1>();
		
		Book1 b1=new Book1(101,"let us c","yashwat kanetkar","BPB",8);
		Book1 b2=new Book1(102,"DCN","Forouzan","BPB",5);
		Book1 b3=new Book1(103,"OS","Galvin","BPB",6);
        
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book1 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
