import java.util.*;

class Shape
{
  protected String color;
  public Shape()
  {
    this.color = "red";
  }
  public Shape( String color )
  {
    this.color = color;
  }
  public String getColor()
  {
    return color;
  }
  public void setColor( String color )
  {
    this.color = color;
  }
}

class Circle extends Shape
{
  protected float radius;
  public Circle()
  {
    radius = 1.0f;
  }
  public Circle(float radius)
  {
    this.radius = radius;
  }
  public Circle(float radius, String color )
  {
    super(color);
    this.radius = radius;
  }
  public float getRadius()
  {
    return radius;
  }
  public void setRadius(float radius)
  {
    this.radius = radius;
  }
  public float getArea()
  {
    return 3.14f*radius*radius;
  }
  public float getPerimeter()
  {
    return 2f*3.14f*radius;
  }
}

class Rectangle extends Shape
{
  protected float width;
  protected float length;
  public Rectangle()
  {
    width = 1.0f;
    length = 1.0f;
  }
  public Rectangle(float width, float length)
  {
    this.width = width;
    this.length = length;
  }
  public Rectangle(float width, float length, String color)
  {
    super(color);
    this.width = width;
    this.length = length;
  }
  public float getWidth()
  {
    return width;
  }
  public void setWidth(float width)
  {
    this.width = width;
  }
  public float getLength()
  {
    return length;
  }
  public void setLength(float length)
  {
    this.length = length;
  }
  public float getArea()
  {
    return length*width;
  }
  public float getPerimeter()
  {
    return (2*length+2*width);
  }
}

class Square extends Rectangle
{
  public Square()
  {
    super();
  }
  public Square(float side)
  {
    super( side, side);
  }
  public Square(float side, String color)
  {
    super( side, side, color);
  }
  public float getSide()
  {
    return getLength();
  }
  public void setSide(float side)
  {
    setLength(side);
    setWidth(side);
  }
}

public class TestShape
{
  public static void main( String args [])
  {
    float radius, length, width, side;
    String color;
    Scanner in = new Scanner(System.in);
    System.out.println("\nCircle Object C1 : ");
    System.out.println("Default Constructor Call \n");
    Circle C1 = new Circle();
    System.out.println("Radius    : "+ C1.getRadius());
    System.out.println("Area      : "+ C1.getArea());
    System.out.println("Perimeter : "+ C1.getPerimeter());
    System.out.println("Color     : "+ C1.getColor());

    System.out.println("\nCircle Object C2 : ");
    System.out.println("Enter New Radius of Circle: ");
    radius = in.nextFloat();
    Circle C2 = new Circle(radius);
    System.out.println("Radius    : "+ C2.getRadius());
    System.out.println("Area      : "+ C2.getArea());
    System.out.println("Perimeter : "+ C2.getPerimeter());
    System.out.println("Color     : "+ C2.getColor());

    System.out.println("\nCircle Object C3 : ");
    System.out.println("Enter New Radius of Circle : ");
    radius = in.nextFloat();
    System.out.println("Enter New Color of Circle : ");
    color = in.next();
    Circle C3 = new Circle(radius, color);
    System.out.println("\nRadius    : "+ C3.getRadius());
    System.out.println("Area      : "+ C3.getArea());
    System.out.println("Perimeter : "+ C3.getPerimeter());
    System.out.println("Color     : "+ C3.getColor());

    System.out.println("\n\nRectangle Object R1");
    System.out.println("Default Constructor Call ");
    Rectangle R1 = new Rectangle();
    System.out.println("Length    : "+ R1.getLength());
    System.out.println("Width     : "+ R1.getWidth());
    System.out.println("Area      : "+ R1.getArea());
    System.out.println("Perimeter : "+ R1.getPerimeter());
    System.out.println("Color     : "+ R1.getColor());
    System.out.println();

    System.out.println("\nRectangle Object R2");
    System.out.println("Enter New Length of Rectangle : ");
    length = in.nextFloat();
    System.out.println("Enter New width of Rectangle : ");
    width = in.nextFloat();
    Rectangle R2 = new Rectangle(length, width);
    System.out.println("\nLength    : "+ R2.getLength());
    System.out.println("Width     : "+ R2.getWidth());
    System.out.println("Area      : "+ R2.getArea());
    System.out.println("Perimeter : "+ R2.getPerimeter());
    System.out.println("Color     : "+ R2.getColor());
    System.out.println();

    System.out.println("\nRectangle Object R3");
    System.out.println("Enter New Length of Rectangle : ");
    length = in.nextFloat();
    System.out.println("Enter New width of Rectangle : ");
    width = in.nextFloat();
    System.out.println("Enter New Color of Rectangle : ");
    color = in.next();
    Rectangle R3 = new Rectangle(length, width, color);
    System.out.println("\nLength    : "+ R3.getLength());
    System.out.println("Width     : "+ R3.getWidth());
    System.out.println("Area      : "+ R3.getArea());
    System.out.println("Perimeter : "+ R3.getPerimeter());
    System.out.println("Color     : "+ R3.getColor());
    System.out.println();

    System.out.println("\n\nSquare obj S1 ");
    System.out.println("Default Constructor Call ");
    System.out.println();
    Square S1 = new Square();
    System.out.println("Side      :"+ S1.getSide());
    System.out.println("Area      :"+ S1.getArea());
    System.out.println("Perimeter :"+ S1.getPerimeter());
    System.out.println("Color     :"+ S1.getColor());
    System.out.println();

    System.out.println("\nSquare obj S2 ");
    System.out.println("Enter New Side of Square : ");
    side = in.nextFloat();
    Square S2 = new Square(side);
    System.out.println("Side      :"+ S2.getSide());
    System.out.println("Area      :"+ S2.getArea());
    System.out.println("Perimeter :"+ S2.getPerimeter());
    System.out.println("Color     :"+ S2.getColor());
    System.out.println();

    System.out.println("\nSquare obj S3 ");
    System.out.println("Enter New Side of Square: ");
    side = in.nextFloat();
    System.out.println("Enter New Color of Square: ");
    color = in.next();
    Square S3 = new Square(side, color);
    System.out.println("Side      : "+ S3.getSide());
    System.out.println("Area      : "+ S3.getArea());
    System.out.println("Perimeter : "+ S3.getPerimeter());
    System.out.println("Color     : "+ S3.getColor());
  }
}