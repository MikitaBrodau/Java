package classes;

/* Task 7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.  */
public class Triangle {
    private final double a;
    private final double b;
    private final double c;
    private double median;
    private double perimeter;
    private double square;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateMedian(Triangle triangle) {
        this.median = Math.sqrt((2 * Math.pow(triangle.a, 2)) + (2 * Math.pow(triangle.b, 2)) - (Math.pow(triangle.c, 2))) / 2;
    }

    public void calculatePerimeter(Triangle triangle) {
        this.perimeter = (triangle.a + triangle.b + triangle.c) / 2;
    }

    public void calculateSquare(Triangle triangle) {
        this.square = Math.sqrt(triangle.perimeter * (triangle.perimeter - triangle.a)
                * (triangle.perimeter - triangle.b) * (triangle.perimeter - triangle.c));
    }

    @Override
    public String toString() {
        return "Triangle " + " a = " + a + ", b = " + b + ", c = " + c
                + "\nmedian = " + median + "\nperimeter = " + perimeter + "\nsquare = " + square;
    }
}
