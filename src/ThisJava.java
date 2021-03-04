
public class ThisJava {
	
	int instVar;
	
	ThisJava(int instVar){
	this.instVar = instVar;
	System.out .println("this reference =" + this);
	}
	

	public static void main(String[] args) {
		ThisJava obj = new ThisJava(8);
		System.out .println("object reference =" + obj);
		
	}

}
