public class Main {

    public static void printSeparator() {
        System.out.println("=================================================================");
    }
    public static void printEmployeeWithMinimumSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee.toString());
    }
    public static void printEmployeeWithMaximumSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.toString());
    }
    public static void sumSalary(Employee[] employees) {
        float sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary = sumSalary + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);
    }
    public static void middleSalary(Employee[] employees) {
        float middleSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            middleSalary = middleSalary + employees[i].getSalary() / 10;
        }
        System.out.println("Среднее значение зарплат: " + middleSalary);
    }



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(1, "Батура Никита Александрович ", 1, 65700f);
        employees[1] = new Employee(2, "Иванов Сергей Фёдорович ", 2, 55000f);
        employees[2] = new Employee(3, "Петрова Анна Сергеевна ", 3, 45100f);
        employees[3] = new Employee(4, "Бабкина Светлана Николаевна ", 4, 50120f);
        employees[4] = new Employee(5, "Овчинников Денис Иванович ", 5, 38455f);
        employees[5] = new Employee(6, "Павлов Анатолий Владимирович ", 6, 44700f);
        employees[6] = new Employee(7, "Немерова Елена Геннадьевна ", 7, 62204f);
        employees[7] = new Employee(8, "Ларин Николай Анатольевич ", 8, 41100f);
        employees[8] = new Employee(9, "Васильев Олег Сергеевич ", 9, 37000f);
        employees[9] = new Employee(10, "Сидоров Михаил Степанович ", 10, 58900f);

        for (Employee a : employees) {
            System.out.println(a);
        }
        printSeparator();
        sumSalary(employees);
        printSeparator();
        printEmployeeWithMinimumSalary(employees);
        printSeparator();
        printEmployeeWithMaximumSalary(employees);
        printSeparator();
        middleSalary(employees);
        printSeparator();
        for (int i =0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
        printSeparator();


    }
}