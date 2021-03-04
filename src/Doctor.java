
public class Doctor {
	protected String name;
	protected int idNumber;
	protected String Address;
	
	Doctor(){
	}
		Doctor(final String str, final int num, final String addr){
			name=str;
			idNumber=num;
			Address=addr;
			
		}
		
		void display() {
			System.out.println("The name is:"+ name);
			System.out.println("The number is:"+ idNumber);
			System.out.println("The Address is:"+ Address);
		}
	}
	


