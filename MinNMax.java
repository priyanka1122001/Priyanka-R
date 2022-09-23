// Java code to demonstrate how to
// extract minimum and maximum number
// in 1 line.
import java.util.Arrays;
//wrp to demo MinNMax program
//PRIYANKA R CG BATCH 2576
import java.util.Collections;
 
public class MinNMax 
{
    public static void main(String[] args)
    {
 
        // Initializing array of integers
        Integer[] num = { 1, 4, 8, 5, 9 };
 
        // using Collections.min() to
        // find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));
 
        // using Collections.max()
        // to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));
 
        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : "
                           + min);
        System.out.println("Maximum number of array is : "
                           + max);
    }
}