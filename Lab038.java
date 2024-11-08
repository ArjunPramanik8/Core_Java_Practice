public class MinMaxArray 
    {
    public static void main(String[] args)
     {
        int[] arr = {10, 20, 5, 40, 15};
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
