package HomeWork_25_1.HomeWork_25_1.Service;

import HomeWork_25_1.HomeWork_25_1.Employee;
import HomeWork_25_1.HomeWork_25_1.Exception.EmployeeAlreadyAddedException;
import HomeWork_25_1.HomeWork_25_1.Exception.EmployeeNotFoundException;
import HomeWork_25_1.HomeWork_25_1.Exception.EmployeeStorageIsFullException;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee add(String firstName, String lastName, int department, int salary) throws EmployeeAlreadyAddedException, EmployeeStorageIsFullException;

    Employee find(String firstName, String lastName, int department, int salary) throws EmployeeNotFoundException;

    Employee remove(String firstName, String lastName);

    List<Employee> workerks();
}
