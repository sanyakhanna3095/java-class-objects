import  java.util.Scanner;

public class Employee {
    //Attributes
    private String name;
    private int id;
    private int salary;

    //Constructor that initialises object of Employee class
    public Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //Method to print the details of Employee
    public void displayDetails(){
        System.out.println("Employee Details :- ");
        System.out.println("Name : " + name);
        System.out.println("Employee Id : " + id);
        System.out.println("Salary : " + salary);
    }


    public static  void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take user input
        System.out.println("Enter name: " );
        String s=sc.nextLine();
        System.out.println("Enter id: " );
        int id=sc.nextInt();
        System.out.println("Enter salary: " );
        int sal=sc.nextInt();

        Employee e1=new Employee(s, id, sal);
        e1.displayDetails();
    }
}


/*
I/P ->
Enter name:
Sanya Khanna
Enter id:
2110991266
Enter salary:
45000

O/P ->
Employee Details :-
Name : Sanya Khanna
Employee Id : 2110991266
Salary : 45000
 */