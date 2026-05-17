import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create a regular Candle
        System.out.print("Enter a color for the candle >> ");
        String candleColor = input.nextLine();
        
        System.out.print("Enter a height in a whole number of inches >> ");
        double candleHeight = input.nextDouble();
        input.nextLine(); // Consume newline
        
        Candle candle = new Candle(candleColor, candleHeight);
        
        // Create a ScentedCandle
        System.out.print("Enter a color for the scented candle >> ");
        String scentedColor = input.nextLine();
        
        System.out.print("Enter a height in a whole number of inches >> ");
        double scentedHeight = input.nextDouble();
        input.nextLine(); // Consume newline
        
        System.out.print("Enter a scent. Choose from the following:\n");
        System.out.print("gardenia, beach, pine, carnation     >> ");
        String scent = input.nextLine();
        
        ScentedCandle scentedCandle = new ScentedCandle(scentedColor, scentedHeight, scent);
        
        // Display the candles
        System.out.println("The " + (int)candle.getHeight() + " inch " + candle.getColor() + 
                           " candle costs $" + candle.getPrice());
        System.out.println("The " + (int)scentedCandle.getHeight() + " inch " + scent + " " + 
                           scentedCandle.getColor() + " candle costs $" + scentedCandle.getPrice());
        
        input.close();
    }
}
