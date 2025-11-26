class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class ExperimentAnimal {
    public static void main(String[] args) {
        Animal Fahim = new Animal();
        Dog Shovo = new Dog();
        Cat Samiul = new Cat();

        Fahim.sound();
        Shovo.sound();
        Samiul.sound();
    }
}
