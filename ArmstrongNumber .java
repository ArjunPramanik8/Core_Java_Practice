public class ArmstrongNumber 
{
    
    public static void main(String[] args) 
    {
        int num = 153, originalNum, remainder, result = 0;
        originalNum = num;
        int n = String.valueOf(num).length();
        
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        }
