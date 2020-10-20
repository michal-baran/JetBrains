import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var a = sc.nextBigInteger();
        var b = sc.nextBigInteger();
        var c = sc.nextBigInteger();
        var d = sc.nextBigInteger();

        System.out.println(b.multiply(a.negate()).add(c.subtract(d)));
    }
}