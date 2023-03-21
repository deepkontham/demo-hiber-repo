package services;

import java.util.List;

import com.employee.dao.Employee;

public interface EmployeeServices {
	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

	List<Employee> getAll();

}
