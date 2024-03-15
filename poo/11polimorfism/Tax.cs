using System;

class Tax
{
    public virtual void valeuAddedTax(double salary)
    {
        Console.WriteLine("VAT is R$ " + salary * 0.1);
    }

    public void incomeTax(double salary)
    {
        Console.WriteLine("Income tax is R$ " + salary * 0.06);
    }
}