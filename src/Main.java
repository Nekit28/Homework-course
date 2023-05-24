public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Батура Никита Александрович ", 1, 65700f);
        employees[1] = new Employee("Иванов Сергей Фёдорович ", 2, 55000f);
        employees[2] = new Employee("Петрова Анна Сергеевна ", 3 ,  45100f);
        employees[3] = new Employee("Бабкина Светлана Николаевна ", 4, 50120f);
        employees[4] = new Employee("Овчинников Денис Иванович ", 4, 38455);
        employees[5] = new Employee("Павлов Анатолий Владимирович ", 6, 44700f);
        employees[6] = new Employee("Немерова Елена Геннадьевна ", 7, 62204f);
        employees[7] = new Employee("Ларин Николай Анатольевич ", 8, 41100f);
        employees[8] = new Employee("Васильев Олег Сергеевич ", 9 , 37000f);
        employees[9] = new Employee("Сидоров Михаил Степанович ", 10 , 58900f);
        for (Employee a : employees) {
            System.out.println(a);
        }




    }
}