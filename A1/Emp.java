import java.util.Date;  
import java.util.Scanner;
class Employee
{  
Scanner input=new Scanner(System.in);
  private int id;
  private float da,hra,lic,pf,hours,gross,net,hourlywage,deductions,basic;
  private String name,designation,dob,doj;
  private int years;
  int get_id()
  {
  return id;
  }
  void input()
  {
    System.out.println("\nEnter Employee Details : ");
  System.out.print("Enter Employee ID        : ");
  id=input.nextInt();
  System.out.print("Enter Employee Name      : ");
  name=input.next();
  System.out.println("Enter Employee Designation");
  System.out.print("(Manager/Intern/Others)  :");
  designation=input.next();
  System.out.print("Enter Employee DOB       : ");
  dob=input.next();
  System.out.print("Enter Employee DOJ       : ");
  doj=input.next();
  if(designation.equals("Intern"))
  {
      basic=0;
  }
  else
  {
      System.out.print("Enter Employee Basic     : ");
      basic=input.nextFloat();
  }
  System.out.print("Does Employee Opt for LIC Premium Account?\n (1. Yes / 2. No) : ");
  lic=input.nextFloat();
  if(lic==1)
  {
    System.out.print("Enter Employee LIC Amount :");
    lic=input.nextFloat();
  }
  else
  {
    lic=0;
  }
  if(designation.equals("Intern"))
  {
    System.out.print("Enter Employee Hours worked : ");
    hours=input.nextFloat();
    System.out.print("Enter Hourly wage           : ");
    hourlywage=input.nextFloat();
  }
  else
  {
    hours=0;
    hourlywage=0;
  }
}

void calc()
{
if(designation.equals("Intern"))
{
da=2000;
hra=1000;
pf=500;
gross=(hours*hourlywage)+da+hra;
deductions=lic+pf;
net=gross-deductions;
}
else if(designation.equals("Manager"))
{
da=((0.4f)*basic);
hra=((0.1f)*basic);
pf=((0.08f)*basic);
gross=basic+da+hra;
deductions=lic+pf;
net=gross-deductions;
}
else
{
da=(0.3f*basic);
hra=(0.1f*basic);
pf=(0.08f*basic);
gross=basic+da+hra;
deductions=lic+pf;
net=gross-deductions;
}
}
void payslip()
{
System.out.println("**************************************");
System.out.println("           Employer Details           ");
System.out.println("               Payslip                ");
System.out.println("Emp id            : " +id);
System.out.println("Emp name          : " +name);
System.out.println("Designation       : " +designation);
if(designation.equals("Intern"))
{
    System.out.println("Monthly Wage      : " +(hourlywage*hours));
}
else
{
    System.out.println("Basic Pay         : " +basic);
}
System.out.println("DA                : " +da);
System.out.println("HRA               : " +hra);
System.out.println("PF                : " +pf);
if(lic==0.0)
{
  System.out.println("LIC               : Not Opted");
}
else
{
System.out.println("LIC               : " +lic);
}
System.out.println("**************************************");
System.out.println("Gross Pay         : " +gross);
System.out.println("Deductions        : " +deductions);
System.out.println("Net Salary        : " +net);
System.out.println("**************************************");

}

void display()
{
    System.out.println("\n\nEmp Record ");
    System.out.println(" Emp id          : " +id);
    System.out.println(" Emp name        : " +name);
    System.out.println(" Emp Designation : " +designation);
    System.out.println(" DOB             : " +dob);
    System.out.println(" DOJ             : " +doj);
    System.out.println(" Net Pay         : "+ net);
}

void promote()
{
        String year;
        Date d=new Date();
        int year1=d.getYear();
        int last;
        last = year1 + 1900;
        year= (doj.substring(6,10));
        int first = Integer.parseInt(year);
        years = last - first;
        int ch;
        System.out.println(" Current Designation : "+ designation);
        System.out.println(" Number of years Employee worked: "+ years);
        if(designation.equals("Others"))
        {
            if((years>5))
            {
            System.out.println("Promotion to Manager Available!");
            System.out.println("Do you want to Promote individual ?(1.Yes / 2.No)");
                ch=input.nextInt();
                if(ch==1)
                {
                    designation = "Manager";
                }
            }
            calc();
        }
        else if(designation.equals("Intern"))
        {
             if(years>2)
             {
                System.out.println("Promotion to Others Available!");
                System.out.println("Do you want to Promote individual ?(1.Yes / 2.No)");
                ch=input.nextInt();
                if(ch==1)
                {
                    designation = "Others";
                    System.out.print("Enter Employee Basic     : ");
                    basic=input.nextFloat();
                }
             }
             calc();
        }
else if(designation.equals("Manager"))
{
System.out.println("Cannot Promote Further !!!");
        }
}


}
class Emp
{
public static void main(String args[])
{
   int n,id,ch;
Scanner input=new Scanner(System.in);
Employee a[]=new Employee[50];
n=0;

do
{
System.out.println("\n\tMenu ");
System.out.println("1. Enter Employee Details");
System.out.println("2. Display Emp Records ");
System.out.println("3. Generate Payslip ");
System.out.println("4. Promote an Employee ");
System.out.println("5. Exit ");
System.out.print("Enter Choice : ");
ch=input.nextInt();
if(ch==1)
{
    System.out.print("Enter the number of employees : ");
    n=input.nextInt();
    for(int i=0;i<n;i++)
    {
    a[i]=new Employee();
    a[i].input();
    a[i].calc();
    }
}
else if(ch==2)
{
    for(int i=0;i<n;i++)
    {
        a[i].display();
    }
   
}
else if(ch==3)
{
    System.out.println("Enter ID of Employee to print payslip: ");
    id=input.nextInt();
    for(int k=0;k<n;k++)
    {
        if(a[k].get_id()==id)
        {
          a[k].payslip();
          break;
        }
    }
}
else if(ch==4)
{
    System.out.println(" Enter ID of employee to promote: ");
    id=input.nextInt();
    for(int k=0;k<n;k++)
    {
        if(a[k].get_id()==id)
        {
          a[k].promote();
          break;
        }
    }
}
}while(ch!=5);
}
}