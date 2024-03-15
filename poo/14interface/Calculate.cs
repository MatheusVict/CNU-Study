using System;

class Calculate : IDefault
{
    public void sum(int n1, int n2) 
    {
        Console.WriteLine("Sum: " + (n1 + n2));
    
    }

    public  void sub(int n1, int n2) {
        Console.WriteLine("Sub: " + (n1 - n2));
    }
}