using System;

namespace _13abstration
{
    class Program
    {
        static void Main(string[] args)
        {
            Pj pj = new Pj();
            Clt clt = new Clt();

            pj.tax(1000);
            clt.tax(1000);
        }
    }
}