using System;

namespace _08getsetter
{
    class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person();
            person.Name = "John";
            Console.WriteLine(person.Name);
        }
    }
}