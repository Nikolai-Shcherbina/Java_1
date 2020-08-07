package lesson_04;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4. Вывести при помощи методов из пункта 3 ФИО и возраст.
 * 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 * 7. * Подсчитать средние арифметические зарплаты и возраста
 * 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
 *    присваивался личный уникальный идентификационный порядковый номер
* */
public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov", 55_000.00f, 35);
        System.out.print("emploee1: " + "surname - " + employee1.getSurname() + " age - " + employee1.getAge());
        Employee[] arrayPerson = new Employee[5];
        arrayPerson[0] = new Employee("Petrov", 35000.00f, 25);
        arrayPerson[1] = new Employee("Zyulin", 65000.00f, 27);
        arrayPerson[2] = new Employee("Semenov", 66000.00f, 34);
        arrayPerson[3] = new Employee("Golubev", 58000.00f, 35);
        arrayPerson[4] = new Employee("Filyakin", 61000.00f, 32);



/*        for (int i = 0; i < arrayPerson.length; i++) {
            arrayPerson[i] = new Employee();
        }*/




    }
}
