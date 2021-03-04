
public class TollBooth {

	public static void main(String[] args) {
		
		TollBooth booth = new TollBooth();
        
        Truck truck1 = new Truck(5, 12500);
        Truck truck2 = new Truck(2, 5000);
        Truck truck3 = new Truck(6, 17000);

       
        booth.calculateToll(truck1);
        booth.displayData();
        booth.calculateToll(truck2);

       
        booth.calculateToll(truck2);
        booth.displayData();
    }


  
    TollBooth() {
        trucksSinceCollection = 0;        
        receiptsSinceCollection = 0;
    }
    void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int totalWeight = truck.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/1000);  
        System.out.print("Truck arrival - axles: ");
        System.out.print(axles);
        System.out.print(" total weight: ");
        System.out.print(totalWeight);
        System.out.print(" Toll due: ");
        System.out.println(tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
    }
    void onReceiptCollection() {
        System.out.print("*** Collecting receipts ***");
        displayData();
        trucksSinceCollection = 0;      
        receiptsSinceCollection = 0;
    }
    void displayData() {
        System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsSinceCollection);
        System.out.print(" Trucks: ");
        System.out.println(trucksSinceCollection);
    }
    
    int receiptsSinceCollection;
    int trucksSinceCollection;
}

class Truck {
    
    Truck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
    }
    int getAxles() {return axles;}
    int getTotalWeight() {return totalWeight;}
   
    int axles;
    int totalWeight;


	

}
