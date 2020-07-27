class Circle {

    double radius;

    double getLength() {
        return this.radius * 2.0 * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }
}