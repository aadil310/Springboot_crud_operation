
package department.department_employee.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import department.department_employee.Entity.Department;
import department.department_employee.service.DepartService;
import java.util.List;

import javax.validation.Valid;

@RestController
@CrossOrigin
public class DepartmentController {
	
	@Autowired
	public DepartService departService;
	
	
	@PostMapping("/addDepart")
	public String saveDepart(@RequestBody Department department) {
		departService.saveDepart(department);
		return "Department added succesfully";
	}
	
	@GetMapping("/addDepart")
	public List<Department> fetchDepart(){
		return departService.fetchDepart();	
	}
	
	@GetMapping("/addDepart/{id}")
	public Department fetchById(@PathVariable("id") Long Id){
		return departService.fetchById(Id);
	}
	
//	@GetMapping("/addDepart/name/{name}")
//	public Department fetchDepartmentByName(@PathVariable("name") String Name){
//		return departService.fetchDepartmentByName(Name);
//	}
	

	@DeleteMapping("/deleteDepart/{id}")
	public String deleteUserEntity(@PathVariable("id") Long Id) {
		departService.deleteUserEntity(Id);
		return "User delete successfully...";
		
	}
	
	@PutMapping("/updateDepart/{id}")
	public Department updateDepart(@PathVariable("id") Long Id, @RequestBody Department department) {
		return departService.updateDepart(Id,department);
		
	}
    

}
