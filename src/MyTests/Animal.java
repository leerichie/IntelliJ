package MyTests;

public class Animal {
    String name;
    String gender;
    int age;

    public void eat() {
        System.out.println("I am an animal");
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void myDog() {
        System.out.println("My name is " + name);
        System.out.println("I am a " + gender);
        System.out.println("I am " + age);
    }
}
class Cat extends Animal {
    public void myCat() {
        System.out.println("My name is " + name);
        System.out.println("I am a " + gender);
        System.out.println("I am " + age);
    }
}