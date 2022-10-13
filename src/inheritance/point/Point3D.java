package inheritance.point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
        super(2.0, 4.0, 5.0);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "("
                + getX() + ", "
                + getY() + ", "
                + getZ() + ")";
    }

}
