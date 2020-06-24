import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int actualBridgeHeight;
        boolean willCrash = false;
        int bridgeCounter = 0;

        while (bridgeCounter < bridges) {
            bridgeCounter++;
            actualBridgeHeight = scanner.nextInt();
            if (actualBridgeHeight > busHeight) {
                continue;
            } else {
                willCrash = true;
                break;
            }
        }
        if (willCrash) {
            System.out.println("Will crash on bridge " + bridgeCounter);
        } else {
            System.out.println("Will not crash");
        }
    }
}