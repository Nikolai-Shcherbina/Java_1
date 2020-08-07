package lesson_04;

public class Employee {
    String surname;
    float salary;
    int age;

    Employee(String surname, float salary, int age){
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getSurname(){
        return this.surname;
    }


}
