package lesson_05;

public class Animal {
    protected String name;
    protected int age;
    protected String typeAnimal;
    private final int maxRun;
    private final int maxSwim;
    private final float maxJump;

    protected Animal(String name, int age, String typeAnimal,
                     int maxRun, int maxSwim, float maxJump) {
        this.name = name;
        this.age = age;
        this.typeAnimal = typeAnimal;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    protected void run(int run) {
        if (run <= maxRun)
            System.out.println(typeAnimal + " " + name + " Пробежал! " + run);
        else System.out.println(typeAnimal + " " + name + " не может пробежать! " + run);
    }

    protected void swim(int swim) {
        if (swim <= maxSwim)
            System.out.println(typeAnimal + " " + name + " Проплыл! " + swim);
        else System.out.println(typeAnimal + " " + name + " не может проплыть! " + swim);
    }

    protected void jump(float jump) {
        if (jump <= maxJump)
        System.out.println(typeAnimal + " " + name + " Прыгнул! " + jump);
        else System.out.println(typeAnimal + " " + name + " не может прыгнуть! " + jump);
    }
}
