public class ShippingQuote {
    public static void main(String[] args) {
       
        // Package
        double weight = 12.5;   // pounds
        double length = 20.0;   // inches
        double width  = 15.0;   // inches
        double height = 10.0;   // inches

        // Compute required values
        double volume = computeVolume(length, width, height);
        double sizeFactor = computeSizeFactor(volume);
        double finalCost = computeFinalCost(weight, sizeFactor);

        // Output results
        printQuote(volume, sizeFactor, finalCost);
    }



        // METHODS //

        // Calculates volume in cubic inches
    public static double computeVolume(double length, double width, double height) {
        return length * width * height;
    }

        // Computes cube root of volume 
    public static double computeSizeFactor(double volume) {
        return Math.cbrt(volume);
    }

        // Computes final shipping cost
    public static double computeFinalCost(double weight, double sizeFactor) {
        double baseCost = 5.00;
        double weightRate = 0.75;
        double sizeRate = 0.40;

        return baseCost
                + (weight * weightRate) 
                + (sizeFactor * sizeRate);
    }

        // Print shipping quote
    public static void printQuote(double volume, double sizeFactor, double finalCost) {
        System.out.println("----- SHIPPING QUOTE -----");
        System.out.println("Volume: " + volume + " cubic inches");
        System.out.println("Size Factor (cube root): " + sizeFactor);
        System.out.println("Estimated Cost: $" + Math.round(finalCost * 100.0) / 100.0);
    }
}