package bai3.entity;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

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
        setX(xSpeed);
        setY(ySpeed);
    }

    public float[] getSpeed() {
        float[] arrSpeed = new float[2];
        arrSpeed[0] = getXSpeed();
        arrSpeed[1] = getYSpeed();
        return arrSpeed;
    }

    public MovablePoint move() {
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
//        x += xSpeed;
//        y += ySpeed;
        return this;
    }
    public MovablePoint reMove() {
        setX(getX()-getXSpeed());
        setY(getY()-getYSpeed());
//        x += xSpeed;
//        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "(x=" + getX() +
                ", y=" + getY() +
                "), xSpeed=(" + xSpeed +
                "," + ySpeed +
                ')';
    }
}
