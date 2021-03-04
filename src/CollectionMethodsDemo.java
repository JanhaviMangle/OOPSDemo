
import java.util.*;
 
public class CollectionMethodsDemo
{
    

	public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java For Developers");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    int pos=Collections.binarySearch(al,"Superb");
    System.out.println("The position of \"Superb\" in Arraylist is :"+pos);
    
     Collections.reverse(al);
    System.out.println("List after the Reversing"+ al);

     Collections.swap(al,4,1);
    System.out.println("List after the SWaping"+ al);
    
    Collections.shuffle(al);
    System.out.println("List after the Shuffing"+ al);
    
    ArrayList<String> n=new ArrayList<String>(5);
    n.add("java");
    n.add("fri");
    n.add("de");
    n.add("Ist");
    n.add("Sup");
    
	Collections.copy(n, al);
    System.out.println("List after the copying"+n);
    n=al;
    System.out.println("List after the copying"+n);
    
    ArrayList<String> n1=new ArrayList<String>(5);
    n1.addAll(al);
    System.out.println("n1");
    
    ArrayList<String> n2=new ArrayList<String>(5);
    n2=(ArrayList<String>)al.clone();
    System.out.println("n2");
    }
}
