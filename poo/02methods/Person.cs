using System;

namespace _02methods
{
    public class Person
    {

        public void greeting()
        {
            Console.WriteLine("Hello World!");
        }
        public void greeting(string message)
        {
            Console.WriteLine(message);
        }
        public void greeting(string message, string name)
        {
            Console.WriteLine(message + " " + name);
        }
        public void greeting(string message, string name, int age)
        {
            Console.WriteLine(message + " " + name + " who is " + age + " years old.");
        }
    }
}