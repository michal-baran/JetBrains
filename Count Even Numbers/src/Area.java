import java.util.ArrayList;

public class Area {
    ArrayList<Double> X;
    ArrayList<Double> Y;


    public Area(ArrayList<Double> X, ArrayList<Double> Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getAreaValue() {
        double area = 0.0;
        int j = X.size() - 1;
        for (int i = 0; i < X.size(); i++) {
            System.out.println("x" + i + ":" + X.get(i) + " y" + i + ":" + Y.get(i));
            area += (X.get(j) + X.get(i)) * (Y.get(j) - Y.get(i));
            j = i;
        }
        return Math.abs(area / 2.0);
    }
}
