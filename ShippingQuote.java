public class ShippingQuote {
    public static void main(String[] args) {
       
        // Package definition 
        double weight = 12.5;   // pounds
        double length = 20.0;   // inches
        double width  = 15.0;   // inches
        double height = 10.0;   // inches

        // Compute required values
        double volume = computeVolume(length, width, height);
    }



        // METHODS //

        // Calculates volume in cubic inches
    public static double computeVolume(double length, double width, double height) {
        return length * width * height;
 
    }
}