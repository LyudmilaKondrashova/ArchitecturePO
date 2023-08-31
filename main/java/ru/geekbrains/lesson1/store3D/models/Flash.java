package ru.geekbrains.lesson1.store3D.models;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void rotate(Angle3D angle3D) {
        this.angle.setAngleX(angle3D.getAngleX());
        this.angle.setAngleY(angle.getAngleY());
        this.angle.setAngleZ(angle3D.getAngleZ());
    }

    public void  move(Point3D point3D) {
        this.location.setX(point3D.getX());
        this.location.setY(point3D.getY());
        this.location.setZ(point3D.getZ());
    }

}
