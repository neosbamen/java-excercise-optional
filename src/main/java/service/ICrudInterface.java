package service;

import model.Employee;

import java.util.Optional;

public interface ICrudInterface {

    Boolean createEmployee(Employee employee);
    Optional<Employee> readEmployee(String name);
    Optional<Employee> uploadingEmployee(String name, Employee employee);
    boolean deleteEmployee(String name);
}
