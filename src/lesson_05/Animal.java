package lesson_05;

public class Animal {
    protected String name;
    protected int age;
    protected String typeAnimal;

    protected Animal(String name, int age, String typeAnimal) {
        this.name = name;
        this.age = age;
        this.typeAnimal = typeAnimal;
    }

    protected void run(int run) {
        System.out.println(typeAnimal + " " + name + " Пробежал! " + run);
    }

    protected void swim(int swim) {
        if(typeAnimal.equalsIgnoreCase("Котик"))
            System.out.println(typeAnimal + name + " " + " не умеет плавать ");;
        System.out.println(typeAnimal + " " + name + " Проплыл! " + swim);
    }

    protected void jump(float jump) {
        System.out.println(typeAnimal + " " + name + " Прыгнул! " + jump);
    }
}
