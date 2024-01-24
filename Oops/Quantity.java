public class Quantity {

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("Price for single quantity "+ product.getprice());
        System.out.println("Total Price for given quantity is "+ product.getprice(10));
    }
}