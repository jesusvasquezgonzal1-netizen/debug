public class Candle {
    protected String color;
    protected double height;
    protected double price;
    
    // Constructor
    public Candle(String color, double height) {
        this.color = color;
        this.height = height;
        calculatePrice();
    }
    
    // Getter for color
    public String getColor() {
        return color;
    }
    
    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Getter for height
    public double getHeight() {
        return height;
    }
    
    // Setter for height - also updates price
    public void setHeight(double height) {
        this.height = height;
        calculatePrice();
    }
    
    // Getter for price
    public double getPrice() {
        return price;
    }
    
    // Protected method to calculate price - can be overridden in subclasses
    protected void calculatePrice() {
        this.price = height * 2; // $2 per inch
    }
    
    // No setter for price - it's calculated from height
}
