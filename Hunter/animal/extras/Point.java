package animal.extras;

public class Point
{
    Point(){}

    public static int getDistance(int[] x1y1 , int[] x2y2)
    {
        int height = x1y1[0] - x2y2[0];
        int base = x1y1[1] - x2y2[1];

        return (height * height) + (base * base);
    }
}
