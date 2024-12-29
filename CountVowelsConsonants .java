public class CountVowelsConsonants 
{
    public static void main(String[] args) 
        {
            
        String str = "hello world";
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
            
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
