import java.util.Scanner;

public class laptopprice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter laptop price: ");
        int laptopPrice = input.nextInt();

        System.out.print("Enter mouse price: ");
        int mousePrice = input.nextInt();

        System.out.print("Enter discount percentage: ");
        int discountPercent = input.nextInt();

        int totalPrice = laptopPrice + mousePrice;
        double discount = (totalPrice * discountPercent) / 100.0;
        double finalPrice = totalPrice - discount;

        System.out.println("Total price before discount: " + totalPrice + " tk");
        System.out.println("Discount: " + discount + " tk");
        System.out.println("Total price after discount: " + finalPrice + " tk");

        input.close();
    }
}
