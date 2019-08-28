import java.util.*;
class Person
{
  private int aadhar;
  private String name, address;
  private char gender;
  public Person(int aadhar, String name, String address, char gender)
  {
    this.aadhar = aadhar;
    this.name = name;
    this.address = address;
    this.gender = gender;
  }
  public String getName()
  {
    return name;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  public char getGender()
  {
    return gender;
  }
}


class Student extends Person
{
  private String program;
  private int year;
  private float totalmark;
  public Student( int aadhar, String name, String address, char gender, String program, int year, float total)
  {
    super(aadhar, name, address, gender);
    this.program = program;
    this.year = year;
    this.totalmark = total;
  }
  public String getProgram()
  {
    return program;
  }
  public int getYear()
  {
    return year;
  }
  public void setYear(int year)
  {
    this.year = year;
  }
  public float getTotal()
  {
    return totalmark;
  }
  public void setTotal(float tot)
  {
    this.totalmark = tot;
  }
  public float calGPA()
  {
    if(totalmark == 100)
      return 10.0f;
    else if(totalmark > 90)
      return 9.0f;
    else if(totalmark > 80)
      return 8.0f;
    else if(totalmark > 70)
      return 7.5f;
    else
      return 5.0f;
  }
}

class Faculty extends Person
{
  private String designation;
  private String department;
  private float basicpay;
  public Faculty(int aadhar, String name, String address, char gender, String designation, String dept, float pay )
  {
    super(aadhar, name, address, gender);
    this.designation = designation;
    this.department = department;
    this.basicpay = pay;
  }
  public String getDesig()
  {
    return designation;
  }
  public void setDesig(String desig)
  {
    this.designation = desig;
  }
  public void setBasic(float basic)
  {
    this.basicpay = basic;
  }
  public float getBasic()
  {
    return basicpay;
  }
  public float calSalary()
  {
    float gross,ded;
    gross = basicpay + 0.6f*basicpay + 0.1f*basicpay;
    ded = 0.085f*basicpay + 0.08f*basicpay;
    return gross-ded;
  }
}

public class TestInheritance{
  public static void main (String args[]){
    Scanner in = new Scanner(System.in);
    String name, address, program, designation, dept;
    int aadhar, year;
    char gender;
    float totalmark, bp;
    System.out.println("Class : Student ");
    System.out.print("Enter Student Name : ");
    name = in.next();
    System.out.print("Enter Student Address : ");
    in.nextLine();
    address = in.nextLine();
    System.out.print("Enter Student Gender ( M / F ) : ");
    gender = in.next().charAt(0);
    System.out.print("Enter Student Aadhar : ");
    aadhar = in.nextInt();
    System.out.print("Enter Student Program : ");
    program = in.next();
    System.out.print("Enter Student Year : ");
    year = in.nextInt();
    System.out.print("Enter Total Mark : ");
    totalmark = in.nextInt();
    Student S = new Student(aadhar, name, address, gender, program, year, totalmark);
    System.out.println("Name       : "+ S.getName());
    System.out.println("Address    : "+ S.getAddress());
    System.out.println("Gender     : "+ S.getGender());
    System.out.println("Program    : "+ S.getProgram());
    System.out.println("Total Mark : "+ S.getTotal());
    System.out.println("GPA        : "+ S.calGPA());

    System.out.print("\nEnter New Student Year : ");
    year = in.nextInt();
    S.setYear(year);
    System.out.print("Enter New Student Total: ");
    totalmark = in.nextFloat();
    S.setTotal(totalmark);
    System.out.print("Enter New Student Address : ");
    in.nextLine();
    address = in.nextLine();
    S.setAddress(address);
    System.out.println("\nNew Student Year : "+ S.getYear());
    System.out.println("New Student Address : "+ S.getAddress());
    System.out.println("New Student Total : "+ S.getTotal());
    System.out.println("New GPA : "+ S.calGPA());


    System.out.println("\n\nClass : Faculty ");
    System.out.print("Enter Faculty Name : ");
    name = in.next();
    System.out.print("Enter Faculty Address : ");
    in.nextLine();
    address = in.nextLine();
    System.out.print("Enter Faculty Gender ( M / F ) : ");
    gender = in.next().charAt(0);
    System.out.print("Enter Faculty Aadhar : ");
    aadhar = in.nextInt();
    System.out.print("Enter Faculty Designation : ");
    designation = in.next();
    System.out.print("Enter Faculty Department : ");
    dept = in.next();
    System.out.print("Enter Faculty Basic Pay : ");
    bp = in.nextFloat();
    Faculty F = new Faculty(aadhar, name, address, gender, designation, dept, bp);
    System.out.println("\nName        : "+ F.getName());
    System.out.println("Address     : "+ F.getAddress());
    System.out.println("Gender      : "+ F.getGender());
    System.out.println("Designation : "+ F.getDesig());
    System.out.println("Basic Pay   : "+ F.getBasic());
    System.out.println("Salary      : "+ F.calSalary());

    System.out.print("\nEnter New Designation : ");
    designation = in.next();
    F.setDesig(designation);
    System.out.print("Enter New Basic pay: ");
    bp = in.nextInt();
    F.setBasic(bp);
    System.out.print("Enter New Faculty Address : ");
    in.nextLine();
    address = in.nextLine();
    F.setAddress(address);
    System.out.println("\nNew Faculty Designation : "+ F.getDesig());
    System.out.println("New Faculty Basic Pay : "+ F.getBasic());
    System.out.println("New Salary : "+ F.calSalary());
    System.out.println("New Faculty Address :"+ F.getAddress());
  }
}