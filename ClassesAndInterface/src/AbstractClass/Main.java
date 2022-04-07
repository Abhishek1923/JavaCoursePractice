package AbstractClass;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        AbstractClass.Parrot parrot = new AbstractClass.Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        AbstractClass.Penguin penguin = new AbstractClass.Penguin("Emperor");
        penguin.fly();
    }
}
