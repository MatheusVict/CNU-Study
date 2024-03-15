using System;

namespace _04exercise
{
    public class Person
    {
        private double weight { get; set; }
        private double height { get; set; }

        public Person(double weight, double height)
        {
            this.weight = weight;
            this.height = height;
        }

        public double imc()
        {
            return weight / (height * height);
        }

        public string situation()
        {
            double imc = this.imc();

            switch (imc)
            {
                case double n when (n < 18.5):
                    return "Underweight";
                case double n when (n >= 18.5 && n < 24.9):
                    return "Normal weight";
                case double n when (n >= 25 && n < 29.9):
                    return "Overweight";
                case double n when (n >= 30 && n < 34.9):
                    return "Obesity (Class 1)";
                case double n when (n >= 35 && n < 39.9):
                    return "Obesity (Class 2)";
                case double n when (n >= 40):
                    return "Obesity (Class 3)";
                default:
                    return "";
            }
        }
    }
}