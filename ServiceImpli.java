package department.department_employee.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import department.department_employee.Entity.Department;
import department.department_employee.Repository.DepartmentRepo;

@org.springframework.stereotype.Service
public class ServiceImpli implements DepartService {

	@Autowired
	DepartmentRepo departmentRepo;

	
	//save departEmployee
	@Override
	public Department saveDepart(Department department) {

		return departmentRepo.save(department);
	}

	//get departEmployee..
	@Override
	public List<Department> fetchDepart() {
		return departmentRepo.findAll();
	}

	//get departEmployee by each....
	@Override
	public Department fetchById(Long Id) {

		return departmentRepo.findById(Id).get();
	}
	
	//delete departEmployee by each..

	@Override
	public String deleteUserEntity(Long Id) {
		
		departmentRepo.deleteById(Id);
		return "delete user successfully....";
	}

	
	//update record using PutMethod....
	@Override
	public Department updateDepart(Long Id, Department department) {
		
		Department depart=departmentRepo.getById(Id);
		
		if(Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName())) {
			depart.setName(department.getName());
		}
		
		if(Objects.nonNull(department.getEmail()) && !"".equalsIgnoreCase(department.getEmail())) {	
			depart.setEmail(department.getEmail());
		}
		
		if(Objects.nonNull(department.getEmail()) && !"".equalsIgnoreCase(department.getPassword())) {
			depart.setPassword(department.getPassword());	
		}
		
		
		if(Objects.nonNull(department.getCode()) && !"".equalsIgnoreCase(department.getCode())) {	
			depart.setCode(department.getCode());	
		}
		
		if(Objects.nonNull(department.getLocation()) && !"".equalsIgnoreCase(department.getLocation())) {	
			depart.setLocation(department.getLocation());
			
		}
		
		return departmentRepo.save(depart);
		
	}

	//fetch  departEmployee by name.....
//	@Override
//	public Department fetchDepartmentByName(String Name) {
//		
//		return departmentRepo.findByDepartmentNameIgnoreCase(Name);
//	}


}
