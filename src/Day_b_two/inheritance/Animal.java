package Day_b_two.inheritance;

public class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows: Meow Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.speak();
        myCat.speak();
    }
}
