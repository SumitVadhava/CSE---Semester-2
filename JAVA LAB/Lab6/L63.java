package Lab6;
import java.util.Scanner;
class Member {
    String name;
    int age;
    long phone_number;
    String Address;
    long Salary;
    Scanner sc = new Scanner(System.in);
    Member() {
        String Employee="Employee";
        String Manager="Manager";
        System.out.println("Enter Which Member data you entered Employee/Manager =");
        String member_verify = sc.nextLine();
        if (member_verify.equals(Employee)) {
            System.out.println("Enter Employee Name =");
            name = sc.nextLine();
            System.out.println("Enter Employee Age =");
            age = sc.nextInt();
            System.out.println("Enter Employee Phone_Number =");
            phone_number = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter Employee Address =");
            Address = sc.nextLine();
            System.out.println("Enter Employee Salary =");
            Salary = sc.nextLong();
        } 
        else if(member_verify.equals(Manager)) {
            System.out.println("Enter Manager Name =");
            name = sc.nextLine();
            System.out.println("Enter Manager Age =");
            age = sc.nextInt();
            System.out.println("Enter Manager Phone_Number =");
            phone_number = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter Manager Address =");
            Address = sc.nextLine();
            System.out.println("Enter Manager Salary =");
            Salary = sc.nextLong();
        }

    }
    public void print_Salary() {
        System.out.println("Salary=" + Salary);
    }
}
class Employee extends Member {
    Scanner sc = new Scanner(System.in);
    String specialization;
    Employee() {
        super();
        System.out.println("Enter Employee specialization = ");
        specialization = sc.nextLine();
    }
    public void Empolyee_data() {
        System.out.println("Employee Name = " + name);
        System.out.println("Employee Age = " + age);
        System.out.println("Employee phone_number = " + phone_number);
        System.out.println("Employee Address = " + Address);

    }
    public void Employee_print_specialization() {
        System.out.println("Employee Specialization = " + specialization);
    }
}
class Manager extends Member {
    Scanner sc = new Scanner(System.in);
    String specialization;
    Manager() {
        super();
        System.out.println("Enter Manager Department = ");
        specialization = sc.nextLine();

    }
    public void Manager_data() {
        System.out.println("Manger Name = " + name);
        System.out.println("Manager age = " + age);
        System.out.println("Manager phone_number = " + phone_number);
        System.out.println("Manager Address = " + Address);

    }
    public void Manager_print_Department() {
        System.out.println("Manager Department=" + specialization);
    }
}
public class L63 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        System.out.println("-----------------------------------");
        System.out.println("Employee Data:");
        e.Empolyee_data();
        e.print_Salary();
        e.Employee_print_specialization();
        System.out.println("-----------------------------------");
        System.out.println("Manager Data:");
        m.Manager_data();
        m.print_Salary();
        m.Manager_print_Department();

    }
}
