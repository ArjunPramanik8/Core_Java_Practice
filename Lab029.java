import java.util.Arrays;

public class MergeArrays 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        Arrays.sort(merged);
        
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
