# Point Package in Java
The Point package is a simple Java implementation demonstrating fundamental Object-Oriented Programming (OOP) concepts, including:
- Classes and Objects
- Instance Methods and Static Methods
- Inheritance
- Aggregation
- Polymorphism
- Encapsulation
- Abstraction

## Usage
1. Clone the repo:
   ```shell
   [~]$ git clone https://github.com/sakhileln/point.git
   ```
2. Change to parent directory:
   ```shell
   [~]$ cd point/
   ```
3. On the command line:
   ```shell
   # Compile the program
   [~/point/]$ javac -d . exercise/TestPoint3D.java
   # Run the program
   [~/point/]$ java exercise.TestPoint3D
   ```


## Classes Overview
### Point2D
- Represents a point in a 2-dimensional space.
**Fields**:
- x (private, int): The x-coordinate.
- y (private, int): The y-coordinate.

**Constructor**:
- Point2D(int x, int y): Initializes the point with specified coordinates.

**Methods**:
- int getX(): Returns the x-coordinate.
- int getY(): Returns the y-coordinate.
- void setX(double x): Sets the x-coordinate.
- void setY(double y): Sets the y-coordinate.
- String toString(): Returns the string representation of the point.

### Point3D (extends Point2D)
- Represents a point in a 3-dimensional space by extending Point2D.
- Additional Field:
  - z (private, int): The z-coordinate.

**Constructor**:
- Point3D(int x, int y, int z): Initializes the point with specified coordinates.
- Additional Methods:
- int getZ(): Returns the z-coordinate.
- void setZ(double z): Sets the z-coordinate.
- double distance(Point3D other): Calculates the distance to another Point3D.
- Overrides toString() to include the z-coordinate.

### Line
- Represents a line defined by two points (aggregation).
**Fields**:
- endPont1 (private, Point2D): The starting point of the line.
- endPoint2 (private, Point2D): The ending point of the line.

**Constructor**:
- Line(Point2D endPoint1, Point2D endPoint2): Initializes the line with two points.

**Methods**:
- Point2D getEndPoint1(): Returns the start point.
- Point2D getEndPoint2(): Returns the end point.
- void setEndPoint1(Point2D p1): Sets the start point.
- void setEndPoint2(Point2D p2): Sets the end point.
- double length(): Calculates the length of the line.
- String toString(): Returns the string representation of the line.
