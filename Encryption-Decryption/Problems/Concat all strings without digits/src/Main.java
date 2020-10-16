import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        var sb = Arrays.stream(strings).collect(Collectors.joining());
        for (int i = 0; i < 10; i++) {
            sb = sb.replaceAll(Integer.toString(i), "");
        }
        return sb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}