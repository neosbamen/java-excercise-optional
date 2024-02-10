import model.DepartmentTypeEnum;
import model.Employee;
import service.CrudListImpl;
import service.ICrudInterface;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Oscar",124, DepartmentTypeEnum.Developing);
        Employee employee2 = new Employee("Deisy",124, DepartmentTypeEnum.Developing);
        Employee employee3 = new Employee("Laura",124, DepartmentTypeEnum.Developing);

        ICrudInterface crudList = new CrudListImpl();

        System.out.println(crudList.createEmployee(employee1));
        System.out.println(crudList.readEmployee("Oscar"));
        crudList.createEmployee(employee1);
        System.out.println();
        System.out.println(crudList.createEmployee(employee2));
        System.out.println(crudList.readEmployee("Deisy"));
        System.out.println();
        System.out.println(crudList.uploadingEmployee("Oscar",employee3));
        System.out.println(crudList.readEmployee("Laura"));
        System.out.println(crudList.readEmployee("Oscar"));
        System.out.println();
        System.out.println(crudList.deleteEmployee("Deisy"));
        System.out.println(crudList.readEmployee("Deisy"));




    }
}