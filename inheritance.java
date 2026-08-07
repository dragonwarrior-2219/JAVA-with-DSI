class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow Moos");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
        a = new Cow();
        a.sound();
    }
}
