import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box1 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int[] box2 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                box1[i] = sc.nextInt();
            } else {
                if (i >= 3) {
                    box2[i - 3] = sc.nextInt();
                }
            }
        }
        Arrays.sort(box1);
        Arrays.sort(box2);

        boolean bigBox1 = true;
        boolean bigBox2 = true;

        for (int i = 0; i < 3; i++) {
            if (box1[i] >= box2[i]) {
                bigBox2 = false;
            }
            if (box2[i] >= box1[i]) {
                bigBox1 = false;
            }
        }

        if (bigBox1) {
            System.out.println("Box 1 > Box 2");
        }
        if (bigBox2) {
            System.out.println("Box 1 < Box 2");
        }
        if (!bigBox1 && !bigBox2) {
            System.out.println("Incompatible");
        }
    }
}