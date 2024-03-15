using System;

namespace _03school
{
    public class Student
    {
        private string Name { get; set; }
        public double note1, note2;

        public Student(string name, double note1, double note2)
        {
            Name = name;
            this.note1 = note1;
            this.note2 = note2;
        }

        public double avarenge()
        {
            return (note1 + note2) / 2;
        }

        public string result(double avarenge) {
            return avarenge >= 7 ? "Approved": "Reproved";
        }

        public void message() 
        {
            double avarengeStudent = avarenge();

            string situation = result(avarengeStudent);

            Console.WriteLine($"The student {Name} has an avarenge of {avarengeStudent} and is {situation}");  
        }


    }
}