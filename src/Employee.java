public class Employee {
    private String FIO;
    private int Department;
    private float Salary;
    private static int Counter;
    private int Id;

    public Employee( String FIO, int Department, float Salary ) {
        this.FIO = FIO;
        this.Salary = Salary;
        this.Department = Department;
        Id = ++Counter;
    }
    public int getId() { return this.Id; }
    public String getFIO() { return this.FIO; }
    public int getDepartment() { return this.Department; }
    public float getSalary() { return this.Salary; }
    public void SetFIO(String fio) { this.FIO = fio; }
    public void SetDepartment(int department) { this.Department = department; }
    public void SetSalary(float salary) { this.Salary = salary; }
    @Override
    public String toString() {
        return " ФИО: " + FIO + " Отдел: " + Department + " Зарплата: " + Salary;
    }



}
