package sk.akademiasovy.Abstract;

public class Teacher extends Person {
    private double Salary;

    public int getSalary() {
        return (int) Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public void info() {
        System.out.println("I am Teacher");
    }
}
