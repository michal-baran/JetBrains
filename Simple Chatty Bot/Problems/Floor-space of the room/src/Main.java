import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double r;
        double p;
        double area;
        String figure = scanner.nextLine();

        switch (figure) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();

                p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;

            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                area = a * b;
                break;

            case "circle":
                r = scanner.nextInt();
                area = r * r * 3.14;
                break;

            default:
                area = 0;
        }
        System.out.println(area);
    }
}