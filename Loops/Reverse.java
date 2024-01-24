public class Reverse{
    public static void main(String[] args) {

        int inputNumber = 12345;
        int reversedNumber = 0;
        System.out.println("Input: " + inputNumber);

        while (inputNumber != 0) {
            int digit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            inputNumber /= 10;
        }

        System.out.println(" Output: " + reversedNumber);

    }

}
