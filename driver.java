//********************************************************************
//  driver.java
//  Compute the min, max & avg of array
//********************************************************************
import java.util.*;

public class driver{
    public static void main(String args[]){
        //prompt user for the size of array
        System.out.println("Enter the array size:");
        Scanner scan = new Scanner(System.in);
        //pass the array value to instantiate RandomArray object
        RandomArray A = new RandomArray(scan.nextInt()) ;
        //print the array
        System.out.println(A);
        //output min,max & avg of array
        System.out.println("The minimum: " + A.minArray());
        System.out.println("The maximum: " + A.maxArray());
        System.out.println("The average: " + A.avgArray());
    }
}
