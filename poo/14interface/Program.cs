using System;

namespace _14interface
{
    class Program
    {
        static void Main(string[] args)
        {
            IDefault calculate = new Calculate();
            calculate.sum(10, 5);
            calculate.sub(10, 5);
        }
    }
}