public class Employee {
    private String fio;
    private int department;
    private float salary;
    private static int counter;
    private int id;

    public Employee(int id, String fio, int department, float salary) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void SetFIO(String FIO) {
        this.fio = FIO;
    }

    public void SetDepartment(int Department) {
        this.department = Department;
    }

    public void SetSalary(float Salary) {
        this.salary = Salary;
    }

    @Override
    public String toString() {
        return "ID:" + id + " ФИО: " + fio + " Отдел:" + department + " Зарплата:" + salary;
    }


}
