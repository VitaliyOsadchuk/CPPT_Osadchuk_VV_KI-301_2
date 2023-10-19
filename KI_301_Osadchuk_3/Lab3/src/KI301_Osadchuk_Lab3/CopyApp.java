package KI301_Osadchuk_Lab3;

import java.io.FileNotFoundException;

public class CopyApp {
	public static void main(String[] args) throws FileNotFoundException {
		Copier copier = new Copier();
		copier.connectPowerCordConnector();
		copier.turnOnStartButton();
		copier.turnOnColoredScan();
		copier.putSmthOnTable();
		copier.set_copy(true);
		copier.startCopying(true);
		copier.turnOffColoredScan();
		copier.startCopying(true);
		copier.dispose();
		}
}