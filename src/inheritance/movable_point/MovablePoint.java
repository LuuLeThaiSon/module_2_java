package inheritance.movable_point;

import inheritance.point.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {}

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + this.getX() +
                ", ySpeed=" + this.getY() +
                '}';
    }
}
