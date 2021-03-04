
class FinalMethod
{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege()
	{
		college="SNIST";
		
	}
	public FinalMethod(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+"" +college);
	}
	


public final {

	public static void main(String[] args)
	{
		class Student200
{
	private int rollno;
	private String name;
	String college="BMS";
	
	public  void changeCollege()
	{
		college="SNIST";
		
	}
	public Student200(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+"" +college);
	}
	
}

}

}
