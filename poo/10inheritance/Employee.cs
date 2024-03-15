using System;

public class Employee : Person
{
    private double salary;

    public Employee(string name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;

        sayName();
        employeeMessage();
    }

    private void employeeMessage()
    {
        Console.WriteLine("Salary: " + salary);
    }
}