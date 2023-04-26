package Assignment7_9_17;

sealed interface Animal permits Dog, Cat, Bird {
    void makeSound();
}


final class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}


final class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


final class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}


public class Ques12 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();


        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}