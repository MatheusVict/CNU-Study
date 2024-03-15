using System;

namespace _13abstration
{
    abstract class Default
    {
        // required
        public abstract void tax(double value);

        // optional
        public void calculate(double value, double tax)
        {
            Console.WriteLine(value * tax);
        }
    }
}