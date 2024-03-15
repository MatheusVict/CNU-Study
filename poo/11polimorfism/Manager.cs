using System;


class Manager: Tax
{
    public override void valeuAddedTax(double salary)
    {
        Console.WriteLine("manager VAT is R$ " + salary * 0.15);
    }
}