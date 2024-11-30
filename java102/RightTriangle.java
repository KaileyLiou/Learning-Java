package java102;

public class RightTriangle implements Shape {
    public enum Corner {
        BOTTOM_LEFT, TOP_LEFT, BOTTOM_RIGHT, TOP_RIGHT
    }

    private final Corner corner;
    private final double sideA;
    private final double sideB;

    public RightTriangle(Corner corner, double sideA, double sideB) {
        this.corner = corner;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return sideA + sideB + hypotenuse;
    }

    @Override
    public String toString() {
        return "RightTriangle(corner: " + corner + ", sideA: " + sideA + ", sideB: " + sideB + ")";
    }

    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double ratio1 = t1.sideA / t2.sideA;
        double ratio2 = t1.sideB / t2.sideB;
        return Math.abs(ratio1 - ratio2) < 1e-6;
    }

    public Corner getCorner() {
        return corner;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}