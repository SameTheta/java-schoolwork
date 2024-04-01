public class RepresentStocks {
    public static void main(String[] args) {
        Stock stockKeeper = new Stock("ORCL", "Oracle Corporation", 34.5);
        stockKeeper.newPrice(34.35);
        double stockChange = stockKeeper.getChangePercent();

        if (stockChange < 0) {
            System.out.printf("%.5f%% decrease", Math.abs(stockChange));
        } else {
            System.out.printf("%.5f%% increase", Math.abs(stockChange));
        }
    }
}

class Stock {
    // class attributes
    String symbol; // stock symbol
    String name; // stock name
    double previousClosingPrice; // stock price for previous day
    double currentPrice; // price at current time

    Stock(String userSymbol, String userName, double userCPrice) {
        symbol = userSymbol;
        name = userName;
        previousClosingPrice = userCPrice;

    }

    void newPrice(double curPrice) {
        currentPrice = curPrice;
    }

    double getChangePercent() {
        double priceDifference = currentPrice - previousClosingPrice;
        return (priceDifference / Math.abs(previousClosingPrice)) * 100;
    }
}