import java.util.*;

public class Electricitybill {
    public static void main(String[] args) {
        // TODO code application logic here
        int no;
        String name;
        float prev;
        float curr;
        String type;
            Scanner in=new Scanner(System.in);
            System.out.print("Enter Customer Name :");
            name=in.nextLine();
            System.out.print("Enter Customer Number :");
            no=in.nextInt();
            System.out.print("Enter Previous Reading :");
            prev=in.nextFloat();
            System.out.print("Enter Current Reading :");
            curr=in.nextFloat();
            in.nextLine();
            System.out.print("Enter Type :");
            type=in.nextLine();
        Details rec=new Details(name,no,prev,curr,type);
        rec.ans();
        rec.bill();
    }
}

class Details{
    private int c_no;
    private String c_name;
    private float prev;
    private float curr;
    private String type;
    private double amount;
    private float diff;

    void ans()
    {
        if(type.equals("domestic"))
        {
            if(diff<=100)
            {
                amount=diff*1;
            }
            else if(diff>100 && diff<=200)
            {
                amount=100+(diff-100)*2.5;
            }
            else if(diff>200 && diff<=500)
            {
                amount=100 + 100*2.5 + (diff-200)*4;
            }
            else if(diff>500)
            {
                amount=100 + 100*2.5 + 300*4 +(diff-500)*4;
            }
        }
        else if(type.equals("commercial"))
        {
            if(diff<=100)
            {
                amount=diff*2;
            }
            else if(diff>100 && diff<=200)
            {
                amount=200+(diff-100)*4.5;
            }
            else if(diff>200 && diff<=500)
            {
                amount=200 + 100*4.5 + (diff-200)*6;
            }
            else if(diff>500)
            {
                amount=200 + 100*4.5 + 300*6 +(diff-500)*7;
            }
        }
    }
   
    void bill()
    {
        System.out.println();
        System.out.println("***********Electricity Bill***********");
        System.out.println();
        System.out.println("Customer No : "+c_no);
        System.out.println("Customer Name : "+c_name);
        System.out.println("Connection Type : "+type);
        System.out.println("Prev Reading : "+prev);
        System.out.println("Curr Reading : "+curr);
        System.out.println("Total Units : "+diff);
        System.out.println("TARIFF : "+amount);
    }
   
    public Details(String name,int no,float p,float c,String t)
    {
        c_name=name;
        c_no=no;
        prev=p;
        curr=c;
        type=t;
        diff=curr-prev;
        amount=0;
    }  
}