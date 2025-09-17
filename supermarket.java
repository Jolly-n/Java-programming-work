import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of different items: ");
        int n = sc.nextInt();

        String[] itemName = new String[n];
        double[] price = new double[n];
        int[] quantity = new int[n];
        double[] subtotal = new double[n];

        double totalBill = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");
            System.out.print("Item name: ");
            itemName[i] = sc.next();

            System.out.print("Price per unit: ");
            price[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();

            subtotal[i] = price[i] * quantity[i];
            totalBill += subtotal[i];
        }

      
        double discount = 0;
        if (totalBill > 5000) {
            discount = totalBill * 0.05;
        }
        double finalAmount = totalBill - discount;

        
        System.out.println("\n========== SUPERMARKET RECEIPT ==========");
        System.out.println("Item       Qty   Price/Unit   Subtotal");
        System.out.println("----------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(itemName[i] + "    " + quantity[i] + "    " + price[i] + "    " + subtotal[i]);
        }

        System.out.println("----------------------------------------");
        System.out.println("Grand Total: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Amount Payable: " + finalAmount);
        System.out.println("========================================");

        sc.close();
    }
}

