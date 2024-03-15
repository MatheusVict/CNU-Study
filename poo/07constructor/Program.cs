using System;

namespace _07constructor
{
    class Program
    {
        static void Main(string[] args)
        {
            Cat cat1 = new Cat("Miau", 3);
            Cat cat2 = new Cat();

            Console.WriteLine(cat1.name);
        }
    }
}