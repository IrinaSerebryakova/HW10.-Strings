
public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf( "ФИО сотрудника - %s.\n", fullName);

//task 2
        System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s.\n", fullName.toUpperCase());

//task 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullNameRefactor = fullName1.replace("ё","e");
        System.out.printf("Данные ФИО сотрудника – %s.\n", fullNameRefactor);

    }
}