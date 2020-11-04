package Polymorphism1;

public class demoo1Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //向下转型，进行还原
        Cat cat = (Cat)animal;
        cat.catchMouse();
    }
}


