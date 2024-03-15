using System;

namespace _13abstration
{
    class Clt : Default
    {
        public override void tax(double value)
        {
            Console.WriteLine("Tax for CLT: " + value * 0.2);
        }
    }
}