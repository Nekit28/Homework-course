public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1," Батура Никита Александрович ", 1, 65700f);
        employees[1] = new Employee(2,"Иванов Сергей Фёдорович ", 2, 55000f);
        employees[2] = new Employee(3,"Петрова Анна Сергеевна ", 3 ,  45100f);
        employees[3] = new Employee(4,"Бабкина Светлана Николаевна ", 4, 50120f);
        employees[4] = new Employee(5,"Овчинников Денис Иванович ", 4, 38455);
        employees[5] = new Employee(6,"Павлов Анатолий Владимирович ", 6, 44700f);
        employees[6] = new Employee(7,"Немерова Елена Геннадьевна ", 7, 62204f);
        employees[7] = new Employee(8,"Ларин Николай Анатольевич ", 8, 41100f);
        employees[8] = new Employee(9,"Васильев Олег Сергеевич ", 9 , 37000f);
        employees[9] = new Employee(10,"Сидоров Михаил Степанович ", 10 , 58900f);
        for (Employee a : employees) {
            System.out.println(a);
        }




    }
}