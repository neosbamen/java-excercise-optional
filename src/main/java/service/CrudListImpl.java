package service;
import model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CrudListImpl implements ICrudInterface{

    final private List<Employee>employeeList;

    public CrudListImpl(){
        employeeList=new ArrayList<>();
    }

    @Override
    public Boolean createEmployee(Employee employee) {

        boolean anyMatchByName = this.employeeList.stream().anyMatch(e->e.getName().equals(employee.getName()));

        if (!anyMatchByName){
            this.employeeList.add(employee);
            System.out.println("Employee created");
            return true;
        }
        System.out.println("Employee already exist");
        return false;
    }

    @Override
    public Optional<Employee> readEmployee(String name) {

        /* Employee employeeRead=filterEmployee.get();
            System.out.println(employeeRead.getName());
            System.out.println(employeeRead.getId());
            System.out.println(employeeRead.getDepartment());*/
        return this.employeeList.stream().filter(e->e.getName().equals(name)).findAny();
    }
    @Override
    public Optional<Employee> uploadingEmployee(String name, Employee employee) {
        Optional<Employee> readEmployee= readEmployee(name);
        if (readEmployee.isPresent()){
            Employee setingEmployee=readEmployee.get();
            setingEmployee.setId(employee.getId());
            setingEmployee.setName(employee.getName());
            setingEmployee.setDepartment(employee.getDepartment());

            return Optional.of(setingEmployee);
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteEmployee(String name) {
           return this.employeeList.removeIf(e->e.getName().equals(name));
    }
}
