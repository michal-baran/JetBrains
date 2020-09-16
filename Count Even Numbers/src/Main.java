
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        File file = new File("./dataset_91069.txt");
        ArrayList<String[]> input = new ArrayList<>();

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                input.add(scan.nextLine()
                        .split("\t"));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int[] years = new int[input.size() - 1];
        double[] population = new double[input.size() - 1];
        double maxPopulation = 0;
        int maxYear = 0;

        for (int i = 1; i < input.size() - 1; i++) {
            years[i] = Integer.parseInt((input.get(i)[0]));
            population[i] = Double.parseDouble(input.get(i)[1].replaceAll(",", ""));
            double populationDiff = population[i] - population[i - 1];
            if (i > 1 && populationDiff > maxPopulation) {
                maxPopulation = populationDiff;
                maxYear = years[i];
            }
        }
        System.out.println(maxYear);
    }
}
