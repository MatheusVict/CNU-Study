using System;

namespace _01concepts;

public class Person 
{
    private string name { get; set; }
    private int age { get; set; }

    public Person() {
        name = "John";
        age = 30;
    }

    public Person(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public void message(string message) 
    {
        Console.WriteLine(message + " from " + name + " who is " + age + " years old.");
    }
}