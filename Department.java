package department.department_employee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
@Table(name = "department")
@CrossOrigin
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Name;
	private String email;
	private String password;
	private String code;
	private String location;
	
	
	public Department() {
		super();
	}


	public Department(Long id, String name, String email, String password, String code, String location) {
		super();
		Id = id;
		Name = name;
		this.email = email;
		this.password = password;
		this.code = code;
		this.location = location;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Name=" + Name + ", email=" + email + ", password=" + password + ", code="
				+ code + ", location=" + location + "]";
	}
	
	
	
	
	
	

	
	
	


}
