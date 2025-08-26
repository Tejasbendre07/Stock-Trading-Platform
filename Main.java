package Com.StockTradingPlatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market market = new Market();
        User user = new User("Tejas", 10000.00);

        while (true) {
            System.out.println("\n Stock Trading Platform");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> market.displayMarket();
                case 2 -> {
                    System.out.print("Enter stock symbol: ");
                    String symbol = sc.next();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    Stock stock = market.getStock(symbol);
                    if (stock != null) user.buyStock(stock, qty);
                    else System.out.println("Stock not found.");
                }
                case 3 -> {
                    System.out.print("Enter stock symbol: ");
                    String symbol = sc.next();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    Stock stock = market.getStock(symbol);
                    if (stock != null) user.sellStock(stock, qty);
                    else System.out.println("Stock not found.");
                }
                case 4 -> user.viewPortfolio();
                case 5 -> {
                    System.out.println("Exiting... Happy Trading!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}