public class Main {
    public static void main(String[] args) {
        taskk1();
        task2();
        task3();
    }
    public static void taskk1 () {
        System.out.println("Задача 1");
         /*
        * Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: «ФИО сотрудника — …».*/
        String firstName = "Иванов";
        String middleName = "Иван";
        String lastName = "Иванович";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}