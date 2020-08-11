package lesson_05;

public class Cat extends Animal {


    Cat(String name, int age, String typeAnimal) {
        super(name, age, typeAnimal);
    }

    @Override
    protected void swim(int swim) {
        System.out.println(typeAnimal + " " + name + " " + " не умеет плавать ");
    }
}
