public class Exercise9_2 {
    public static void main(String[] args) {
        Stock java = new Stock("ORCL", "Oracle Corporation");
        java.previousClosingPrice = 34.5;
        java.currentPrice = 34.35;
        System.out.println("The price-change percentage is " +
                (int)(java.getChangePercent() * 1000) / 1000.0 + "%");
    }
}
