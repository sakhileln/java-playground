package exercise;

class Exercise {
  public static void main(String[] args) {
    Point2D p1 = new Point2D(1, -3);
    System.out.println(p1.toString());
    p1.setX(4);
    p1.setY(2);
    System.out.println(p1.toString());
  }
}

public class Point2D {
  // Class member variables
  
  // Static variable:
  private static String info = "A 2D point represented by (x,y)-coordinate format.";

  // Insance variable:
  private int x;
  private int y;
  
  // Constructor
  public Point2D(int xCord, int yCord) {
    x = xCord;
    y = yCord;
  }

  // Instance Methods:
  public int getX()             { return x; }
  public int getY()             { return y; }
  public void setX(int xCord)  { x = xCord; }
  public void setY(int yCord)  { y = yCord; }
  public String toString()    { return "(" + x + "," + y + ")"; }

  // Static methods:
  public static double distance(Point2D p1, Point2D p2) {
    double dx = p1.x - p2.x;
    double dy = p1.y - p2.y;
    double res = Math.sqrt(dx*dx + dy*dy);
    return res;
  }
  public static void showInfo() { System.out.println(info); }
}
