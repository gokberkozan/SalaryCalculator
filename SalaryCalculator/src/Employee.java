public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Tax calculation
    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    // Bonus Calculation
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30.0;
        } else {
            return 0;
        }
    }

    // Raise Salary Calculation
    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - hireYear;

        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return salary * 0.1;
        } else if (workYear > 19) {
            return salary * 0.15;
        }
        return 0;
    }

    // Printing
    public void printEmployeeInformation() {
        double salaryTaxBonus = this.salary - tax() + bonus();
        double totalSalary = salaryTaxBonus + raiseSalary();

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Increase: " + raiseSalary());
        System.out.println("Salary with Tax & Bonuses: " + salaryTaxBonus);
        System.out.println("Total Salary: " + totalSalary);

    }

}