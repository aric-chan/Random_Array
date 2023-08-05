//********************************************************************
//  RandomArray.java
//  Compute the min, max & avg of array
//********************************************************************
import java.util.*;
public class RandomArray{
    private int[] i;

    //constructor to receive size of array
    public RandomArray (int size) {
        this.i = new int[size];
        for(int k=0;k<i.length;k++){
            Random rn = new Random();
            i[k]= rn.nextInt(size+1);
        }
    }
    // find & return the min of array
    public int minArray (){
        int min=i[0];
        for (int k=0;k<i.length;k++)
            if(i[k]<min)
                min=i[k];
        return min;
    }
    // find & return the max of array
    public int maxArray (){
        int max=i[0];
        for (int k=0;k<i.length;k++)
            if(i[k]>max)
                max=i[k];
        return max;
    }
    // find & return the average of array
    public double avgArray (){
        double sum=0;
        double avg;
        for (int k=0;k<i.length;k++)
            sum+=i[k];
        avg=sum/(i.length);
        return avg;
    }
    //return the element of the array
    public String toString(){
        String result = "The array is ";
        result +="[";
        for(int k=0;k<i.length;k++)
            result += i[k]+" ";
        result +="]";
        return result;
    }
}
