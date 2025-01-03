package exercise;

import exercise.*;

public class Point3D extends Point2D {
  // Static variable
  private static String info = "A 3D point represented by (x,y,z)-coordinates.";

  // Instance vraible:
  private int z;
  
  // Constructor:
  public Point3D(int xCord, int yCord, int zCord) {
    super(xCord, yCord);
    z = zCord;
  }

  // Instance methods:
  public int getZ()             { return z; }
  public void setZ(int zCord)   { z = zCord; }
  @Override
  public String toString() {
    return "(" + getX() + "," + getY() + "," + getZ() + ")"; //Format: (x,y,z)
  }

  // Static methods:
  public static double distance(Point3D p1, Point3D p2) {
    int dx = p1.getX() - p2.getX();
    int dy = p1.getY() - p2.getY();
    int dz = p1.getZ() - p2.getZ();
    return Math.sqrt(dx*dx + dy*dy + dz*dz);
  }
  public static void showInfo() { System.out.println(info); }
}
