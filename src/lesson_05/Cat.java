package lesson_05;

public class Cat extends Animal {


    Cat(String name, int age, String typeAnimal, int maxRun, int maxSwim, float maxJump) {
        super(name, age, typeAnimal, maxRun, maxSwim, maxJump);
    }

    @Override
    protected void swim(int swim) {
        System.out.println(typeAnimal + " " + name + " не умеет плавать ");
    }
}
