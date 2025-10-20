import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        double cost;
        double sum = 0;
        System.out.print("How many items are you purchasing? ");
        int numItems = sc.nextInt();
        // TODO: Use a for loop to read each item's price (double)
        for (int i = 1; i <= numItems; i++)
        {
            System.out.print("Price of item " + i + "? ");
            cost = sc.nextDouble();
            sum += cost;
        }
        System.out.println("Your cart has " + numItems + " items with a total cost of $" + sum);
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
