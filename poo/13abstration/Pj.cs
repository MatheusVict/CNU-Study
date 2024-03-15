using System;

namespace _13abstration
{
    class Pj : Default
    {
        public override void tax(double value)
        {
            Console.WriteLine("Tax for PJ: " + value * 0.15);
        }
    }
}