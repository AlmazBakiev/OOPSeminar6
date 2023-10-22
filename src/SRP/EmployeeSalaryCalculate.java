package SRP;

public class EmployeeSalaryCalculate {
    // ƒанный класс нужен дл€ разделени€ типов поведени€. ” класса Employee сво€ зона ответственности
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
