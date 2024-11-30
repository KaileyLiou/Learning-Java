package java102;

public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point translateX(double t)
    {
        return new Point(x + t, y);
    }

    public Point translateY(double t) {
		return new Point(x, y + t);
	}

    public String toString() {
		return "(" + x + ", " + y + ")";
	}

    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

    public static Point centerOfMass(Point[] points)
    {
        double sumOfX = 0;
        double sumOfY = 0;

        for (int i = 0; i < points.length; i++)
        {
            sumOfX += points[i].x;
            sumOfY += points[i].y;
        }

        double avgOfX = sumOfX / points.length;
        double avgOfY = sumOfY / points.length;
    
        return new Point(avgOfX, avgOfY);
    }

    public double angle()
    {
        double angleInRadians = Math.atan2(y, x);
        double angleInDegrees = Math.toDegrees(angleInRadians);
        
        return angleInDegrees;
    }
}
