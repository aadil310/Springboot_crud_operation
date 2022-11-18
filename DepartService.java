package department.department_employee.service;

import java.util.List;

import department.department_employee.Entity.Department;

public interface DepartService {

	public Department saveDepart(Department department);

	public List<Department> fetchDepart();

	public Department fetchById(Long Id);

	public String deleteUserEntity(Long Id);


	public Department updateDepart(Long Id, Department department);

//	public Department fetchDepartmentByName(String Name);

	


  
 


}
