public class Profit {
    public static void Calculate(int r, int s) {
        int seats = r * s;
        int profit;

        if (seats < 60) {
            profit = seats * 10;
        } else {
            int half = r / 2;
            profit = (half * 10 + (r - half) * 8) * s;
        }
        System.out.println("Total income:\n$" + profit);
    }
}
