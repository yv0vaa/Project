package problem;

import javax.media.opengl.GL2;

public class Circle {
    public Vector2 center;
    public double radius;
    public Circle(Vector2 center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public void render(GL2 gl){
        Figures.myRenderCircle(gl, center, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
