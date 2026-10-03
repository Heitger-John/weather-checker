import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner cin = new Scanner(System.in);
        double maxTemp = cin.nextDouble();
        double minTemp = cin.nextDouble();


        while (cin.hasNextDouble())
        {
            double tempRead = cin.nextDouble();
            if (tempRead >= maxTemp)
            {
                maxTemp = tempRead;
            }
            if (tempRead <= minTemp )
            {
                minTemp = tempRead;
            }

        }
        System.out.println("Max: " + maxTemp);
        System.out.printf("Min: %.2f%n", minTemp);
        cin.close();

    }
}
