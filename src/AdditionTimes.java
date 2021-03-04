
public class AdditionTimes {
	double hour;
	double minute;
	double second;
	
public AdditionTimes(double h, double m, double s) 
	
	{
		hour=h;
		minute=m;
		second=s;
	}
	void add(AdditionTimes obj2)
	{
		this.hour += obj2.hour;
		this.minute += obj2.minute;
		this.second += obj2.second;
		
		
	
}
	void check() {
        if(this.second>=60)
        {
            this.minute+=1;
            this.second=this.second-60;
        }
        if(this.minute>=60)
        {
            this.hour+=1;
            this.minute=this.minute-60;
        }
        if(this.hour>12)
        {
            
            this.hour=this.hour-12;
        }
    }
    void display() {
        System.out.print("Addition is: ");
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AdditionTimes obj1=new AdditionTimes(10,45,60);
        AdditionTimes obj2=new AdditionTimes(3,55,5);        
        
        obj1.add(obj2);
        obj1.check();
        obj1.display();
        

}
}