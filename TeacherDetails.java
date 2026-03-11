import java.util.Scanner;
class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empid, String name, double salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("EmpID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("----------------------");
    }
}

public class TeacherDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for(int i=0;i<n;i++) {
            System.out.println("Enter details of teacher " + (i+1));

            System.out.print("Empid: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String addr = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id,name,sal,addr,dept,sub);
        }

        System.out.println("\nTeacher Details");
        for(int i=0;i<n;i++) {
            t[i].display();
        }

        sc.close();
    }
}
