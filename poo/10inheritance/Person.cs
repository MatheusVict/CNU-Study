using System;

public class Person
{
    protected string name;
    protected int age;

    protected void sayName()
    {
        Console.WriteLine("My name is " + name + " and I am " + age + " years old.");
    }
}