import java.util.Arrays;
public class SecondLargest 
{
    public static void main(String[] args)
 {
        int[] arr = {10, 20, 5, 30, 15};
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }
}
