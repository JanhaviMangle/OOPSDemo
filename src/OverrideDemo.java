
class Bank{
	int getRateOfIntrest() {return 0;}
}
class SBI extends Bank{
	int getRateOfIntrest() {return 8;} 
}
class ICICI extends Bank{
	int getRateOfIntrest() {return 7;}
}
class AXIS extends Bank{
	int getRateOfIntrest() {return 9;}
}
public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out .println("SBI rate of intrest:"+s.getRateOfIntrest());
		System.out .println("ICICI rate of intrest:"+i.getRateOfIntrest());
		System.out .println("AXIS rate of intrest:"+a.getRateOfIntrest());

	}

}
