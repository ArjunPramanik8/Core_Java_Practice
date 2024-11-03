import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) 
{
        int[] arr = {1, 2, 3, 4, 5};
        int element = 99;
        int position = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }

        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
