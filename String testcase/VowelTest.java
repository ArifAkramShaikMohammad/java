package strings;

public class VowelTest {

    public static void main(String[] args) {
        String inputString = "Hello, how are you?";
        int result = countVowels(inputString);
        System.out.println("The number of vowels in the string is: " + result);
    }

    public static int countVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char c : inputString.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}

