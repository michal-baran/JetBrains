import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int triplets = 0;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //check if values are triplets
        for (int i = 0; i < size - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] + 2 == array[i + 2]) {
                triplets++;
            }
        }
        System.out.println(triplets);
    }
}