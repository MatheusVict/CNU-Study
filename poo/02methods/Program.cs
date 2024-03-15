using System;

namespace _02methods
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Person person = new Person();
            person.greeting();
            person.greeting("Hello World!");
            person.greeting("Hello", "Matheus");
            person.greeting("Hello", "Matheus", 20);
        }
    }
}

