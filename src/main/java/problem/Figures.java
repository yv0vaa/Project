package problem;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GL2GL3;

public class Figures {

    public static void renderPoint(GL2 gl, Vector2 pos, int size) {
        gl.glBegin(GL.GL_POINTS);
        gl.glPointSize(size);
        gl.glVertex2d(pos.x, pos.y);
        gl.glEnd();
    }

    public static void renderLine(GL2 gl, Vector2 pos1, Vector2 pos2, int size) {
        gl.glBegin(GL2GL3.GL_LINES);
        gl.glPointSize(size);
        gl.glVertex2d(pos1.x, pos1.y);
        gl.glVertex2d(pos2.x, pos2.y);
        gl.glEnd();
    }

    public static void renderTriangle(GL2 gl, Vector2 pos1, Vector2 pos2, Vector2 pos3, boolean filled) {
        if (filled) {
            gl.glBegin(GL.GL_TRIANGLES);
            gl.glVertex2d(pos1.x, pos1.y);
            gl.glVertex2d(pos2.x, pos2.y);
            gl.glVertex2d(pos3.x, pos3.y);
            gl.glEnd();
        } else {
            gl.glBegin(GL.GL_LINE_STRIP);
            gl.glVertex2d(pos1.x, pos1.y);
            gl.glVertex2d(pos2.x, pos2.y);
            gl.glVertex2d(pos3.x, pos3.y);
            gl.glEnd();
        }
    }

    public static void renderQuad(GL2 gl, Vector2 pos1, Vector2 pos2, Vector2 pos3, Vector2 pos4, boolean filled) {
        if (filled) {
            gl.glBegin(GL2GL3.GL_QUADS);
            gl.glVertex2d(pos1.x, pos1.y);
            gl.glVertex2d(pos2.x, pos2.y);
            gl.glVertex2d(pos3.x, pos3.y);
            gl.glVertex2d(pos4.x, pos4.y);
            gl.glEnd();
        } else {
            gl.glBegin(GL.GL_LINE_STRIP);
            gl.glVertex2d(pos1.x, pos1.y);
            gl.glVertex2d(pos2.x, pos2.y);
            gl.glVertex2d(pos3.x, pos3.y);
            gl.glVertex2d(pos4.x, pos4.y);
            gl.glEnd();
        }
    }
    public static void renderCircle1(GL2 gl, double posX, double posY, double rad, boolean filled) {
        if (filled) {

            gl.glColor3d(1, 1, 0);
            gl.glBegin(GL.GL_TRIANGLE_FAN);

            gl.glVertex2d(posX, posY);

            for (int i = 0; i <= 50; i++) {
                double ugol = Math.toRadians(i * (360.0 / 50));

                double x = posX + rad * Math.cos(ugol);
                double y = posY + rad * Math.sin(ugol);

                gl.glVertex2d(x, y);
            }

            gl.glEnd();
        } else {
            gl.glColor3d(0, 1, 0);
            gl.glBegin(GL.GL_LINE_STRIP);

            for (int i = 0; i <= 50; i++) {
                double ugol = Math.toRadians(i * (360.0 / 50));

                double x = posX + rad * Math.cos(ugol);
                double y = posY + rad * Math.sin(ugol);

                gl.glVertex2d(x, y);
            }

            gl.glEnd();
        }
    }

    public static void myRenderCircle(GL2 gl, Vector2 center, double radius) {
            gl.glBegin(GL2GL3.GL_LINE_STRIP);
            for (int i = 0; i <= 50; i++) gl.glVertex2d(center.x + Math.cos(Math.PI / 25 *i)*radius, center.y + Math.sin(Math.PI / 25 *i)*radius);
            gl.glEnd();
        }
}


