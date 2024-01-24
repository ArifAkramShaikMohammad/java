package strings;

public class StringReverseTest {
    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Input sentence: " + inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String inputSentence) {
        String[] words = inputSentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
