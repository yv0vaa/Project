package problem;

public class Vector2
{
    double x;
    double y;
    public Vector2(double x, double y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}