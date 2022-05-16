package hu.webuni.hr.Jozsi;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Employee {
	private String name;
	private float salary;
	private LocalDateTime  localDateTime;
	
	
	public Employee(String name, float salary, LocalDateTime localDateTime) {
		super();
		this.name = name;
		this.salary = salary;
		this.localDateTime = localDateTime;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(float salary) {
		super();
		this.salary = salary;
	}

	
	
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	

}
