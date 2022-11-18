package department.department_employee.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import department.department_employee.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

	
//	public Department findByDepartmentName(String Name);
//	
//	public Department findByDepartmentNameIgnoreCase(String Name);
	
	public Department findByEmail(String email);

    
}
