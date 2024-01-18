public class fibno {
    public static void main(String[] args) {

        int inputNumber = 10;
        int p;
        System.out.println("Input: " + inputNumber);
        int f = 0;
        int s = 1;

        for (int i = 0; i < inputNumber; i++) {
            System.out.println(f);
            p = f + s;

            f = s;
            s = p;
        }

    }
}



