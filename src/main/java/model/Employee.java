package model;

public class Employee {

    private String name;
    private Integer id;
    private DepartmentTypeEnum department;


    public Employee(String name, Integer id, DepartmentTypeEnum department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DepartmentTypeEnum getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentTypeEnum department) {
        this.department = department;
    }

    public String toString() {
        return "name:" + name + "- id:" + id + "- Department:" + department;
    }
}
