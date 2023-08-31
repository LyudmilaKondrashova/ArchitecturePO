package ru.geekbrains.lesson1.store3D.models;

public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle3D) {
        this.location = location;
        this.angle = angle3D;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle3D() {
        return angle;
    }

    public void setAngle3D(Angle3D angle3D) {
        this.angle = angle3D;
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
