public class ReverseArray {
    public static void main(String[] args) {

        int[] a = {4, 2, 9, -3, 5, 1};
        int[] temp = new int[a.length];
        int j = 0;

        // Reverse the array
        for (int i = a.length - 1; i >= 0; i--) {
            temp[j] = a[i];

            j++;
        }
        //a[]=temp[];
        // Print the reversed array with spaces
        System.arraycopy(temp, 0, a, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

