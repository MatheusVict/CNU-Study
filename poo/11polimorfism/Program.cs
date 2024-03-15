using System;

namespace _11polimorfism
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Tax trainee = new Trainee();
            trainee.valeuAddedTax(1000);
            trainee.incomeTax(1000);
            Console.WriteLine(" ------- ");

            Tax manager = new Manager();
            manager.valeuAddedTax(5000);
            manager.incomeTax(5000);
            Console.WriteLine(" ------- ");

            Tax attendant = new Attendant();
            attendant.valeuAddedTax(2000);
            attendant.incomeTax(2000);

        }
    }
}