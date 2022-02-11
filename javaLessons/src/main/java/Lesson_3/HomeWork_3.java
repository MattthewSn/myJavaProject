package Lesson_3;
 /*   1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
      2.Конструктор класса должен заполнять эти поля при создании объекта.
      3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
      4.Создать массив из 5 сотрудников.
      5. 5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

public class HomeWork_3 {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new Employee("Barak Борисович Obama ", "driver ", "capitan@merica.com ", "+10010001", 7777, 39);
        array[1] = new Employee("Михаил Иванович Распутин ", "pilot ", "pilotB@tuta.ru ", "+7654321", 100000000, 41);
        array[2] = new Employee("Султан Анатольевич Накаев ", "driver ", "email@.com ", "+72445566", 666, 37);
        array[3] = new Employee("Григорий Александрович Воробьёв ", "handyman ", "first@ndlast.ru ", "+37600001", 500, 45);
        array[4] = new Employee("Кымчын Ченынович Ирсын ", "cook ", "1@.nk", "+1441411", 100, 40);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                array[i].employeeInfo();
            }

        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void employeeInfo() {
        System.out.println(" Имя сотрудника: " + name + " Должность сотрудника: " + position + " email: " + email + " Номер: " + number + " ЗП: " + salary + " Возраст " + age);

    }

}
