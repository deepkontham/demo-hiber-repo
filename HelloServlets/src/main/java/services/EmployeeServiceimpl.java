package services;

import java.util.List;

import com.employee.dao.Employee;
import com.employee.dao.Employeedaoimpl;

public class EmployeeServiceimpl implements EmployeeServices {

	Employeedaoimpl emp=new Employeedaoimpl();
	@Override
	public void save(Employee employee) {
		
	}

	@Override
	public void update(Employee employee) {
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees= emp.getall();
		return employees;
	}

}
