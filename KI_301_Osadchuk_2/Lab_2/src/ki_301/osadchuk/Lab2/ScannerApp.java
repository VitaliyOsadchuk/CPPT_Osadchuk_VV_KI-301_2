package ki_301.osadchuk.Lab2;
import java.io.*;


public class ScannerApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner();
        scanner.connectPowerCordConnector();
        scanner.connectUSB();
        scanner.turnOffColoredScan();
        scanner.putSmthOnTable();
        scanner.turnOnStartButton();
        scanner.scanning();
        scanner.disconnectPowerCordConnector();
        scanner.turnOnColoredScan();
        scanner.putSmthOnTable();
        scanner.turnOnStartButton();
        scanner.scanning();
        scanner.dispose();
    }
}