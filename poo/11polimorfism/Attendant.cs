using System;

class Attendant: Tax
{
    public override void valeuAddedTax(double salary) 
    {
        Console.WriteLine("Attendant VAT is R$ " + salary * 0.12);
    }
}