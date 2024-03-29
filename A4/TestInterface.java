
import java.util.*;

class Person
{
    private String name;
    private String address;
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    void setAddress(String address)
    {
        this.address = address;
    }
}

class Employee extends Person
{
    private String empid;
    private String dept;
    private int basic;
    public Employee( String name, String address, String empid, String dept, int basic)
    {
        super(name, address);
        this.empid = empid;
        this.dept = dept;
        this.basic = basic;
    }
    public String getEmpid()
    {
        return empid;
    }
    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    public void setBasic(int basic)
    {
        this.basic = basic;
    }
    public int getBasic()
    {
        return basic;
    }
    public float calSalary()
    {
        float gross,ded;
        gross = basic + 0.6f*basic + 0.1f*basic;
ded = 0.085f*basic + 0.08f*basic;
return gross-ded;      
    }
}

class Faculty extends Employee
{
    private String designation;
    private String course;
    public Faculty(String name, String address, String empid, String dept, int basic, String desig, String course)
    {
        super(name, address, empid, dept, basic);
        this.designation = desig;
        this.course = course;
    }
    public String getDesig()
    {
        return designation;
    }
    public void setDesig(String desig)
    {
        this.designation = desig;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public String getCourse()
    {
        return course;
    }
    public float calSalary()
    {
        float gross,ded;
        gross = getBasic() + 0.4f*getBasic() + 0.2f*getBasic();
ded = 0.089f*getBasic() + 0.09f*getBasic();
return gross-ded;
    }
}

interface Student
{
    float[] getMarks();
    float calcGPA();
}

class ResearchAssistant extends Employee implements Student
{
    String project;
    String course;
    float[] marks;
    public ResearchAssistant(String name, String address, String empid, String dept, int basic, String project, String course, float marks[])
    {
        super(name, address, empid, dept, basic);
        this.project = project;
        this.course = course;
        this.marks = marks;
    }
    public String getProject()
    {
        return project;
    }
    public String getCourse()
    {
        return course;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public float[] getMarks()
    {
        return marks;
    }
    public float calcGPA()
    {
        float totalmark=0;
        for(int i=0;i<3;i++)
            totalmark+=marks[i];
        if(totalmark == 100)
return 10.0f;
else if(totalmark > 90)
return 9.0f;
else if(totalmark > 80)
return 8.0f;
else if(totalmark > 70)
return 7.0f;
else
return 5.0f;
    }
    public float calSalary()
    {
        float gross,ded;
        gross = getBasic() + 0.3f*getBasic() + 0.1f*getBasic();
ded = 0.095f*getBasic() + 0.09f*getBasic();
return gross-ded;
    }
}

public class TestInterface
{
    static Scanner in = new Scanner(System.in);
    static String name, address, empid, dept, desig, course, project;
    static int basic;
    static float marks[] = new float[3];
    public static void main(String[] args)
    {
        System.out.println("Class : Employee ");
        System.out.print("Enter Name : ");
        name = in.nextLine();
        System.out.print("Enter Address : ");
        address = in.nextLine();
        System.out.print("Enter Emp ID : ");
        empid = in.next();
        System.out.print("Enter Department : ");
        dept = in.next();
        System.out.print("Enter Basic : ");
        basic = in.nextInt();
        Employee E = new Employee(name, address, empid, dept, basic);
        System.out.println("\nName      : "+ E.getName());
        System.out.println("Address   : "+ E.getAddress());
        System.out.println("Emp ID    : "+ E.getEmpid());
        System.out.println("Department: "+E.getDept());
        System.out.println("Basic     : "+ E.getBasic());
        System.out.println("Salary    : "+ E.calSalary());
       
        System.out.println("\nClass : Faculty ");
        in.nextLine();
        System.out.print("Enter Name : ");
        name = in.nextLine();
        System.out.print("Enter Address: ");
        address = in.nextLine();
        System.out.print("Enter Emp ID: ");
        empid = in.next();
        System.out.print("Enter Department: ");
        dept = in.next();
        System.out.print("Enter Designation: ");
        in.nextLine();
        desig = in.nextLine();
        System.out.print("Enter Course: ");
        course = in.next();
        System.out.print("Enter Basic: ");
        basic = in.nextInt();
        Faculty F = new Faculty(name, address, empid, dept, basic, desig, course);
        System.out.println("\nName       : "+ F.getName());
        System.out.println("Address    : "+ F.getAddress());
        System.out.println("Emp ID     : "+ F.getEmpid());
        System.out.println("Department : "+F.getDept());
        System.out.println("Designation: "+F.getDesig());
        System.out.println("Course     : "+F.getCourse());
        System.out.println("Basic      : "+ F.getBasic());
        System.out.println("Salary     : "+ F.calSalary());
       
       
        System.out.println("\nClass : Research Assistant ");
        System.out.print("Enter Name : ");
        in.nextLine();
        name = in.nextLine();
        System.out.print("Enter Address: ");
        address = in.nextLine();
        System.out.print("Enter Emp ID: ");
        empid = in.next();
        System.out.print("Enter Department: ");
        dept = in.next();
        System.out.print("Enter Project: ");
        project = in.next();
        System.out.print("Enter Course: ");
        course = in.next();
        System.out.print("Enter Basic: ");
        basic = in.nextInt();
        System.out.println("Enter Marks: ");
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Mark for Subject "+(i+1)+" : ");
            marks[i]=in.nextInt();
        }
        ResearchAssistant R = new ResearchAssistant(name, address, empid, dept, basic, project, course,marks);
        System.out.println("\nName       : "+ R.getName());
        System.out.println("Address    : "+ R.getAddress());
        System.out.println("Emp ID     : "+ R.getEmpid());
        System.out.println("Department : "+R.getDept());
        System.out.println("Basic      : "+ R.getBasic());
        System.out.println("Project    : "+R.getProject());
        System.out.println("Course     : "+R.getCourse());
        marks = R.getMarks();
        for(int i=0;i<3;i++)
        {
            System.out.println("Subject "+(i+1)+" Mark : "+marks[i]);
        }
        System.out.println("GPA        : "+ R.calcGPA());
        System.out.println("Salary     : "+ R.calSalary());
    }
   
}