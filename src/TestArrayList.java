import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class TestArrayList {

	
		public static void main(String[] args) {
			List<String> al=new ArrayList<String>();
			
			al.add("jim");
			al.add("michel");
			al.add("james");
			al.add("andy");
			
			Iterator itr = (Iterator) al.iterator();
			while( itr.hasNext())
			{
				System.out.println();
			}
