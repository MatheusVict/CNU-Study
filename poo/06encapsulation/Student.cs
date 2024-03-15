using System;

public class Student
{
    private double note1, note2;

    private double avarage() {
        return (note1 + note2) / 2;
    }

    public void situation() {
        Console.WriteLine("type the first note: ");
        note1 = double.Parse(Console.ReadLine());

        Console.WriteLine("type the second note: ");
        note2 = double.Parse(Console.ReadLine());

        Console.WriteLine("Avarage: " + avarage());
    }
}