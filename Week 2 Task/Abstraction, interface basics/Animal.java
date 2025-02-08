abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }
}

class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
