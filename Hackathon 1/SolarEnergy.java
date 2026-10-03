import java.util.Scanner;

public class SolarEnergy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int panelId;
        double energyGenerated;
        int numberOfPanels;
        char systemStatus;

        System.out.print("Enter Panel ID: ");
        panelId = sc.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status (A/I): ");
        systemStatus = sc.next().charAt(0);

        System.out.println("\n--- Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        sc.close();
    }
}