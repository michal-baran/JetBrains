import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String path = "./dataset_91065.txt";
        File file = new File(path);
        int count = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextInt()) {
                int input = scan.nextInt();
                if (input % 2 == 0) {
                    count++;
                }
                if (input == 0) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
        System.out.println(count);
    }
}