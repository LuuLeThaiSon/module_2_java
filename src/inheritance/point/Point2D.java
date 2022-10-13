package inheritance.point;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(double v, double v1, double v2) {}

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
