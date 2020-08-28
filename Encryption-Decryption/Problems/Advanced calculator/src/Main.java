import java.util.Arrays;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] numbers = new int[args.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(numbers);

        switch (operator) {
            case "MAX":
                System.out.println(numbers[numbers.length - 1]);
                break;
            case "MIN":
                System.out.println(numbers[0]);
                break;
            case "SUM":
                int sum = 0;
                for (int value : numbers) {
                    sum += value;
                }
                System.out.println(sum);
                break;
            default:
                break;
        }
    }
}