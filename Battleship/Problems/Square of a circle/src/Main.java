import java.util.Scanner;

class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}

// do not change the interface
interface Measurable {
    double square();
}