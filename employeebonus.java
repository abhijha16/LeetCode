import java.util.Scanner;

class Employee {
    private int empId;
    private double salary;
    private double bonusRate;

    public Employee (int empId, double salary, double bonusRate) {
        this.empId = empId;
        this.salary = salary;
        this.bonusRate = bonusRate;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }
    
    public double getBonusRate() {
        return bonusRate;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

}

public class employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        double salary = sc.nextDouble();
        double bonusRate = sc.nextDouble();

        Employee employee = new Employee(empId, salary, bonusRate);
        employee.setBonusRate(10);

        double perfomanceScore = sc.nextDouble();

        double bonusAmount = calculateBonus(employee, perfomanceScore);

        System.out.printf("%.2f\n", bonusAmount);
        sc.close();
    }

    public static double calculateBonus(Employee emp, double perfomanceScore) {
        double bonus = (emp.getSalary() * emp.getBonusRate())/100.0;
        double bonusAmount = bonus * perfomanceScore;
        return bonusAmount;
    }
}
