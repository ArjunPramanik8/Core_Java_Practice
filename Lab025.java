public class CountCharacter 
{
    public static void main(String[] args) 
        {
        String str = "hello world";
        char target = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
