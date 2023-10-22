package SRP;

public class EmployeeSalaryCalculate {
    // ������ ����� ����� ��� ���������� ����� ���������. � ������ Employee ���� ���� ���������������
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
