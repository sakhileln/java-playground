package exercise;

import exercise.*;

public class TestPoint3D {
  public static void main(String [] args) {
    Point3D p3A = new Point3D(10, 20, 30);
    System.out.println("p3A: " + p3A.toString());
    p3A.setX(-10), p3A.setY(-20), p3A.setZ(-30);
    System.out.println("Updated p3A: " + p3A.toString());
  }
}
