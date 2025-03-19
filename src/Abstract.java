public class Abstract {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Bob", 102, 20, 80);

        ftEmployee.calculateSalary();
        ptEmployee.calculateSalary();
    }
}

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + " (Full-Time) earns: $" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyWage * hoursWorked;
        System.out.println(name + " (Part-Time) earns: $" + salary);
    }
}
