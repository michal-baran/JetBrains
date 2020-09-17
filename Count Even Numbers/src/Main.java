import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        File file = new File("./projekt.fml");
        ArrayList<String[]> input = new ArrayList<>();
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();
        String[][] roomTypes = {
                {"#454545", "Duct"},
                {"#B8A689", "Cabinet"},
                {"#BBD1E8", "Bathroom"},
                {"#C7D1C8", "Kitchen"},
                {"#D8A78B", "Bedroom"},
                {"#E4DCC4", "Storage"},
                {"#EEEEEE", "Terrace"},
                {"#F2D6AB", "Living room"},
                {"#F6EAC4", "Office"},
                {"#FCBB5C", "Hall"},
        };

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("<area>")) {
                    scan.nextLine();
                    scan.nextLine();
                    scan.nextLine();
                    input.add(scan.nextLine()
                            .replaceAll("<points>", "")
                            .replaceAll("</points>", "")
                            .replaceAll(",", " ")
                            .split(" "));

                    String[] s = input.get(0);
                    for (int i = 0; i < s.length; i += 6) {
                        X.add(Double.parseDouble(s[i]));
                        Y.add(Double.parseDouble(s[i + 1]));
                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found");
        }

        Area pole1 = new Area(X, Y);
        System.out.println(pole1.getAreaValue());
    }
}
