package Com.StockTradingPlatform;

import java.time.LocalDateTime;

public class Transaction {
    public enum Type { BUY, SELL }

    private String stockSymbol;
    private int quantity;
    private double pricePerUnit;
    private Type type;
    private LocalDateTime timestamp;

    public Transaction(String stockSymbol, int quantity, double pricePerUnit, Type type) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public String getStockSymbol() {
    	return stockSymbol;
    	}
    public int getQuantity() {
    	return quantity; 
    	}
    public double getPricePerUnit() {
    	return pricePerUnit;
    	}
    public Type getType() { 
    	return type;
    	}
    public LocalDateTime getTimestamp() {
    	return timestamp; 
    	}

    @Override
    public String toString() {
        return type + " " + quantity + " shares of " + stockSymbol +
               " @ ₹" + pricePerUnit + " on " + timestamp;
    }
}