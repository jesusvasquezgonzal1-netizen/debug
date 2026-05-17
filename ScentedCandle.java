public class ScentedCandle extends Candle {
    private String scent;
    
    // Constructor
    public ScentedCandle(String color, double height, String scent) {
        super(color, height);
        this.scent = scent;
    }
    
    // Getter for scent
    public String getScent() {
        return scent;
    }
    
    // Setter for scent
    public void setScent(String scent) {
        this.scent = scent;
    }
    
    // Override setHeight to set price at $3 per inch for scented candles
    @Override
    public void setHeight(double height) {
        this.height = height;
        calculatePrice();
    }
    
    // Override calculatePrice to charge $3 per inch for scented candles
    @Override
    protected void calculatePrice() {
        this.price = height * 3; // $3 per inch
    }
}
