package lesson_04;

public class Employee {
    private String surname;
    private float salary;
    private int age;

    Employee(String surname, float salary, int age){
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public String getSurname(){
        return this.surname;
    }


}
