package problem;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GL2GL3;

public class Figures {

    public static void renderPoint(GL2 gl, Point pos, int size) {
        gl.glPointSize(size);
        gl.glBegin(GL.GL_POINTS);
        gl.glVertex2d(pos.x, pos.y);
        gl.glEnd();
    }
    public static void myRenderCircle(GL2 gl, Point center, double radius) {
        gl.glBegin(GL2GL3.GL_LINE_STRIP);
        gl.glColor3d(1, 0, 1);
        for (int i = 0; i <= 50; i++)
            gl.glVertex2d(center.x + Math.cos(Math.PI / 25 * i) * radius, center.y + Math.sin(Math.PI / 25 * i) * radius);
        gl.glEnd();
        renderPoint(gl, center, 5);
    }
}


