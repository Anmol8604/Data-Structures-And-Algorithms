package OOPs;

class mainClass {
    public static void main(String[] args) {
        System.out.println("\nObject Oriented Programming\n");
        // p1 is object of class Person , we need to use new keyword whenever we want to call class.
        
        // Object 1
        Person p1 = new Person();
        // Constructor used to create new objects. java by defaults gives us one constructer. new Person(), here Person() is constructor.
        p1.Name = "Anmol";
        p1.age = 19;
        p1.Occupation = "Student";
        
        System.out.println("Name : " + p1.Name);
        System.out.println("Age : " + p1.age);
        System.out.println("Job : " + p1.Occupation);
        p1.walk();
        p1.learn();

        // Object 2
        Person p2 = new Person();
        p2.Name = "Arpit";
        p2.age = 20;
        p2.Occupation = "Student";

        System.out.println("\nName : " + p2.Name);
        System.out.println("Age : " + p2.age);
        System.out.println("Job : " + p2.Occupation);
        // Function call or Method call using "."
        p2.walk();
        // Polymorphism
        p2.learn();
        p2.walk(2010);
        System.out.println(Person.count);

        Person p3 = new Person("Sahil" , 19);

        System.out.println("\nName : " + p3.Name);
        System.out.println("Age : " + p3.age);

        Devloper d1 = new Devloper(null, 0);
        d1.walk("Anmol", 18);

    }
}

// Java has only one public class by which name we have saved a file e.g Name.java , Except this we can create as much class as much we want , class doesn't store any memory in means it doenn't store any memory during run time , although it stores in programme 😅
class Person {
    String Name;
    int age;
    String Occupation;

    static int count = 0;
    public Person(){
        count++;
        System.out.println("I am Constructor..!");
    }
    public Person(String Name, int age)
    {
        this();
        this.Name = Name;
        this.age = age;
    }

    // Function or Method

    //Polymorphism
    // we have also learned Polymorphism : it means multiple forms, like here walk behaieved in two types when we pass an arguments steps in it then he returned Name walked steps, and when we call it without agrgument then it returned Name is walking.
    void walk()
    {
        System.out.println(Name + " is walking");
    }
    void learn()
    {
        System.out.println(Name + " is learning");
    }
    void walk(int steps)
    {
        System.out.println(Name + " walked " + steps);
    }
}

class Devloper extends Person{

    public Devloper(String Name, int age)
    {
        super(Name, age);
    }
    void walk(String Name, int age){
        System.out.println("Devloper "  + Name + " is walking.");
    }
}