using System;

namespace _04exercise
{
    public class Prgram
    {
        public static void Main(string[] args) 
        {
            Person person = new Person(106, 1.85);

            Console.WriteLine(person.imc());
            Console.WriteLine(person.situation());
        }
    }
}
