package Com.StockTradingPlatform;

import java.util.*;

public class Market {
    private List<Stock> stocks = new ArrayList<>();

    public Market() {
        stocks.add(new Stock("INFY", 1450.75));
        stocks.add(new Stock("TCS", 3300.50));
        stocks.add(new Stock("RELIANCE", 2500.00));
    }

    public void displayMarket() {
        System.out.println(" Market Data:");
        for (Stock stock : stocks) {
            System.out.println(stock.getSymbol() + " - ₹" + stock.getPrice());
        }
    }

    public Stock getStock(String symbol) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equalsIgnoreCase(symbol)) return stock;
        }
        return null;
    }
}