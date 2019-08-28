import java.util.*;
abstract class Shape
{
String color;
public Shape()
{
color = "red";
}
public Shape(String color)
{
this.color = color;
}
public String getColor()
{
return color;
}
public void setColor(String color)
{
this.color = color;
}
abstract float getArea();
abstract float getPerimeter();
}

class Circle extends Shape
{
private float radius ;
public Circle()
{
super();
radius = 1.0f;
}
public Circle(float radius)
{
super();
this.radius = radius;
}
public Circle(float radius, String color)
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
return 3.14f * radius * radius;
}
public float getPerimeter()
{
return 2*3.14f*radius;
}
}
class Rectangle extends Shape
{
private float width;
private float length;
public Rectangle()
{
super();
width = 1.0f;
length =1.0f;
}
public Rectangle(float width, float length)
{
super();
this.width = width;
this.length = length;
}
public Rectangle(float width,float length, String color)
{
super(color);
this.width = width;
this.length =length;
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
return length * width;
}
public float getPerimeter()
{
return 2*(length + width);
}
}
class Square extends Shape
{
private float side;
Square()
{
super();
side = 1.0f;
}
Square(float side)
{
super();
this.side = side;
}
Square(float side, String color)
{
super(color);
this.side = side;
}
public float getSide()
{
return side;
}
public void setSide(float side)
{
this.side = side;
}
public float getArea()
{
return side*side;
}
public float getPerimeter()
{
return 4*side;
}
}

public class TestAbstract
{
public static void main (String args[])
{
float dim1,dim2;
String color;
                Shape s[]=new Shape[3];
Scanner det = new Scanner(System.in);
System.out.println("\tCircle");
System.out.print("Enter the radius : ");
dim1 = det.nextFloat();
System.out.print("Enter the colour : ");
color = det.next();
Circle c = new Circle(dim1,color);
                s[0]=c;
System.out.println("\t\tDETAILS");
System.out.println("Radius    : " + c.getRadius());
System.out.println("Color     : " + s[0].getColor());
System.out.println("Area      : " + s[0].getArea());
System.out.println("Perimeter : " + s[0].getPerimeter());
                System.out.println();


System.out.println("\tRectangle");
System.out.print("Enter the width  : ");
dim1 = det.nextFloat();
System.out.print("Enter the length : ");
dim2 = det.nextFloat();
System.out.print("Enter the colour : ");
color = det.next();
Rectangle r = new Rectangle(dim1,dim2,color);
                s[1]=r;
System.out.println("\t\tDETAILS");
System.out.println("Width     :" + r.getWidth());
System.out.println("Length    :" + r.getLength());
System.out.println("Color     :" + s[1].getColor());
System.out.println("Area      :" + s[1].getArea());
System.out.println("Perimeter :" + s[1].getPerimeter());
                System.out.println();
               
                System.out.println("\tSquare");
System.out.print("Enter the side   : ");
dim1 = det.nextFloat();
System.out.print("Enter the colour : ");
color = det.next();
Square sq = new Square(dim1,color);
                s[2]=sq;
System.out.println("\t\tDETAILS");
System.out.println("Side      :" + sq.getSide());
System.out.println("Color     :" + s[2].getColor());
System.out.println("Area      :" + s[2].getArea());
System.out.println("Perimeter :" + s[2].getPerimeter());
        }
       
}