public class Candle {
    private String color;
    private double height;
    private double price;
    
    // Constructor
    public Candle(String color, double height) {
        this.color = color;
        this.height = height;
        this.price = height * 2; // $2 per inch
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
        this.price = height * 2; // $2 per inch
    }
    
    // Getter for price
    public double getPrice() {
        return price;
    }
    
    // No setter for price - it's calculated from height
}
