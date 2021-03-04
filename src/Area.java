
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

       
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;

      
        Scanner scan = new Scanner(System.in);

       
        System.out.print("Enter length of the rectangle:: ");
        length = scan.nextDouble();
        System.out.print("Enter width of the rectangle:: ");
        width = scan.nextDouble();

      
        area = length * width;

        
        System.out.println("Area of Rectangle = "+ area);

      
        scan.close();

     }
 }