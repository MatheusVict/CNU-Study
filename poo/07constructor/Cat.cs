public class Cat 
{
    public string name { get; set; }
    public int age { get; set; }

    public Cat(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this.name = "no name";
        this.age = 0;
    }
}