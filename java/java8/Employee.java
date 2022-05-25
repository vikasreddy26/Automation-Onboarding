package java8;

public class Employee {
    int id;
    String name;
    String department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee (int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department= department;
    }





}
