import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double item1Price;
        double item2Price;
        double item3Price;

        System.out.print("Enter the price of item 1: $");
        item1Price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int item1Quantity = scanner.nextInt();

        System.out.print("Enter the price of item 2: $");
        item2Price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        int item2Quantity = scanner.nextInt();

        System.out.print("Enter the price of item 3: $");
        item3Price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 3: ");
        int item3Quantity = scanner.nextInt();

        double totalPrice = (item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity);

        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}
