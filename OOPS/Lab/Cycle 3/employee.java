import java.util.*;
class employee
 {
   String name;
   int age;
   long phn_no;
  String address;
   double salary;
    void printsalary()
  {
    System.out.println("The salary of the employee is"+salary);
   }
 }
  class officer extends employee
  {
    String specialization;
    String department;
    }
   class manager extends employee
  {
    String specialization;
    String department;
    }
    class data
    {
     public static void main(String ar[])
     {
    Scanner sc=new Scanner(System.in);
    officer of =new officer(); 
    System.out.println("Enter the name of the officer");
    of.name=sc.next();
    System.out.println("Enter the age of the officer");
    of.age=sc.nextInt();
    System.out.println("Enter the phone number of the officer");
    of.phn_no=sc.nextInt();
    System.out.println("Enter the address of the officer");
   of.address=sc.next();
   System.out.println("Enter the salary of the officer");
    of.salary=sc.nextDouble();
    System.out.println("Enter the specialization");
    of.specialization=sc.next();
     System.out.println("Enter the department");
    of.department=sc.next();
    manager ma=new manager();
    System.out.println("Enter the name of the manager");
    ma.name=sc.next();
    System.out.println("Enter the age of the manager");
    ma.age=sc.nextInt();
    System.out.println("Enter the phone number of the manager");
    ma.phn_no=sc.nextInt();
    System.out.println("Enter the address of the manager");
   ma.address=sc.next();
   System.out.println("Enter the salary of the manager");
   ma.salary=sc.nextDouble();
   System.out.println("Enter the specialization");
    ma.specialization=sc.next();
     System.out.println("Enter the department");
    ma.department=sc.next();
    System.out.println("The data of the officer :");
     System.out.println("The name of the officer is "+of.name);
      System.out.println("The age of the officer is "+of.age);
       System.out.println("The address of the officier is"+of.address);
        System.out.println("The salary of the officer is "+of.salary);
        System.out.println("The data of the manager :");
     System.out.println("The name of the manager is "+ma.name);
      System.out.println("The age of the manager is "+ma.age);
       System.out.println("The address of the manager is "+ma.address);
        System.out.println("The salary of the manager is "+ma.salary);
     }}
   
   
